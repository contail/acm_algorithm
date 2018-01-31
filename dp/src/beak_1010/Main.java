package beak_1010;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc  =  new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int i=0; i<testcase; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int dp [][] = new int[a+1][b+1];
			dp[1][1] =1;
			
			for(int k=1; k<=b; k++) {
				dp[1][k]=k;
			}
			
			for(int x=2; x<=a;x++) {
				for(int y=x; y<=b; y++) {
					for(int z =y; z>=x; z--) {					
						dp[x][y] += dp[x-1][z-1]; 
					}
				}
			}

			System.out.println(dp[a][b]);
		}
		
		// TODO Auto-generated method stub

	}

}
