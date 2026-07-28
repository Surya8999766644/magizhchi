class BankAccount 
{

    int balance = 1000;

    void deposit(int amount) 
	{
        balance = balance + amount;
        System.out.println("Amount Deposited");
    }

    void withdraw(int amount)
	{
        if (amount <= balance) 
		{
            balance = balance - amount;
            System.out.println("Amount Withdrawn");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() 
	{
        System.out.println("Balance = " + balance);
    }
}

class BankAccount {

    int balance = 1000;

    void deposit(int amount) 
	{
        balance = balance + amount;
        System.out.println("Amount Deposited");
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance()
	{
        System.out.println("Balance = " + balance);
    }
}

public class Main 
{
    public static void main(String[] args) 
	{

        BankAccount b = new BankAccount();

        // Deposit
        b.deposit(500);

        // Display Balance
        b.displayBalance();

        // Exit
        System.out.println("Exit");
    }
}