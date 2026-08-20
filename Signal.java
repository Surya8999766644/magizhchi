enum Signal 
{
        RED, YELLOW, GREEN
}

public class TrafficSignalSystem 
{
    public static void main(String[] args) 
	
	
	
	{

        int choice = 1;
        Signal signal = Signal.RED;

        switch (choice) 
		{

            case 1:
                System.out.println("Signal: " + signal);
                if (signal == Signal.RED)
                    System.out.println("Meaning: STOP");
                else if (signal == Signal.YELLOW)
                    System.out.println("Meaning: WAIT");
                else
                    System.out.println("Meaning: GO");
                break;
				
				

            case 2:
                if (signal == Signal.RED)
                    System.out.println("STOP");
                else if (signal == Signal.GREEN)
                    System.out.println("GO");
                else
                    System.out.println("WAIT");
                break;

            case 3:
                System.out.println("Exit");
                break;

            
        }
    }
}