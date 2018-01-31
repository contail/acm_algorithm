package pro_6;
import java.util.*;
public class Solution {

	static int WALL = 4;
	static int N,M,K;
	static int dx[]= {-1,1,0,0}; //상, 하, , 우  
	static int dy[] = {0,0,-1,1};
	static int arr[][][];
	static boolean checked[][];
	static int checking [];
	
	static Queue<Node> queue = new LinkedList<Node>();
	static int max=0;
	static class Node{
		int x,y,mi,dir;
		
		Node(int x, int y, int mi, int dir){
			this.x=x;
			this.y=y;
			this.mi=mi;
			this.dir = dir;
		}
	}
	
	public static int change_dir(int x) {
		if( x==1) {
			x=2;
		}else if(x==2) {
			x=1;
		}
		else if(x==3)
			x=4;
		else if(x==4)
			x=3;
		return x;
	}
	
	public static void bfs() {
		
		while(M-->0) {
			
		
		int queue_size = queue.size();
	//	System.out.println("=======================================" + M +"===========================");
		for(int i=0; i<queue_size; i++) {
			
			int x = queue.peek().x;
			int y = queue.peek().y;
			int mi = queue.peek().mi;
			int dir = queue.peek().dir;
			int nx = x+dx[dir-1];
			int ny = y+dy[dir-1];
			queue.remove();
			
			
		//	System.out.println(nx + "+====" + ny);
			//보호벽이 있는 경우 
			if(nx  == 0 || ny ==0  || nx == N-1 || ny ==N-1) {
				dir = change_dir(dir);
				mi/=2;
				
	//				System.out.println(nx + " l;==================================================================================================================;" +y + dir) ;
				queue.add(new Node(nx,ny,mi,dir));
			}else {
				
				queue.add(new Node(nx,ny,mi,dir));
			}
			
			
		}
		
		//map 정보 갱신 
		queue_size = queue.size();
		for(int i=0; i<queue_size; i++) {
			
			int x = queue.peek().x;
			int y = queue.peek().y;
			int mi = queue.peek().mi;
			int dir = queue.peek().dir;
			queue.remove();
			//int nx = x+dx[dir-1];
			//int ny = y+dx[dir-1];
		//	System.out.println(x +"====================" + y + "+===== " + dir);
			if (arr[x][y][1] > mi) {
				
				arr[x][y][0] +=mi;
			}
			else {
				arr[x][y][0] += mi;
				arr[x][y][1] =mi;
				arr[x][y][2] = dir;
				
			}
			
		}
		
		for(int i=0; i<N; i++) {
			for(int k=0; k<N; k++) {
				if(arr[i][k][0] !=0)
					queue.add(new Node(i,k,arr[i][k][0],arr[i][k][2]));
				if(M!=0) {
					arr[i][k][0]=0;
					arr[i][k][1]=0;
					arr[i][k][2]=0;
				}
			}
		 }
		}
		
		
		for(int i=0; i<N; i++) {
			for(int k=0; k<N; k++) {
				if(arr[i][k][0] !=0)
					max+=arr[i][k][0];
			}
		 }
		
//		System.out.println(max+"e");
		
				
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int start =0;
		
		while(T-- >0) {
			N=sc.nextInt();
			M= sc.nextInt();
			K=sc.nextInt();
			queue =new LinkedList();
			arr= new int [N][N][3];
			for(int i=0; i<K; i++) {
				int a = sc.nextInt();
				int b= sc.nextInt();
				int c = sc.nextInt();
				int d= sc.nextInt();
			
				queue.add(new Node(a,b,c,d));
		//		checking[c] =d;
			}
			
			
			bfs();
			
			System.out.println("#"+ ++start + " "+max);
			max=0;
		}
		// TODO Auto-generated method stub

	}

}
