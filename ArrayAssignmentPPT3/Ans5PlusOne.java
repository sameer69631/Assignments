package ArrayAssignmentPPT3;

import java.util.Arrays;

public class Ans5PlusOne {

	public static int[] plusOneInDigit(int[] digits) {
	    int toAdd = 1;
	    for(int i = digits.length-1;i>=0;i--) {
	    	int sum = digits[i] + toAdd;
	    	digits[i] = sum%10;
	    	toAdd = sum/10;
	    }
	    if (toAdd == 1) {
			int result[] = new int [digits.length+1];
			result[0] = 1;
			return result;
		}
	    return digits;
	}
	
	public static void main(String[] args) {
		int digits[] = {1,2,3};
		int arr[] = new int[digits.length];
		arr = plusOneInDigit(digits);
		System.out.println(Arrays.toString(arr));
	}
}
