public class CricketTicketss 
{

    String ticket[] = new String[5];
    int top = -1;

    public static void main(String[] args) 
	{

        cricketTicket c = new cricketTicket();

        c.push("Dhoni");
        c.push("Sachin");
        c.push("Dravid");
        c.push("Abdevillers");
        c.push("Gayle");
        c.push("Yuraj");

        c.pop();

        c.peek();

        c.display();
    }

    public void push(String name) 
	{

        if (top == ticket.length - 1) 
		{
            System.out.println("Ticket Full");
        }
        else 
		{
            top++;
            ticket[top] = name;
            System.out.println("Ticket Booked : " + ticket[top]);
        }
    }

    public void pop() 
	{

        if (top == -1) {
            System.out.println("No Ticket");
        }
        else {
            System.out.println("Ticket Cancelled : " + ticket[top]);
            top--;
        }
    }

    public void peek() 
	{

        if (top == -1) 
		{
            System.out.println("No Ticket");
        }
        else {
            System.out.println("Last Ticket : " + ticket[top]);
        }
    }

    public void display() 
	{

        for (int i = top; i >= 0; i--) {
            System.out.println(ticket[i]);
        }
    }
}