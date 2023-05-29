package SearchingInAnArrayAssignment;

public class OccurancesOfNumber {

	public static void main(String[] args) {
		int arr[] = {2,5,5,5,6,6,8,9,9,9};
		int target = 5;
		int count = 0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				count++;
			}
		}
		System.out.println("number of occurances of "+target+" is "+count);
	}
}
