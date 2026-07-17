import java.util.Scanner;

public class StudentMarksSystem {

    static Scanner sc = new Scanner(System.in);
    static int tamil, english, maths;

    // Method to enter marks
    static void getMarks() {
        System.out.print("Enter Tamil Mark: ");
        tamil = sc.nextInt();

        System.out.print("Enter English Mark: ");
        english = sc.nextInt();

        System.out.print("Enter Maths Mark: ");
        maths = sc.nextInt();
    }

    // Method to calculate total
    static int total() {
        return tamil + english + maths;
    }

    // Method to calculate average
    static double average() {
        return total() / 3.0;
    }

    // Method to find grade
    static void grade() {
        double avg = average();

        if (avg >= 90)
            System.out.println("Grade: A");
        else if (avg >= 75)
            System.out.println("Grade: B");
        else if (avg >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== Student Marks System =====");
            System.out.println("1. Enter Marks");
            System.out.println("2. Calculate Total");
            System.out.println("3. Calculate Average");
            System.out.println("4. Find Grade");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    getMarks();
                    break;

                case 2:
                    System.out.println("Total = " + total());
                    break;

                case 3:
                    System.out.println("Average = " + average());
                    break;

                case 4:
                    grade();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);
    }
}