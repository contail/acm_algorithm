package beak_1012;
import java.util.*;
public class Main {
	static int arr[][];
	static int n;
	static int m;
	static boolean checked[][];
	static int count=0;
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0, 0};
	static Queue<Node> queue = new LinkedList<Node>();
	
	static class Node{
		int x, y;
		Node(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	public static int bfs() {
		
		while(!queue.isEmpty()) {
			int x = queue.peek().x;
			int y = queue.peek().y;	
			queue.remove();
			
			for(int i=0; i<4; i++) {
				int next_x = x+dx[i];
				int next_y = y+dy[i];
				
				if(next_x<n && next_x>=0 && next_y<m && next_y>=0) {
					if(arr[next_x][next_y]==1 && checked[next_x][next_y] ==false) {
						queue.add(new Node(next_x,next_y));
						checked[next_x][next_y]=true;
						
					}
				}
			}
			
		}
		
		for(int i=0; i<n; i++) {
			for(int k=0; k<m; k++) {
				
				if(arr[i][k] ==1 && checked[i][k]==false) {
					queue.add(new Node(i,k));
				//	System.out.println(i+ " ==i==" + k+"===k===");
					checked[i][k] =true;
					count++;
					bfs();
				}
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		while(testcase-- >0) {
			n= sc.nextInt();
			m= sc.nextInt();
			int bacu = sc.nextInt();
			int check_count =0;
			arr = new int[n][m];
			checked = new boolean[n][m];
			count =0;
			for(int i=0; i<bacu; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				arr[x][y] =1;
				if(check_count==0) {
				
					queue.add(new Node(x,y));
				//	System.out.println(x + " x" + y + " y");
					checked[x][y] = true;
					count++;
					check_count++;
				}
					
			}
			
			System.out.println(bfs());
			
			
		}
		
//		for(int i=0; i<n; i++) {
//			for(int k=0; k<m; k++) {
//				System.out.print(arr[i][k] + " ");
//			}
//			System.out.println();
//		}
		// TODO Auto-generated method stub

	}

}



