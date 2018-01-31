package beak_11057;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		
		
		int arr[] = new int[n+1];
		int dp[][] = new int[1001][10];
		
		
		for(int i=0; i<10; i++) {
			dp[0][i] = 1;
		}
		
		for(int i=1; i<=n; i++) {
			dp[i][9] =1;	
			for(int j=8; j>=0; j--) {		
				dp[i][j] = (dp[i-1][j] + dp[i][j+1])%10007;
			}	
		}
		
		System.out.println(dp[n][0]);
		
		
		// TODO Auto-generated method stub

	}

}
