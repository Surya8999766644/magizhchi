public class PassByValueAndReference {

    // Pass by Value (Primitive)
    static void changeValue(int num) {
        num = 100;
        System.out.println("Inside method (Primitive): " + num);
    }

    // Array Modification
    static void modifyArray(int[] arr) {
        arr[0] = 100;
        System.out.println("Inside method (Array):");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Pass by Value (Primitive)
        int number = 10;
        System.out.println("Before method (Primitive): " + number);
        changeValue(number);
        System.out.println("After method (Primitive): " + number);

        System.out.println();

        // Array Modification
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Before method (Array): ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        modifyArray(numbers);

        System.out.print("After method (Array): ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}