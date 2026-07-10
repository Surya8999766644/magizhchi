public class DigitCount {
    public static void main(String[] args) {

        int number = 987;
        int count = 0;
        int temp = number;

        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        System.out.println("Number = " + number);
        System.out.println("Number of digits = " + count);

    }
}