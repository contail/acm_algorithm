package beak_2563;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int [200][200];
		
		int testcase = sc.nextInt();
		int temp = testcase;
		int count =0;
		while(testcase--> 0) {
			int a =sc.nextInt();
			int b =sc.nextInt();
			
			for(int i=a; i<a+10; i++) {
				for(int j=b; j<b+10; j++) {
					if(arr[i][j] !=0)
						count++;
					else
						arr[i][j] =1;
				}
			}
		}
		
		System.out.println(temp*100-count);
		// TODO Auto-generated method stub

	}

}
