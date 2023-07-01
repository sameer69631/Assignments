package StringAssignmentPPT;
import java.util.*;

public class SparseMatrixMultiplication {
    public static int[][] multiply(int[][] mat1, int[][] mat2) {
        int m = mat1.length;
        int k = mat1[0].length;
        int n = mat2[0].length;

        // Create a map to store the non-zero elements of mat2
        Map<Integer, List<int[]>> map = new HashMap<>();

        // Populate the map with non-zero elements of mat2
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                if (mat2[i][j] != 0) {
                    map.putIfAbsent(i, new ArrayList<>());
                    map.get(i).add(new int[]{j, mat2[i][j]});
                }
            }
        }

        // Perform matrix multiplication
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                if (mat1[i][j] != 0) {
                    if (map.containsKey(j)) {
                        List<int[]> list = map.get(j);
                        for (int[] pair : list) {
                            int col = pair[0];
                            int value = pair[1];
                            result[i][col] += mat1[i][j] * value;
                        }
                    }
                }
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        int[][] mat1 = {{1, 0, 0}, {-1, 0, 3}};
        int[][] mat2 = {{7, 0, 0}, {0, 0, 0}, {0, 0, 1}};

        int[][] result = multiply(mat1, mat2);
        for (int[] i : result) {
			System.out.println(Arrays.toString(i));
		}
    }
}
