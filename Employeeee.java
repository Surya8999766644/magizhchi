 import java.util.*;

class Employeeee 
{
     int id;
    String name, dept;
      double basic;

    Employee(int id, String name, String dept, double basic) {
          this.id = id;
        this.name = name;
          this.dept = dept;
        this.basic = basic;
    }

    double netSalary() 
	{
        return basic + basic * 0.20 + basic * 0.10 - basic * 0.05;
    }

    void display() 
	{
        System.out.println(id + " " + name + " " + dept +
                           " Basic: " + basic +
                           " Net: " + netSalary());
    }
}

