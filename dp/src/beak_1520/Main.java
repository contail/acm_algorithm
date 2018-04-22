package beak_1520;
import java.util.*;

public class Main {
	static int arr[][];
	static int count;
	static int x,y;
	
	static int dx[] = { -1,0,1,0};
	static int dy[] = {0,1,0,-1};
	static int dp[][] ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 x = sc.nextInt();
		 y = sc.nextInt();
		
		
		arr = new int[x][y];
		dp = new int [x][y];
		for(int i=0; i<x; i++) {
			for(int k=0; k<y; k++) {
				arr[i][k] = sc.nextInt();
				dp[i][k] = -1;
			}
		}
		
		 
		System.out.println(dfs(x-1,y-1));
		
		// TODO Auto-generated method stub

	}
	
	public static int dfs(int i, int k) {
		
		if(i == 0 && k == 0) {
			return dp[i][k] = 1;
		}
		
		if(dp[i][k] ==-1) {
			dp[i][k] = 0;
			for(int z =0; z<4; z++) {
				int next_x = i + dx[z];
				int next_y = k + dy[z];
				
				if( next_x < x && next_y <y && next_x >=0 && next_y >=0) {
					if(arr[next_x][next_y] > arr[i][k]) {
						dp[i][k] +=dfs(next_x,next_y);
						
					}
						
				}
			}
		}
	
		
		return dp[i][k];
		
	}

}
