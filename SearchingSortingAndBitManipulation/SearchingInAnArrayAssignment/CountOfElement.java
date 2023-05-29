package SearchingInAnArrayAssignment;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class CountOfElement {

	public static void main(String[] args) {
		int arr[] = {0,0,0,0,1,1,1,1,1,1};
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
			}
		}
		
		System.out.println("number of 1s present in the array is "+count);
	}
}
