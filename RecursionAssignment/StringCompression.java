package RecursionAssignment;

public class StringCompression {
    public int compress(char[] chars) {
        int i = 0; 
        int j = 0; 

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            chars[j] = currentChar;
            j++;

            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[j] = c;
                    j++;
                }
            }
        }

        return j;
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        StringCompression compressor = new StringCompression();
        int compressedLength = compressor.compress(chars);
        for (int i = 0; i < compressedLength; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();
    }
}

