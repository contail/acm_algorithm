package beak_1699;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		int dp[] = new int[1000001];
		
		dp[1]=1;
		dp[2]=2;
		dp[3]=dp[1]+dp[2];
		
		int init= 2;
		boolean checked[] = new boolean[10000001];
		for(int i=4; i<=n; i++) {
			if(init*init ==i) {
				dp[i] =1;
				init++;
				checked[i] = true;
			}
			else {
				dp[i]=52673123;
			}
		}
		for(int i=2; i<=n; i++) {
			
			if(checked[i] ==true)
				continue;
			for(int k=2; k*k<=i;k++) {
				dp[i] = Math.min(dp[i-k*k]+1, dp[i]);
			}
			
		}
		
		
			
		
			
		
		
		
		// TODO Auto-generated method stub
		System.out.println(dp[n]);

	}

}
