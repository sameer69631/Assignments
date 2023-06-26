package ArrayAssignmentPPT2;

public class Ans4Flowerbed {

	public static boolean nNewFlower(int flowerbed[] , int n) {
		for(int i=0; i<flowerbed.length; i++) {
			if (flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
				flowerbed[i] = 1;
				n--;
			}
			if (n==0) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int flowerbed[] = {1,0,0,0,1};
		int n = 1;
		boolean result = nNewFlower(flowerbed, n);
		System.out.println(result);
	}
}
