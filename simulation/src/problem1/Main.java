package problem1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int input = sc.nextInt();
		
		boolean arr[][] = new boolean [n][m];
		
		int count=0;
		for(int i=0; i<input; i++) {
			int r = sc.nextInt();
			int c1 =sc.nextInt();
			int c2 = sc.nextInt();
			
			for(int k=c1-1 ;k <=c2-1; k++) {
				
				arr[r-1][k] = true;
				
			}
		}
		
		
		for(int i=0; i<n; i++) {
			for(int k=0; k<m; k++) {
				if(arr[i][k]==false)
					count++;
			}
		}
		
		System.out.println(count);
		
		
		
		// TODO Auto-generated method stub

	}

}
