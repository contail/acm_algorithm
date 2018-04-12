package beak_14889;
import java.util.*;
public class Main {
	
	static int n;
	static int arr[][];
	static int sum =0;
	static int other_sum = 0;
	static int result = 0;
	static int min = Integer.MAX_VALUE;
	static boolean check[];
	static boolean check_v2[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n+1][n+1];
		check = new boolean[n+1];
		
		
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=n; k++) {
				int a = sc.nextInt();
				arr[i][k] = a;
			}
		}
		dfs(1,1);
		System.out.println(result);
		// TODO Auto-generated method stub

	}
	
	public static void dfs(int index, int depth) {
		if(depth == (n/2)+1) {
			split_team();
			
		}
		
		for(int i=index; i<=n; i++) {
			
			if(!check[i]) {
				check[i] = true;
				dfs(i+1,depth+1);
				check[i] = false;
			}		
		}
		
	}
	
	public static void split_team() {
		
		int a = 0;
		int b =  0;
		boolean temp_check[][]  = new boolean[n+1][n+1];
		boolean temp_check_v2[][]  = new boolean[n+1][n+1];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				
				if(check[i] &&check[j]  && !temp_check[i][j]) {
					
					a = a+ arr[i][j] + arr[j][i];
					temp_check[i][j] = true;
					temp_check[j][i] = true;
				}
				else {
					if(!check[i] && !check[j] && !temp_check_v2[i][j]) {

						b= b + arr[i][j] + arr[j][i];
						temp_check_v2[i][j] = true;
						temp_check_v2[j][i] = true;
				}
					}
					
			}
		}
		
		
		result = Math.min(min, Math.abs(a-b));
		min  = result;
		
		
		
	}

}
