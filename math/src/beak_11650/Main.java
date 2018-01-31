package beak_11650;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int arr[][] = new int [testcase][2];
		
		for(int i=0; i<testcase; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
//		for(int i=0; i<testcase-1;i++) {
//			
//			int temp, temp1,temp2, temp3;
//			
//			if(arr[i][0] > arr[i+1][0]) {
//				temp = arr[i][0];
//				temp1 = arr[i][1];
//				
//				arr[i][0] = arr[i+1][0];
//				arr[i][1] = arr[i+1][1];
//				arr[i+1][0] = temp;
//				arr[i+1][1] = temp1;
//			}
//			if(arr[i][0] == arr[i+1][0]) {
//				if(arr[i][1] > arr[i+1][1]) {
//					temp2 = arr[i][0];
//					temp3 = arr[i][1];
//					
//					arr[i][0] = arr[i+1][0];
//					arr[i][1] = arr[i+1][1];
//					arr[i+1][0] = temp2;
//					arr[i+1][1] = temp3;
//				}
//			}
//		}
//		
//		for(int i=0; i<testcase-1;i++) {
//			
//			int temp, temp1,temp2, temp3;
//			
//			if(arr[i][0] == arr[i+1][0]) {
//				if(arr[i][1] > arr[i+1][1]) {
//					temp2 = arr[i][0];
//					temp3 = arr[i][1];
//					
//					arr[i][0] = arr[i+1][0];
//					arr[i][1] = arr[i+1][1];
//					arr[i+1][0] = temp2;
//					arr[i+1][1] = temp3;
//				}
//			}
//		}
//		
//		
		
		Arrays.sort(arr, new Comparator<int []>() {

			@Override
			public int compare(int[] a, int[] b) {
				// TODO Auto-generated method stub
				if(a[0] ==b[0]) return Integer.compare(a[1], b[1]);
				return Integer.compare(a[0], b[0]);
			}
		});
	
//		
		for(int i=0; i<testcase; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]); 
			
		}
		// TODO Auto-generated method stub

	}

}
