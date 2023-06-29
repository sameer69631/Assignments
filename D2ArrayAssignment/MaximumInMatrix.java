package D2ArrayAssignment;

public class MaximumInMatrix {

	public static int maxCount(int m, int n, int[][] ops) {
        int minAi = m;
        int minBi = n;

        for (int[] op : ops) {
            minAi = Math.min(minAi, op[0]);
            minBi = Math.min(minBi, op[1]);
        }

        return minAi * minBi;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[][] ops = {{2, 2}, {3, 3}};

        int maxIntegers = maxCount(m, n, ops);
        System.out.println(maxIntegers);
}







}
