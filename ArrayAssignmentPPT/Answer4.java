package ArrayAssignmentPPT;

import java.util.Arrays;

public class Answer4 {

	public static int[] plusOneInDigit(int[] digits) {
	    int n = digits.length;
	    int toAdd = 1;
	    
	    for (int i = n - 1; i >= 0; i--) {
	        int digitSum = digits[i] + toAdd;
	        digits[i] = digitSum % 10;
	        toAdd = digitSum / 10;
	    }
	    
	    if (toAdd == 1) {
	        int[] result = new int[n + 1];
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
