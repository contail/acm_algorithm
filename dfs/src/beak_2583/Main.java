package beak_2583;
import java.util.*;
public class Main {
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	static int arr[][];
	static boolean checked[][];
	static Queue<Node> queue = new LinkedList<Node>();
	static int m,n,k;
	static int total_count=0;
	static int temp_count=0;
	static int count =0;
	static ArrayList<Integer> al = new ArrayList<Integer>();
	
	static class Node{
		int x,y;
		Node(int x, int y){
			this.x= x;
			this.y = y;			
		}
	}
	
	public static void bfs() {
		while(!queue.isEmpty()) {
			int x = queue.peek().x;
			int y = queue.peek().y;
			queue.remove();
			for(int i=0; i<4; i++) {
				int next_x = x+dx[i];
				int next_y = y+dy[i];
				
				if(next_x >=0 && next_y>=0 && next_x<m && next_y<n) {
					if(arr[next_x][next_y] ==0 && checked[next_x][next_y]==false)
					{
						queue.add(new Node(next_x,next_y));
						arr[next_x][next_y] =2;
						checked[next_x][next_y]=true;
						count++;
					}
				}
			}
		}
		
		al.add(count);
		count =0;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		k = sc.nextInt();
		arr = new int [m][n];
		checked = new boolean[m][n];

		for(int i=0; i<k; i++) {
			int y = sc.nextInt();
			int x = sc.nextInt();
			int y2 = sc.nextInt();
			int x2 = sc.nextInt();	
			for(int x_1=x; x_1<x2; x_1++) {
				for(int y_1=y; y_1<y2; y_1++) {
					arr[x_1][y_1]=1;
				}
			}
		}

		for(int i=0; i<m; i++) {
			for(int k=0; k<n; k++) {
				
				if(arr[i][k] ==0 && count ==0) {
					checked[i][k] =true;
				
					queue.add(new Node(i,k));
					count++;
					bfs();
					
				}
			}
		
		}
	
		Collections.sort(al);
		System.out.println(al.size());
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
		
	}


}
