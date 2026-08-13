class College 
{

    static final String collegeName = "Rathinam Engineering College";
    final int registrationFee;
    static int totalStudents = 0;

    College(int registrationFee)
	{
        this.registrationFee = registrationFee;
        totalStudents++;
    }

    static void displayCollegeDetails()
	{
        System.out.println("College Name: " + collegeName);
        System.out.println("Total Students: " + totalStudents);
    }

    void displayStudentFee()
	{
        System.out.println("Student Registration Fee: " + registrationFee);
    }

    public static void main(String[] args) 
	{

        College student1 = new College(25000);
        College student2 = new College(30000);

        displayCollegeDetails();

        student1.displayStudentFee();
        student2.displayStudentFee();
    }
}