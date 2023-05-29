package SearchingInAnArrayAssignment;
//Answer-1
import java.util.Scanner;

public class LenearSearchElement {

	public static int linearSearch(int arr[],int targetElement) {
		int result=-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==targetElement) {
				result=i;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter "+n+" elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the target element");
		int targetElement = sc.nextInt();
		
		int searchedIndex = linearSearch(arr,targetElement);
		
		if(searchedIndex!=-1) {
			System.out.println("the given element present at index : "+searchedIndex);
		}else {
			System.out.println("Element not present in array");
		}
	}
}
