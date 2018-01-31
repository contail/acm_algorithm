package beak_9663;
import java.util.*;
public class Main {

	static int dx[]= {};
	static int dy[]= {};
	
	static int n;
	static int count;
	
	/*
	 *  1 0 0 0
	 *  0 0 0 0
	 *  0 0 0 0
	 *  0 0 0 0
	 * 
	 */
	
	public static boolean checked_queen(int arr[], int level) {
		
		for(int k=0; k<level; k++) {
			
			if(arr[k]== arr[level])
				return false;
			if(Math.abs(level-k) == Math.abs(arr[k]-arr[level]))
				return false;
		}
		
		return true;
	}
	
	public static void dfs(int arr[], int level) {
		
		if(level==n) {
			count++;
			return;
		}
		else {
			
				for(int i=0; i<n; i++) {		 
						arr[level]=i;
						if(checked_queen(arr,level)) {
					//	System.out.println(i);
						dfs(arr,level+1);
					
						
				}
		}
		
		
		}
			
		
		
		
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		
		dfs(arr,0);
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
