package beak_11403;
import java.util.*;
public class Main {
	
	static int arr[][];
	static int arr1[][];
	static int checked[];
	static int n;
	public static void dfs(int i) {
		
		for(int k=1; k<=n; k++) {
			if(checked[k] ==0 && arr[i][k]==1) {
				checked[k]=1;
			//	System.out.println(i + "===i===" + k + "====k===");
				dfs(k);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 n =sc.nextInt();
		arr = new int[n+1][n+1];
		arr1 = new int[n+1][n+1];
		checked = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=n; k++) {
				arr[i][k] = sc.nextInt();
				
					
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++)
					checked[j] =0;
			dfs(i);
			for(int j=1; j<=n;j++) {
				//System.out.print(checked[j] + " =j번째= " +j + "     ");				 
				arr[i][j]= checked[j];
				//System.out.print(arr[i][j] + " ");
			}
			
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// TODO Auto-generated method stub

	}

}
