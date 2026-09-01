import java.util.*;

public class ProductPriceManager 
{

    public static void main(String[] args) 
	{

        Scanner sc = new Scanner(System.in);

        int[] prices = null;
        ArrayList<Integer> priceList = new ArrayList<>();

        while (true)
			{

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    int n = sc.nextInt();

                    prices = new int[n];

                    for (int i = 0; i < n; i++) 
					{
                        prices[i] = sc.nextInt();
                    }

                    System.out.println("Prices stored");
                    break;

                case 2:
                    for (int i = 0; i < prices.length; i++) 
					{
                        priceList.add(prices[i]);
                    }

                    System.out.println("Prices copied to ArrayList");
                    break;

                case 3:
                    int max = priceList.get(0);

                    for (int i = 1; i < priceList.size(); i++) 
					{
                        if (priceList.get(i) > max) {
                            max = priceList.get(i);
                        }
                    }

                    System.out.println("Maximum price = " + max);
                    break;

                case 4:
                    int removePrice = sc.nextInt();

                    priceList.remove(Integer.valueOf(removePrice));

                    System.out.println("Price " + removePrice + " removed");

                    System.out.print("Prices: ");
                    for (int price : priceList) {
                        System.out.print(price + " ");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.print("Prices: ");
                    for (int price : priceList) {
                        System.out.print(price + " ");
                    }
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Exit");
                    sc.close();
                    return;
            }
        }
    }
}