package beak_7510;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean check[] = new boolean[a];
		
		for(int i=0 ; i<a; i++) {
			int arr[] = new int[3];
			arr[0]= sc.nextInt();
			arr[1] = sc.nextInt();
			arr[2]  = sc.nextInt();
			
			Arrays.sort(arr);
			
			if(arr[2]*arr[2] == arr[1]*arr[1] + arr[0]*arr[0]) {
				check[i]= true;
			}
		}
		
		for(int i=0; i<a; i++) {
			if(check[i] ) {
				System.out.println("Scenario #"+(i+1)+":");
				System.out.println("yes");
			}
			else {
				System.out.println("Scenario #"+(i+1)+":");
				System.out.println("no");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
