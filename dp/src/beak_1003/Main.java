package beak_1003;

import java.util.*;
public class Main {
	
	static int count_1 =0;
	static int count_2 =0;
	static int memo[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
	
		while(testcase-- > 0) {
			int a = sc.nextInt();
			
			memo = new int [41];
			memo[0] = 1;
			memo[1] =1;
			fibo(a);
			if (a==0) {
				System.out.println(1 + " " + 0);
			}
			else if (a==1) {
				System.out.println(0 + " " + 1);
			}
			else
				System.out.println(memo[a-2] + " " + memo[a-1]);
			
			count_1=0;
			count_2=0;
		}
		
	}
	
	public static int fibo(int n) {
	
		if(n<=1)
			return memo[n];
		else
			if(memo[n] > 0)
				return memo[n];
		return memo[n] = fibo(n-2) + fibo(n-1);
	}

}
