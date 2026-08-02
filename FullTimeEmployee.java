class FullTimeEmployee extends Employee
 {
    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) 
	{
        super(name);
        this.monthlySalary = monthlySalary;
    }

    void calculateSalary() 
	{
        displayEmployee();
        System.out.println("Salary = " + monthlySalary);
    }
}