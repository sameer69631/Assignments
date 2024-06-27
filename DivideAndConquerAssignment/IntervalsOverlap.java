package DivideAndConquerAssignment;

import java.util.Arrays;
import java.util.Comparator;

class Interval{
	int start;
	int end;
	public Interval(int start,int end) {
		this.start = start;
		this.end = end;
	}
}
public class IntervalsOverlap {

	public static void checkOverlap(Interval arr[]) {
		Arrays.sort(arr,new Comparator<Interval>() {
			@Override
			public int compare(Interval i,Interval j) {
				if (i.start > j.start) {
					return 1;
				}else {
					return -1;
				}
			}
		});
		for(int i=0;i<arr.length-1;i++) {
			if (arr[i].end > arr[i+1].start) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
	
	public static void main(String[] args) {
		Interval arr[]={new Interval(1, 3),new Interval(5, 7),new Interval(2, 4),new Interval(6, 8)};
		
		checkOverlap(arr);
	}
}
