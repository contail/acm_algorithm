package beak_2206;
import java.util.*;
public class Main {

	static int dx[]= {1,-1,0,0};
	static int dy[] = {0,0,1,-1};
	static Queue<Node> queue = new LinkedList();
	static boolean checked[][][];
	static int arr[][];
	static int n,m;
	static int min = 987654321;
	static class Node{
		int x, y, z , use;
		Node(int x, int y, int z, int use){
			this.x = x;
			this.y =y;
			this.z = z;
			this.use = use;
		}
	}
	
	public static void bfs() {
			 
		boolean find =false;
		boolean using_wall = false;
		
		 while(!queue.isEmpty() && !find) {
			 int que  =queue.size();
			 for(int q=0; q<que; q++) {
				 int x = queue.peek().x;
				 int y = queue.peek().y;
				 int z = queue.peek().z;
				 int use = queue.peek().use;
				 queue.remove();	
				 
				// System.out.println( x + "===== " + y);
				 if(x == n-1 && y==m-1) {
					 min =z;
					 find = true;
					 break;
				 }
				 
				 for(int i=0; i<4; i++) {
					 int nx = x+dx[i];
					 int ny = y+dy[i];
					 
					 if(nx <0 || ny <0 || nx>=n || ny>=m)
						 continue;
					 
					 if(arr[nx][ny] ==1) {
						 if(use==1) {
							 continue;
						 }
						 else {
							 if(!checked[nx][ny][1]) {
							 checked[nx][ny][1] = true;
							 queue.add(new Node(nx,ny,z+1,1));
							 }
						 }
					 }
					 else {
						 if(!checked[nx][ny][use])
							 queue.add(new Node(nx,ny,z+1,use));
							 checked[nx][ny][use]=true;
							 
					 }
				 }
				 
				 
			 }				 
		}
		 
		 if(find ==false)
			 min=-1;
		 System.out.println(min);
							
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int [n][m];
		checked = new boolean[n][m][2];
		
		for(int i=0; i<n;i++) {
			String b = sc.next();
			for(int k=0; k<m; k++) {
				arr[i][k] = Integer.parseInt(b.charAt(k)+"");
			}
				
		}
			
		
		 queue.add(new Node(0,0,1,0));
		 bfs();
		// System.out.println(min);
		// TODO Auto-generated method stub
		

	}

}
