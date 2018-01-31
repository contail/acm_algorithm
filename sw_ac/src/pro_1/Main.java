package pro_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int count =1;
		while(testcase-- >0) {
			int price[] = new int[4];
			int dp[]= new int[13];
			int arr[] = new int[13];
			
			
			for (int i = 0; i < 4; i++) {
					price[i] = sc.nextInt();
				}
			
			
			for (int i = 1; i <= 12; i++) {
			
				arr[i] = sc.nextInt();
			}
			
		
			
			dp[1] = price[1] > arr[1] *price[0]  ? arr[1] * price[0] : price[1];
			dp[2] = dp[1] + Math.min(arr[2]*price[0], price[1]);
			dp[3] = Math.min(price[2], Math.min(dp[2]+arr[3]*price[0], dp[2]+price[1]));
			//System.out.println(dp[3]);
			for(int i=4; i<=12; i++) {
				//System.out.println(i +"==========" + dp[i-2] + " " +  dp[i-1] + " " +  dp[i]);
				dp[i] = Math.min(dp[i-3]+price[2], Math.min(dp[i-1]+price[1], dp[i-1]+arr[i]*price[0]));
				
				System.out.println(dp[i] + "===");
			}
			
			
			System.out.println("#"+count+ " " + Math.min(dp[12], price[3]));
			count++;
		}
		
		
		
		/*
		 *10 70 180 400
			6 9 7 7 7 5 5 0 0 0 0 0
		 * 
		 * 60 90 70  70 70 50  50
		 * 60 90 70 70 50 50
		 * 180 70 70 50 50
		 * 250 180 50
		 */

	}

}
