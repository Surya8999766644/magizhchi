public class MainFunction 
{
    public static void main(String[] args) 
	{

        Student s = new Student();

        s.addStudent("Ravi", 101);
        s.displayStudent();      // 

        s.updateStudentName("Kumar");
        s.displayStudent();      //  
    }
}