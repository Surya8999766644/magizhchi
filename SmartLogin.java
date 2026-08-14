class AccountLockedException extends Exception 
{
    public AccountLockedException(String message) 
	{
        super(message);
    }
}

public class SmartLogin 
{

    public static void main(String[] args) 
	{

        String correctUsername = "admin";
        String correctPassword = "1834";

        String username = "admin";
        String password = "1555";

        int attempts = 0;

        while (attempts < 3) 
		{

            if (username.equals(correctUsername)
                    && password.equals(correctPassword)) 
					{

                System.out.println("Login Successful!");
                return;

            } else 
			{

                attempts++;
                int remaining = 3 - attempts;

                System.out.println("Incorrect username or password.");

                if (remaining > 0) 
				{
                    System.out.println("Remaining attempts: " + remaining);
                }
            }
        }

        try {
            throw new AccountLockedException(
                    "Account is locked! Maximum 3 attempts exceeded."
            );
        } catch (AccountLockedException e) 
		{
            System.out.println(e.getMessage());
        }
    }
}