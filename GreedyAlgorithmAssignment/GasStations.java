package GreedyAlgorithmAssignment;

public class GasStations {

	public static int canCompleteRound(int gas[],int cost[]) {
		int gasSum = 0, costSum = 0;
		for(int i=0;i<gas.length;i++) {
			gasSum += gas[i];
			costSum += cost[i];
		}
		if (gasSum != costSum) return -1;
		
		int remainingGas = 0, start = 0;
		for(int i=0;i<gas.length;i++) {
			remainingGas = remainingGas + (gas[i]-cost[i]);
			if (remainingGas < 0) {
				start = i+1;
				remainingGas = 0;
			}
		}
		return start;
	}
	
	public static void main(String[] args) {
		int gas[] = {1,2,3,4,5};
		int cost[] = {3,4,5,1,2};
		int res = canCompleteRound(gas,cost);
		System.out.println("starting station index is : " + res);
	}
}
