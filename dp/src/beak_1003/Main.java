package beak_1003;

import java.util.*;
public class Main {
	
	static int count_1 =0;
	static int count_2 =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		while(testcase-- > 0) {
			int a = sc.nextInt();
			
			fibo(a);
			System.out.print(count_1 + " " + count_2);
			
			count_1=0;
			count_2=0;
		}
		
	}
	
	public static int fibo(int n) {
		
		if (n ==0) {
			count_1++;
			return 0;
		}
		else if (n==1) {
			count_2++;
			return 1;
		}
		
		else {
			return fibo(n-1) + fibo(n-2);
		}
		
	}

}
