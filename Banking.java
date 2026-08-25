import java.util.Scanner;

class Banking 
{

    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        int balance = 0;
        int count = 0;
        int choice;

        do {
            System.out.println("\n============= BANKING SYSTEM =============");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Transaction Count");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if (choice == 1) 
			{

                System.out.print("Enter amount: ");
                int amount = sc.nextInt();

                balance = balance + amount;
                count++;

                System.out.println("Amount deposited");

            } else if (choice == 2) 
			{

                System.out.print("Enter amount: ");
                int amount = sc.nextInt();

                if (amount <= balance)
					{
                    balance = balance - amount;
                    count++;

                    System.out.println("Amount withdrawn");
                } else
					{
                    System.out.println("Insufficient balance");
                }

            } else if (choice == 3) 
			{

                System.out.println("Balance = " + balance);

            } else if (choice == 4) 
			{

                System.out.println("Transaction Count = " + count);

            } else if (choice == 5) 
			{

                System.out.println("Thank you");

            } else 
			{

                System.out.println("Invalid choice");
            }

        } while (choice != 5);
    }
}