package RecursionAssignment;

public class GoalStringSwap {

	public static boolean goalString(String s,String goal) {
		if (s.length() != goal.length()) {
			return false;
		}
		char ch[] = s.toCharArray();
		char ch2[] = goal.toCharArray();
		int left = 0;
		int right = s.length()- 1;
		boolean check = false;
		while(left <right) {
			char temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			if(ch[left]==ch2[left] && ch[right] == ch2[right]) {
				check = true;
			}
			left++;
			right--;
		}
		return check;
	}
	
	public static void main(String[] args) {
		String s = "aba";
		String goal = "ba";
		System.out.println(goalString(s, goal));
	}
}
