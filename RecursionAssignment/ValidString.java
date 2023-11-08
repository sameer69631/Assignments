package RecursionAssignment;

import java.util.*;

public class ValidString {
    public static boolean isValid(String s) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '*') {
                stack.push(i);
            } else if (!stack.isEmpty()) {
                stack.pop();
            } else {
                return false;
            }
        }

        while (!stack.isEmpty()) {
            int index = stack.pop();
            char ch = s.charAt(index);

            if (ch == '(') {
                
                boolean foundClosing = false;

                while (!stack.isEmpty()) {
                    int prevIndex = stack.pop();
                    char prevCh = s.charAt(prevIndex);

                    if (prevCh == '*') {
                        foundClosing = true;
                        break;
                    }
                }

                if (!foundClosing) {
                    return false;
                }
            } else {
                
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "()";
        boolean result = isValid(s);
        System.out.println(result);
    }
}
