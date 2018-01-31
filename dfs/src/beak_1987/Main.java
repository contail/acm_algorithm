package beak_1987;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int map[][] =new int[21][21];
	static boolean visited[] = new boolean[21];
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,1,-1};
	static int maxstep=0;
	static int n,m;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=n; i++) {
			String a = br.readLine();
			for(int k=1; k<=m; k++) {
				map[i][k] = a.charAt(k-1)-'A';
			}
		}
		
		visited[map[1][1]]= true;
		dfs(1,1,1);

		System.out.println(maxstep);
	}
	
	static public void dfs(int x, int y, int step) {
		maxstep = maxstep > step ? maxstep : step;
		for(int i=0; i<4; i++) {
			int next_x = x +dx[i];
			int next_y = y+dy[i];
			//System.out.println(next_x + "====" + next_y);
			if(next_x<=0 || next_y <=0 || next_x>n || next_y>m)
				continue;
			if(visited[map[next_x][next_y]]==true)
				continue;
			
			visited[map[next_x][next_y]]=true;
			dfs(next_x,next_y,step+1);
			visited[map[next_x][next_y]]=false;
		}
		
	}

}
