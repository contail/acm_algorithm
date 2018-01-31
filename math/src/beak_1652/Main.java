package beak_1652;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int [n][n];
		
		for(int i=0; i<n; i++) {
			String b = sc.next();
			for(int k=0; k<n; k++) {
				if(b.charAt(k) =='.')
					arr[i][k] = 1;
				else
					arr[i][k]  =2;
			}
		}
		
		int row=0;
		int col=0;
		
		for(int i=0; i<n;i++) {
			int row_check =0;
			for(int k=0; k<n; k++) {
				if(arr[i][k]==1)
					row_check++;
				else
					row_check=0;
				if(row_check==2) {				
					row++;
				}				
			}
			
		}

		
		for(int k=0; k<n;k++) {
			int col_check =0;
 			for(int i=0; i<n; i++) {
				
				if(arr[i][k]==1)
					col_check++;
				else
					col_check=0;
			 
				if(col_check==2) {
					col++;
				}
					
			}
			
				
		}
		
		System.out.println(row);
		System.out.println(col);
		// TODO Auto-generated method stub

	}

}
