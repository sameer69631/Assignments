package ArrayAssignmentPPT3;

public class Ans6NonRepeating {

	public static int NonRepeatingNum(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        int result = NonRepeatingNum(nums);
        System.out.println(result);
    }
}
