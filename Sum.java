public class Sum {
	static int sum(int arr[]) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
		total = total + arr[i];
		}
		return total;
	}
	    public static void main(String[] args) {
			int arr[] ={10,25,5,50};
		System.out.println("sum = " + sum(arr));
		}
}
