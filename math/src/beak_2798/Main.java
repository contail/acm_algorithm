package beak_2798;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int [n+1];
		int s = sc.nextInt();
		
		
		for(int i=0; i<n; i++) {
			arr[i] =sc.nextInt();
		}
		
		int max =0;
		for(int i=0; i<n; i++) {
			
			for(int k=i+1; k<n; k++) {
				
				for(int j=k+1; j<n; j++) {
					if(arr[i]+arr[k]+arr[j] <=s) {
						if (max <arr[i]+arr[k]+arr[j])
							max = arr[i]+arr[k]+arr[j];
					}
				}
				
			}
		}
		System.out.println(max);
		// TODO Auto-generated method stub

	}

}
