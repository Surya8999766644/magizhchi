
    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentRecord {

    static final String URL = "jdbc:postgresql://localhost:5432/studentdb";
    static final String USER = "postgres";
    static final String PASSWORD = "your_password";

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            try {
                Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
                
                while (true) {
                    
                    System.out.println("\n--- Student Record ---");
                    System.out.println("1. Insert");
                    System.out.println("2. Display");
                    System.out.println("3. Update");
                    System.out.println("4. Delete");
                    System.out.println("5. Exit");
                    System.out.print("Enter choice: ");
                    
                    int choice = sc.nextInt();
                    
                    // INSERT
                    if (choice == 1) {
                        
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        
                        System.out.print("Enter Name: ");
                        String name = sc.next();
                        
                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();
                        
                        System.out.print("Enter Course: ");
                        String course = sc.next();
                        
                        String sql = "INSERT INTO student VALUES (?, ?, ?, ?)";
                        
                        PreparedStatement ps = con.prepareStatement(sql);
                        
                        ps.setInt(1, id);
                        ps.setString(2, name);
                        ps.setInt(3, age);
                        ps.setString(4, course);
                        
                        ps.executeUpdate();
                        
                        System.out.println("Student inserted successfully.");
                    }
                    
                    // DISPLAY
                    else if (choice == 2) {
                        
                        String sql = "SELECT * FROM student";
                        
                        PreparedStatement ps = con.prepareStatement(sql);
                        ResultSet rs = ps.executeQuery();
                        
                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt("id") + "  " +
                                            rs.getString("name") + "  " +
                                            rs.getInt("age") + "  " +
                                            rs.getString("course")
                            );
                        }
                    }
                    
                    // UPDATE
                    else if (choice == 3) {
                        
                        System.out.print("Enter ID to update: ");
                        int id = sc.nextInt();
                        
                        System.out.print("Enter new name: ");
                        String name = sc.next();
                        
                        System.out.print("Enter new age: ");
                        int age = sc.nextInt();
                        
                        System.out.print("Enter new course: ");
                        String course = sc.next();
                        
                        String sql = "UPDATE student SET name=?, age=?, course=? WHERE id=?";
                        
                        PreparedStatement ps = con.prepareStatement(sql);
                        
                        ps.setString(1, name);
                        ps.setInt(2, age);
                        ps.setString(3, course);
                        ps.setInt(4, id);
                        
                        int result = ps.executeUpdate();
                        
                        if (result > 0)
                            System.out.println("Student updated successfully.");
                        else
                            System.out.println("Student ID not found.");
                    }
                    
                    // DELETE
                    else if (choice == 4) {
                        
                        System.out.print("Enter ID to delete: ");
                        int id = sc.nextInt();
                        
                        String sql = "DELETE FROM student WHERE id=?";
                        
                        PreparedStatement ps = con.prepareStatement(sql);
                        
                        ps.setInt(1, id);
                        
                        int result = ps.executeUpdate();
                        
                        if (result > 0)
                            System.out.println("Student deleted successfully.");
                        else
                            System.out.println("Student ID not found.");
                    }
                    
                    // EXIT
                    else if (choice == 5) {
                        
                        System.out.println("Program exited.");
                        con.close();
                        break;
                    }
                    
                    else {
                        System.out.println("Invalid choice.");
                    }
                }
                
            } catch (SQLException e) {
                System.out.println(e);
            }

            }
}
}
