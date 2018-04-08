package beak_1012_v2;

import java.util.*;
public class Main {

	static boolean check[][];
	static int count;
	static int arr[][];
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	static int x;
	static int y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- >0) {
			
			x = sc.nextInt();
			y = sc.nextInt();
			int ba = sc.nextInt();
			arr = new int[x+1][y+1];
			check = new boolean[x+1][y+1];
			for(int i=0; i<ba; i++) {
				int map_x = sc.nextInt();
				int map_y = sc.nextInt();
				arr[map_x][map_y] =1;
				
			}
			
			count=0;
			for(int i=0; i<x; i++) {
				for(int k=0; k<y; k++) {
					if(arr[i][k] ==1 && !check[i][k]) {
						
						dfs(i,k);
						count++;
						
					}
				}
			}
			
			System.out.println(count);
			
		}
		
		

	}
	
	
	public static void dfs(int m_x, int m_y) {
		
		check[m_x][m_y] = true;
		
		for(int i=0; i<4; i++) {
			int next_x = m_x +dx[i];
			int next_y = m_y +dy[i];
			if(next_x >=0 && next_x <x && next_y>=0 && next_y<y ) {
				dfs(next_x,next_y);
			}
		}
		
		
	}

}
