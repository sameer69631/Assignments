package StringAssignmentPPT;

public class ValidMountainArray {
    public static boolean isValidMountainArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        if (n < 3) {
            return false;
        }
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }
        if (i == 0 || i == n - 1) {
            return false;
        }
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }
        return i == n - 1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1};
        boolean result = isValidMountainArray(arr);
        System.out.println(result);
    }
}
