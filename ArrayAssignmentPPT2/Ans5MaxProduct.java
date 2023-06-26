package ArrayAssignmentPPT2;

public class Ans5MaxProduct {

	public static int maxElementProduct(int nums[]) {
		int num1 = 0 , num2 = 0 , num3 = 0;
		for(int i=0; i<nums.length; i++) {
			if (nums[i] > num1) {
				num3=num2;
				num2=num1;
				num1 = nums[i];
			}
			else if (nums[i] > num2) {
				num3=num2;
				num2 = nums[i];
			}
			else if(nums[i] > num3) {
				num3 = nums[i];
			}
			 
		}
		return num1*num2*num3;
	}
	
	public static void main(String[] args) {
		int nums[] = {1,2,3};
		int result = maxElementProduct(nums);
		System.out.println(result);
	}
}
