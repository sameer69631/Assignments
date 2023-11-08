package StringAssignmentPPT2;

public class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        String typedS = processString(s);
        String typedT = processString(t);
        
        return typedS.equals(typedT);
    }
    
    private static String processString(String str) {
        StringBuilder typed = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                typed.append(ch);
            } else if (typed.length() > 0) {
                typed.deleteCharAt(typed.length() - 1);
            }
        }
        
        return typed.toString();
    }
    
    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        boolean result = backspaceCompare(s, t);
        System.out.println(result);
    }
}