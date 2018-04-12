package beak_9663_v2;

import java.util.*;
public class Main {
	
	static int arr[];
	static int count;
	static int index;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		index = sc.nextInt();
		arr = new int [index+1];
		backtracking(0);
		System.out.println(count);
	}
	
	public static boolean promise(int depth) {
		
		for(int i=0; i<depth; i++) {
			if(depth -i == Math.abs(arr[i] - arr[depth]))
				return false;
			if( arr[depth] == arr[i] )
				return false;
		}
		return true;
	}
	
	public static void backtracking(int depth) {
				
		if(!promise(depth-1)) {		
			return;
		}
		if(depth == index) {
			count++;
			return;
			}
		for(int i=1; i<=index; i++) {
			arr[depth] = i;
			backtracking(depth+1);
			arr[depth] = 0;
		}
		
	}

}
