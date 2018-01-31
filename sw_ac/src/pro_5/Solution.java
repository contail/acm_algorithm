package pro_5;
import java.util.*;

public class Solution {
	
	
	static int N, K;
	static int Max=0;
	static int dx[]= {1,-1,0,0};
	static int dy[] = {0,0,1,-1};
	static boolean checked[][] ;
	static ArrayList<Integer> al;
	static int arr[][];
	static int max_count =0;
	static int using = 0;
	public static void dfs(int next_x, int next_y, int step) {
		
		max_count = max_count > step ? max_count : step;
	//	al.add(arr[next_x][next_y]);
		
		//if (step ==1)
		checked[next_x][next_y] = true;
		//	System.out.println(next_x + "==================" + next_y +"========================"+ step + "=====================================" + using);
		for(int i=0; i<4; i++) {
			int n_x = dx[i] + next_x;
			int n_y = dy[i] + next_y;
			
			
			
			if(n_x >=0 && n_y>=0 && n_x<N &&n_y<N) {
				
				if(checked[n_x][n_y])
				continue;
				 
				if(arr[n_x][n_y] < arr[next_x][next_y] ) {
					 checked[next_x][next_y] = true;
						dfs(n_x, n_y, step+1);
						checked[next_x][next_y]=false;
				 }
			
				 else  {
						
						
						if(arr[n_x][n_y]-K < arr[next_x][next_y] && using==0) {
						//	System.out.println("=============" + next_x + "========deleted==========" + next_y);
							int temp = arr[n_x][n_y];
							arr[n_x][n_y] = arr[next_x][next_y]-1;
							using =1;
						//	System.out.println(n_x +"=====================" + "?????======" + n_y + "===========using====" + using);
							checked[next_x][next_y] = true;
							dfs(n_x, n_y, step+1);
							//System.out.println(n_x +"==========out===========" + n_y);
							using =0;
							arr[n_x][n_y] = temp;
							checked[next_x][next_y] = false;
							
							
						}
								
					}
					
						
					
				
	
				}
			}
		
		checked[next_x][next_y]=false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		int testcase = sc.nextInt();
		int start=0;
		while(testcase -- >0) {
			N =sc.nextInt();
			K  =sc.nextInt();
			
			arr = new int[N][N];
			int bong = 0;
			max_count =0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					arr[i][j] = sc.nextInt();
					bong = bong < arr[i][j] ? arr[i][j] : bong;
				}
			}		
			for(int i=0; i<N;i++) {
				for(int j=0; j<N;j++) {
					al = new ArrayList();
					checked = new boolean[N][N];
					if( arr[i][j]== bong)
							dfs(i,j,1);
				}
			}
		//	checked = new boolean[N][N];
		//	dfs(2,3,2,3,1);
			
			System.out.println("#"+ ++start + " "+max_count );
		}

	}

}
