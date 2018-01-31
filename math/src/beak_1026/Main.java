package beak_1026;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		int arr1[] = new int[testcase];
		int arr2[] = new int [testcase];
		
		for(int i=0; i<testcase; i++) {
			arr1[i] = sc.nextInt();
			 
		}
		for(int i=0; i<testcase; i++) {
		 
			arr2[i] = sc.nextInt();
		}
		
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int total = 0;
		for(int i=0; i<testcase; i++) {
			total+= arr1[testcase-1-i] * arr2[i];
		}
		
		System.out.println(total);
		// TODO Auto-generated method stub

	}

}
