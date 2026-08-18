public class MongoDb
{
    public static void main(String[] args) 
	{

           String name = "MongoDB";

          int hash = name.hashCode();

            String hex = Integer.toHexString(hash);

           System.out.println("Name: " + name);
        System.out.println("Hash Code: " + hash);
           System.out.println("Hex Code: " + hex);
    }
}