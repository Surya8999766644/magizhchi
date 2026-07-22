import java.util.Arrays;
import java.util.Scanner;

public class SearchMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int n = 0, choice, key;

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Insert Elements");
            System.out.println("2. Display Elements");
            System.out.println("3. Linear Search");
            System.out.println("4. Binary Search");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number of elements: ");
                    n = sc.nextInt();

                    System.out.println("Enter " + n + " elements:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    break;

          