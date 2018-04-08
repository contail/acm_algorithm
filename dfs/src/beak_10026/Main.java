package beak_10026;
import java.util.*;
public class Main {
	
	static boolean check[][];
	static int arr[][];
	static int arr_v2[][];
	static int count;
	static int index;
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		index =sc.nextInt();
		arr = new int [index][index];
		arr_v2 = new int [index][index];
		check = new boolean[index][index];
		for(int i=0; i<index; i++) {
			String a = sc.next();
			for(int k=0; k<index; k++) {
				if(a.charAt(k) == 'R') {
					arr[i][k] = 0;
					arr_v2[i][k]=0;
				}
				else if(a.charAt(k) == 'G') {
					arr[i][k] = 1;
					arr_v2[i][k]=0;
				}
				else {
					arr[i][k] = 2;
					arr_v2[i][k]=1;
				}
			}
		}
		
		
		for(int i=0; i<index; i++) {
			for(int k=0; k<index; k++) {
				
				if(!check[i][k] && arr[i][k] ==0) {
					dfs(i,k,0);
					count++;
				}
				if(!check[i][k] && arr[i][k] ==1) {
					dfs(i,k,1);
					count++;
				}
				if(!check[i][k] && arr[i][k] ==2) {
					dfs(i,k,2);
					count++;
				}
				
			}
		}
		System.out.print(count + " ");
		count =0;
		check = new boolean[index][index];
		for(int i=0; i<index; i++) {
			for(int k=0; k<index; k++) {
				
				if(!check[i][k] && arr_v2[i][k] ==0) {
					dfs_v2(i,k,0);
					count++;
				}
				if(!check[i][k] && arr_v2[i][k] ==1) {
					dfs_v2(i,k,1);
					count++;
				}
			
				
			}
		}
		
		System.out.println(count);
		
		
		
	}
	
	public static void dfs(int x, int y, int current) {
		
		check[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int next_x = dx[i] + x;
			int next_y = dy[i] + y;
			
			if(next_x>=0 && next_x<index && next_y>=0 && next_y<index && !check[next_x][next_y] && arr[next_x][next_y] == current) {
				dfs(next_x,next_y,current);
			}
		}
		
		
		
	}
	
	public static void dfs_v2(int x, int y, int current) {
		check[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int next_x = dx[i] + x;
			int next_y = dy[i] + y;
			
			if(next_x>=0 && next_x<index && next_y>=0 && next_y<index && !check[next_x][next_y] && arr_v2[next_x][next_y] == current) {
				dfs_v2(next_x,next_y,current);
			}
		
		}
	}

}
