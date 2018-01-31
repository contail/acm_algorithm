package beak_1037;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		if(n==1) {
			System.out.println(arr[0]*arr[0]);
		}
		else {
			System.out.println(arr[0] * arr[n-1]);
		}
		// TODO Auto-generated method stub

	}

}
