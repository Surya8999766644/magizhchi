public class Minimum {
	static int min(int arr[]) {
	int min = arr[0];
	  for (int i = 1; i< arr.length; i++){
		  if (arr[i] < min) {
			  min =arr[i];
		  }
	  }
	    return min;
	}
	   public static void main(String[] args) {
		   int arr[] ={10,25,5,30,15};
		   System.out.println("Minimum = " + min(arr));
		   }
	   }