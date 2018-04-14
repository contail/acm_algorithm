package beak_4963;
import java.util.*;
public class Main {
	
	static int x, y;
	static int arr[][];
	static boolean check[][];
	static int dx[] = {-1,0,1,0,-1,1,1,-1};
	static int dy[] = {0,1,0,-1,1,1,-1,-1};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		while(true){
			y =sc.nextInt();
			x = sc.nextInt();
			if(x==0 && y==0)
				break;
			int total_count =0;
			arr=new int[x][y];
			check = new boolean[x][y];
			

			for(int i=0; i<x; i++) {
				for(int k=0; k<y; k++) {
					arr[i][k] = sc.nextInt();
				}
			}
	 
			
			for(int i=0; i<x; i++) {
				for(int k=0; k<y; k++) {
					if(arr[i][k]!=0 && !check[i][k]) {
						
						dfs(i,k);
						total_count++;
						
					}
				}
			}
			
			System.out.println(total_count);
			
			
		}
	}

	public static void dfs(int i, int k) {
		check[i][k] = true;
		
		for(int z=0; z<8; z++) {
			int next_x = dx[z] + i;
			int next_y = dy[z] + k;
			
			if(next_x >=0 && next_y >=0 && next_x<x && next_y < y &&!check[next_x][next_y] && arr[next_x][next_y]!=0)
				dfs(next_x,next_y);
		}
		// TODO Auto-generated method stub
		
	}

}
