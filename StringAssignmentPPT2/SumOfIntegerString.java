package StringAssignmentPPT2;

public class SumOfIntegerString {

	public static String strIntSum(String num1 ,String num2) {
		StringBuilder restlt = new StringBuilder();
		int carry = 0;
		int i = num1.length()-1;
		int j = num2.length()-1;
		
		while(i>=0 || j>=0) {
			int digit1 = i >= 0? num1.charAt(i)-'0' : 0;
			int digit2 = j >= 0? num2.charAt(j)-'0' : 0;
			int sum = digit1+digit2+carry;
			carry = sum/10;
			int remainder = sum%10;
			restlt.append(remainder);
			i--;
			j--;
		}
		if (carry!=0) {
			restlt.append(carry);
		}
		return restlt.reverse().toString();
	}
	
	public static void main(String[] args) {
		String num1 = "11";
		String num2 = "123";
		System.out.println(strIntSum(num1, num2));
	}
}
