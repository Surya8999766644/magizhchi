abstract class Employeee
{
    String name;

    Employee(String name) 
	{
        this.name = name;
    }

    abstract void calculateSalary();

    void displayEmployee() 
	{
        System.out.println("Employee Name: " + name);
    }
}

