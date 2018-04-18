package beak_2573;

import java.util.*;
public class Main {
	
	static int arr[][];
	static int arr_v2[][];
	static boolean checked[][];
	static int dx [] = {-1,0,1,0};
	static int dy [] = {0,1,0,-1};
	static int x,y;
	static int total_count = 0;
	static Queue<Node> queue = new LinkedList();
	
	static class Node{
		int x, y;
		
		Node(int x, int y){
			this.x =x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		arr = new int [301][301];
		
		checked = new boolean[301][301];
		for (int i=0; i<x; i++) {
			for (int k=0; k<y; k++) {
				int temp  = sc.nextInt();
				arr[i][k] = temp ;
				if(temp !=0)
					queue.add(new Node(i,k));
				
			}
		}
		
	
		int aws = 0;
		boolean check= false;
		while(!queue.isEmpty()) {
			arr_v2 = new int [301][301];
			checked =new boolean[301][301];
			aws++;
			while(!queue.isEmpty()) {
				int i = queue.peek().x;
				int k = queue.peek().y;
				queue.remove();
				for(int z=0; z<4; z++) {
					int next_x = i + dx[z];
					int next_y = k + dy[z];
					if(next_x >=0 && next_y >=0 && next_x<x && next_y <y && arr[next_x][next_y]==0) {
					 
						arr_v2[i][k]++;
					}
				}
			}
			for(int i=0; i<x; i++) {
				for(int k=0; k<y; k++) {
	
						arr[i][k]   =  (arr[i][k] - arr_v2[i][k] >=0) ? arr[i][k] - arr_v2[i][k] : 0 ;
					if(arr[i][k] >0)
						queue.add(new Node(i,k));
				}
			}
			
			for(int i=0; i<x; i++) {
				for(int k=0; k<y; k++) {
	
					System.out.print(arr[i][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
			int temp =0;
			for(int i=0; i<x; i++) {
				for(int k=0; k<y; k++) {
					if(arr[i][k]!=0 && !checked[i][k]) {
						  
						temp++;
						dfs(i,k);
					}
				}
			}
			if(temp >1) {
				check = true;
				break;
			}
		}
		if(!check)
			aws = 0;
		
		System.out.println(aws);
		// TODO Auto-generated method stub

	}

	public static void dfs (int cx, int cy) {
		
		checked[cx][cy] = true;
		for(int i=0; i<4; i++) {
			int next_x = cx+dx[i];
			int next_y = cy +dy[i];
			if(next_x >=0 && next_y >=0 && next_x <x && next_y <y && arr[next_x][next_y] > 0 && !checked[next_x][next_y]) {
				dfs(next_x, next_y);
			}
		}
	}
	 
}
