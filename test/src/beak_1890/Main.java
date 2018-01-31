package beak_1890;
import java.util.*;

public class Main {

	static int arr[][] = new int [101][101];
	static long dp[][] = new long [101][101];
	
	
	static int test_case;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		test_case = sc.nextInt();
		
		boolean checked[][] = new boolean [101][101];
	
		
		for(int i=0; i<test_case; i++) {
			for(int j=0; j<test_case; j++) {				
				arr[i][j] = sc.nextInt();
				
			}
		}		
		dp[0][0] =1;
		
		for(int i=0; i<test_case; i++) {
			for(int j=0; j<test_case; j++) {			
				int move = arr[i][j];		
				if(move +i <test_case && i !=test_case-1) {
					dp[i+move][j] +=dp[i][j];				
						}			
				if(move + j <test_case && j !=test_case-1)
				{				
					dp[i][j+move] += dp[i][j];					
				}
	
			}
		}
		
		System.out.println(dp[test_case-1][test_case-1]);
		
		
	
		

	}
	
	

}
