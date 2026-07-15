import java.util.Scanner;
public class SingleArray {
public static void main(String[]args){
	
	Scanner sc =new Scanner (System.in);
	int[] arr =new int[5];
	//Input
	System.out.println("Enter 5 numbers: ");
	for (int i =0; i < arr.length; i++){
		arr[i] = sc.nextInt();
	}
	// output
	System.out.println("Array Elements: ");
	for (int i = 0; i < arr.length; i++){
		System.out.println(arr[i]);
	}
      sc.close();
}

}