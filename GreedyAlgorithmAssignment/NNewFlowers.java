package GreedyAlgorithmAssignment;

public class NNewFlowers {

	public static boolean canFlowersPlanted(int flowerbed[],int n) {
		int x = flowerbed.length-1;
		if (flowerbed[0]==0 && flowerbed[1]==0 || flowerbed[x]==0 && flowerbed[x-1]==0) {
			n--;
			if (n==0) return true;
		}
		for(int i=1;i<x;i++) {
			if (flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0) {
				n--;
				if (n==0) return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int flowerbed[] = {1,0,0,0,1};
		int n = 1;
		boolean res = canFlowersPlanted(flowerbed,n);
		System.out.println(res);
	}
}
