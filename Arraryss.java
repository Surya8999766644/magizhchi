import java.util.Scanner;

public class Arrayss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("\n===== ARRAY MENU =====");
            System.out.println("1. Display Array");
            System.out.println("2. Find Sum");
            System.out.println("3. Find Largest Element");
            System.out.println("4. Find Smallest Element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Array Elements:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += arr[i];
                    }
                    System.out.println("Sum = " + sum);
                    break;

                case 3:
                    int largest = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] > largest) {
                            largest = arr[i];
                        }
                    }
                    System.out.println("Largest Element = " + largest);
                    break;

                case 4:
                    int smallest = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] < smallest) {
                            smallest = arr[i];
                        }
                    }
                    System.out.println("Smallest Element = " + smallest);
                    break;

                case 5:
                    System.out.println("Program Exited.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}

















































































 