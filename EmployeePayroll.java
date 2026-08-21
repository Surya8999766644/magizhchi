  public class EmployeePayroll 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        while (true) {
            System.out.println("\n1.Add  2.View  3.Search  4.Update  5.Delete  6.Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();

                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Department: ");
                String dept = sc.nextLine();

                System.out.print("Basic Salary: ");
                double basic = sc.nextDouble();

                list.add(new Employee(id, name, dept, basic));
                System.out.println("Employee Added");

            } else if (ch == 2) {
                for (Employee e : list)
                    e.display();

            } else if (ch == 3) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                for (Employee e : list)
                    if (e.id == id)
                        e.display();

            } else if (ch == 4) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                for (Employee e : list)
                    if (e.id == id) {
                        System.out.print("New Salary: ");
                        e.basic = sc.nextDouble();
                    }

            } else if (ch == 5) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                list.removeIf(e -> e.id == id);
                System.out.println("Employee Deleted");

            } else if (ch == 6) {
                break;
            }
        }
    }
}