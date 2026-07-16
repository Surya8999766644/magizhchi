public class Maximum {
	static int max(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
			max = arr [i];
			}
		}
		return max;
	}
	   public static void main(String[] args) {
		   int arr[] = {10,25,5,800};
		   System.out.println("Maximum = " + max(arr));
	   }
}