import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][3];

        System.out.println("Enter 6 numbers:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int largest = arr[0][0];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {

                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                }

            }
        }

        System.out.println("Largest = " + largest);
    }
}