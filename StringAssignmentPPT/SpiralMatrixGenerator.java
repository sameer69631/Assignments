package StringAssignmentPPT;

public class SpiralMatrixGenerator {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        int num = 1;
        int direction = 0;

        while (top <= bottom && left <= right) {
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    matrix[top][i] = num++;
                }
                top++;
            } else if (direction == 1) {
                for (int i = top; i <= bottom; i++) {
                    matrix[i][right] = num++;
                }
                right--;
            } else if (direction == 2) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = num++;
                }
                bottom--;
            } else if (direction == 3) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }

            direction = (direction + 1) % 4;
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = generateMatrix(n);
        printMatrix(matrix);
    }
}
