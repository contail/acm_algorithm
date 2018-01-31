package beak_6603;
import java.util.*;

public class Main {
	static int n;
	static int arr[];
	public static void dfs(int level) {
		if(level ==6) {
			for(int i=1; i<=n; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		else {
			
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			n = sc.nextInt();
			if(n==0) {
				break;
			}
			
			arr=new int[n+1];
			
			for(int i=1; i<=n; i++) {
				arr[i] = sc.nextInt();
			}
			
			System.out.println();
			
		
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
