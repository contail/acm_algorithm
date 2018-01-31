package beak_2133;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		int dp [] = new int[n+1];
		dp[0] =1;
		dp[2] =3;
		
		for(int i=4; i<=n; i= i+2) {
			dp[i] = dp[i-2]*3;
			
			for(int k=4 ;i-k >=0; k+=2) {
				dp[i] += dp[i-k]*2;
			}
		}
		
		System.out.println(dp[n]);
		// TODO Auto-generated method stub

	}

}
