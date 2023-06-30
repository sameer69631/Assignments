package D2ArrayAssignment2;

public class Ans2CoinRows {
	
	public static int coinRows(int n) {
		int k = 0;
		for (int i = 1; i <= n; i++) {
			n=n-i;
			k++;
		}
		return k;
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(coinRows(n));
	}
}
