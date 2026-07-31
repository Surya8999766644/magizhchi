public class Person
{
    String name;
    int age;

    Person(String name, int age) 
	{
        this.name = name;
        this.age = age;
    }

    void displayPerson() 
	{
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

class Student extends Person 
{
    int rollNo;
    int marks;

    Student(String name, int age, int rollNo, int marks) 
	{
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void displayStudent() 
	{
        displayPerson();
        System.out.println("Roll No : " + rollNo);
        System.out.println("Marks   : " + marks);
    }
}

public class Main 
{
    public static void main(String[] args) 
	 {
        Student s = new Student("Surya", 21, 101, 95);

        s.displayStudent();
    }
}