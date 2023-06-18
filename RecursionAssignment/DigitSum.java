package RecursionAssignment;

public class DigitSum {
	
	public static int digitSum(int num) {
		if(num == 1) {
			return num;
		}
		int result = (num%10)+digitSum(num/10);
		return result;
	}

	public static void main(String[] args) {
		int num = 1234;
		int result = digitSum(num);
		System.out.println("sum of digits of given number is : "+result);
	}
}
