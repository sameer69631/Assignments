package D2ArrayAssignment;

public class Ans5RowsOfCoin {

	public static int findNoOfRows(int n) {
		int i = 1;
		int k = 0;
		while(n>0) {
			n = n-i;
			if (n >= 0) {
				k++;
			}
			i++;
		}
		return k;
	}
	
	public static void main(String[] args) {
		int n = 5;
		int k = findNoOfRows(n);
		System.out.println("no of rows is : " + k);
	}
}
