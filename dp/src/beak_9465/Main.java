package beak_9465;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		while(testcase-- >0) {
			int n = sc.nextInt();
			int dp[][] = new int [3][n+1];
			int arr[][] = new int[3][n+1];
			for(int i=1;i<=2;i++) {
				for(int k=1; k<=n; k++) {
					arr[i][k] = sc.nextInt();				
				}
			}
			dp[1][1] =arr[1][1];
			dp[2][1] =arr[2][1];
			if(n>=2) {
				dp[1][2] = arr[1][2] + arr[2][1];
				dp[2][2] = arr[1][1] + arr[2][2];			
			}
			for(int s=3; s<=n; s++) {
				dp[1][s] =Math.max(dp[2][s-1] + arr[1][s], dp[2][s-2]+arr[1][s]);				
				dp[2][s] = Math.max(dp[1][s-1]+arr[2][s], dp[1][s-2]+arr[2][s]);
			}		
			System.out.println(Math.max(dp[1][n], dp[2][n]));
		}
		
	
		// TODO Auto-generated method stub

	}

}
