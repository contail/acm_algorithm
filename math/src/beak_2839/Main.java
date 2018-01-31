package beak_2839;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dp [] = new int[5001];
		
		dp[3]=1;
		dp[5]=1;
		dp[6] =2;
		dp[8] =3;
		dp[9]=3;
		dp[10]=2;
		
		for(int i=10;i<=5000;i++) {
			dp[i] = 998765421;
		}
			
			
			for(int k=10; k<=n; k++) {
				
				for(int z=1; z<=k; z++) {
					if(dp[z] == 0 || dp[k-z]==0)
						continue;
			
					dp[k] = Math.min(dp[z]+dp[k-z], dp[k]);
			
				}
			
			}
	 
		
		if(dp[n] ==0 || dp[n] >10000) {
			System.out.println(-1);
		}
		else
			System.out.println(dp[n]);
		
	}

}


/*

21 =  > 5*3 + 3*2     3*7

20 = > 5*4

16 = 5*2 + 3*2

*/