package GreedyAlgorithmAssignment;

public class MaxNoOfActivities {

	public static void getMaxNoOfActivities(int start[],int finish[]) {
		if (start[0]<finish[0]) {
			System.out.print(0 + " ");
		}
		int pointer = 1;
		for(int i=1;i<start.length;i++) {
			if (start[i] < finish[i] && start[i] >= finish[pointer-1]) {
				System.out.print(i + " ");
				pointer = i+1;
			}
		}
	}
	
	public static void main(String[] args) {
		int start[] = {10,12,20,30};
		int finish[] = {20,25,30,32};
		
		getMaxNoOfActivities(start,finish);
	}
}
