package beak_2167;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n+1][m+1];
		
		for(int i=1; i<=n;i++) {
			
			for(int k=1; k<=m; k++) {
				arr[i][k] =sc.nextInt();
			}
		}
	
		int dp[][] = new int[n+1][m+1];
		
		dp[1][1] = arr[1][1];
		
		int testcase = sc.nextInt();
		
//		for(int i=1; i<=n;i++) {
//			
//			for(int k=1; k<=m; k++) {
//				System.out.print(arr[i][k]+ " ");
//			}
//		
//		}
		
		while(testcase-- >0) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int sum =0;
			for(int z =i; z<=x; z++) {
				for(int z1= j; z1<=y; z1++) {
					sum += arr[z][z1];
				}
			}
			System.out.println(sum);
		}
		

	}

}
