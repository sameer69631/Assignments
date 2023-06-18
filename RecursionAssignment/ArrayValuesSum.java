package RecursionAssignment;

public class ArrayValuesSum {
	
	public static int sumInArray(int arr[],int i) {
		int sum=0;
		if(i==arr.length) {
			return sum;
		}
		return sum = arr[i]+sumInArray(arr, i+1);
	}

	public static void main(String[] args) {
		int arr[] = {92,23,15,-20,10};
		
		int result = sumInArray(arr,0);
		System.out.println(result);
	}
}
