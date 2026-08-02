public class MainEmp {

    public static void main(String[] args) {

        FullTimeEmployee f = new FullTimeEmployee("Ravi", 50000);

        PartTimeEmployee p = new PartTimeEmployee("Kumar", 20, 500);

        System.out.println("Full Time Employee");
        f.calculateSalary();

        System.out.println();

        System.out.println("Part Time Employee");
        p.calculateSalary();
    }
}