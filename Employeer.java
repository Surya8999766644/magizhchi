import java.util.Scanner;

class Employeer
{
    int id;
    String name;
    String department;

    Employee(int id, String name, String department) 
	{
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class EmployeeManagement
 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Employee[] emp = new Employee[100];
        int count = 0;

        while (true) {

            System.out.println("\n1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    emp[count] = new Employee(id, name, department);
                    count++;

                    System.out.println("Employee added.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employees available.");
                    } else {
                        for (int i = 0; i < count; i++) 
						{
                            emp[i].display();
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) 
					{
                        if (emp[i].id == searchId)
							{
                            emp[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.println("Program ended.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}