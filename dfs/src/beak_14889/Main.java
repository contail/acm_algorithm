package beak_14889;
import java.util.*;
public class Main {
	
	static int n;
	static int arr[][];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int k=0; k<n; k++) {
				int a = sc.nextInt();
				arr[i][k] = arr[k][i] = a;
			}
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
