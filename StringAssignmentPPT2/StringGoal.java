package StringAssignmentPPT2;

public class StringGoal {

	public static boolean goalString(String s, String goal) {
		if (s.length() != goal.length()) {
			return false;
		}
		String ss = s+s;
		return ss.contains(goal);
	}
	
	public static void main(String[] args) {
		String s = "abcde";
		String goal = "cdeab";
		System.out.println(goalString(s, goal));
	}
}
