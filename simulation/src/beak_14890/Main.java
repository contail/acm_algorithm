package beak_14890;
import java.util.*;
public class Main {

	static int index;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		index = sc.nextInt();
		int arr[][]= new int [index+1][index+1];
		
		int s = sc.nextInt();
		for(int i =1; i<=index; i++)
			for(int j=1; j<=index; j++)
				arr[i][j] = sc.nextInt();
		
		
		//가로 방향 검사하기
		int total_count = 0;
//		for(int i=1; i<=index; i++) {
//			for(int j=1; j<index; j++) {
//				if(arr[i][j] != arr[i][j+1]) {
//					if(!check_length(arr,i,j,s)) {
//						total_count++;
//						break;
//					}
//						
//				}
//			}
//		}
		
		//로 방향 검사하기
//				 
		for(int i=1; i<=index; i++) {
			for(int j=1; j<index; j++) {
				if(arr[j][i] != arr[j+1][i]) {
					if(!check_length_v2(arr,i,j,s)) {
						total_count++;
						break;
					}
						
				}
			}
		}
		
		
		
		System.out.println(total_count);
		
		
		
	}
	
	/*
	 * 6 2
3 3 3 3 3 3
3 3 3 3 3 3
2 2 2 3 2 3
2 1 1 2 2 2
1 1 1 3 3 1
1 1 2 3 3 2
	 */
	
	public static boolean check_length(int arr[][], int i, int j, int s) {
		
		if(j+s >index)
			return false;
		
		if(Math.abs(arr[i][j] - arr[i][j+1]) >=2)
			return false;
		
		//현재 기준으로 오른쪽이 더 큰경우, 왼쪽을 봐야
		if(arr[i][j] < arr[i][j+1]) {
			if(j-s <0)
				return false;
			for(int x=0; x<s; x++) {
				
				for(int k =j; k>j-s; k--) {
					
					if(arr[i][k-1] !=arr[i][k])
						return false;
				}
				
			}
		}
		else {
			for(int x=0; x<s; x++) {
				
				for(int k =j+1; k<j+s; k++) {
					
					if(arr[i][k] !=arr[i][k+1])
						return false;
				}
				
			}
		}
		
		return true;
	}
	
	public static boolean check_length_v2(int arr[][], int i, int j, int s) {
		
		if(i+s >index)
			return false;
		if(Math.abs(arr[j][i] - arr[j][i+1]) >=2)
			return false;
		
		if(arr[j][i] < arr[j+1][i]) {
			if( j-s<0)
				return false;
			
			for(int x=0; x<s; x++) {
				
				for(int k =j; k>j; k--) {
					
					if(arr[k][i] !=arr[k-1][i])
						return false;
				}
				
			}
			
		}
		else {
			for(int x=0; x<s-1; x++) {
				
				for(int k =j+1; k<j+s; k++) {
					
					if(arr[k][i] !=arr[k+1][i])
						return false;
				}
				
			}
		}
		
	
	
		return true;
	}

}
