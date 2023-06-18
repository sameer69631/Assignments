package RecursionAssignment;

public class MaxValOfArray {
	
	public static int findMaxVal(int []array ,int i,int maxVal) {
		while(i<array.length) {
			
			if(array[i]>maxVal) {
				maxVal = array[i];
			}
			return findMaxVal(array, i+1,maxVal);
		}
		return maxVal;
	}

	public static void main(String[] args) {
		int []array ={13, 1, -3, 22, 5};
		
		int result = findMaxVal(array,0,array[0]);
		System.out.println(result);
	}
}
