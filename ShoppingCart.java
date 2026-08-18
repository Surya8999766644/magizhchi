class ShoppingCart 
{
    String cartOwnerName;

    class Item 
	{
        String itemName;
        int quantity;
        double[] priceHistory;

        void display() 
		{
            double latest = priceHistory[priceHistory.length - 1];

            System.out.println("Cart Owner: " + cartOwnerName);
            System.out.println("Item Name: " + itemName);
            System.out.println("Quantity: " + quantity);

            System.out.print("Price History: ");
            for (double p : priceHistory)
                System.out.print(p + " ");

            System.out.println("\nLatest Price: " + latest);
            System.out.println("Total Bill: " + (latest * quantity));
        }
    }

    public static void main(String[] args) 
	{

        ShoppingCart cart = new ShoppingCart();
        Item i = cart.new Item();

        // Direct values
        cart.cartOwnerName = "Surya";
        i.itemName = "Laptop";
        i.quantity = 2;
        i.priceHistory = new double[]{45000, 47000, 50000};

        i.display();
    }
}