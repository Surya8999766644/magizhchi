public class CodeGenartor 
{
    public static void main(String[] args) 
	{

        String name = "Prasanth";
        String department = "Java";
        int year = 2026;

        StringBuilder code = new StringBuilder();

        code.append(name.substring(0, 3).toUpperCase());
        code.append("-");
        code.append(department.substring(0, 3).toUpperCase());
        code.append("-");
        code.append(year);

        System.out.println("Generated Code: " + code);
    }
}