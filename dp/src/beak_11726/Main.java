package beak_11726;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input =sc.nextInt();
		int arr[] = new int [input+1];
		int dp[] = new int[input+1];
		
		dp[0]=0;
		dp[1] = 1;
		if(input >1)
			dp[2] =2;
		
		for(int i=3; i<=input ; i++) {
			dp[i] = (dp[i-2] + dp[i-1]) %10007;
		}
		System.out.println(dp[input]);
		// TODO Auto-generated method stub

	}

}
