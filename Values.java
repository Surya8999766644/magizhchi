class Box<T> 
{
    T value;

    void store(T value) 
	{
        this.value = value;
    }

    void display() 
	{
        System.out.println("Value: " + value);
    }
}

public class GenericStorageBox 
{
    public static void main(String[] args) {

        int choice = 1;

        switch (choice) 
		{

            case 1:
                Box<Integer> intBox = new Box<>();
                intBox.store(100);
                intBox.display();
                break;

            case 2:
                Box<String> stringBox = new Box<>();
                stringBox.store("Hello");
                stringBox.display();
                break;

            case 3:
                System.out.println("Display Value");
                break;

            case 4:
                System.out.println("Exit");
                break;

            
        }
    }
}