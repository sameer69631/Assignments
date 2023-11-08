package RecursionAssignment;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String currentString = "";
        int currentCount = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentCount = currentCount * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(currentCount);
                stringStack.push(currentString);

                currentCount = 0;
                currentString = "";
            } else if (ch == ']') {
                int prevCount = countStack.pop();
                String prevString = stringStack.pop();

                StringBuilder repeatedString = new StringBuilder(prevString);
                for (int i = 0; i < prevCount; i++) {
                    repeatedString.append(currentString);
                }

                currentString = repeatedString.toString();
            } else {
                currentString += ch;
            }
        }

        return currentString;
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";

        DecodeString decoder = new DecodeString();
        String decodedString = decoder.decodeString(s);

        System.out.println(decodedString);
    }
}

