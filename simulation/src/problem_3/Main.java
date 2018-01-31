package problem_3;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int arr[] =new int[testcase];
		for(int i=0; i<testcase; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		int count =0;
		int diff = arr[testcase-1] - arr[0];
		
		for(int i=0; i<1000000000;i++) {
			System.out.println(count+testcase);
			if(diff%(count+testcase)==0)
				break;
			else {
				count++;
			}
			
		}
		
		System.out.println(count+1);
		
//		int diff=arr[1] -arr[0];
//		int count =0;
//		for(int i=0; i<testcase-1;i++) {
//			if(arr[i] + diff ==arr[i+1])
//				continue;
//			else
//				count++;
//			if(count >0)
//				break;
//			
//		}
//		
//		if(count >0) {
//			
//		}
//		else {
//			System.out.println(0);
//		}
		

	}

}
