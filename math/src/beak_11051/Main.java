package beak_11051;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr [][] = new int [1002][1002];
		
		arr[1][1] = 1;
		arr[1][2] = 1;
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			arr[i][1] =1;
			arr[i][i+1] =1;
		}
		
		//arr[n][k] = arr[n-1][k-1] + arr[n-1][k]
		for(int i=2; i<=n; i++) {
			
			for(int a=2; a<i+1; a++) {
				arr[i][a] = (arr[i-1][a-1] + arr[i-1][a])%10007;
				
			}
		}
		
		System.out.println(arr[n][k+1]);
		
		
		// TODO Auto-generated method stub

	}

}
