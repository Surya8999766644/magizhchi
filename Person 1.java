class Person 1
 {
    String name;

    Person(String name) 
	{
        this.name = name;
    }

    void displayPerson() 
	{
        System.out.println("Name : " + name);
    }
}

class Employee extends Person 
{
    double salary;

    Employee(String name, double salary) 
	{
        super(name);
        this.salary = salary;
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Employee
 {
    String department;

    Manager(String name, double salary, String department) 
	{
        super(name, salary);
        this.department = department;
    }

    void displayManager()
	{
        displayEmployee();
        System.out.println("Department : " + department);
    }
}

public class Main
 {
    public static void main(String[] args) {
        Manager m = new Manager("Arun", 75000, "IT");

        m.displayManager();
    }
}