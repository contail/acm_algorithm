package beak_3055;
import java.util.*;

public class Main {

	static int arr[][];
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,1,-1};
	static int ss[] = new int[2];
	static int dd[] = new int[2];
	static Queue<Node> queue =  new LinkedList<Node>();
	static Queue<Node> queue1 =  new LinkedList<Node>();
	static int count =0;
	static boolean impossible_check[][];
	
	public static boolean bfs(int row, int col) {
		
		while(!queue.isEmpty() || !queue1.isEmpty() ) {
			count ++;
			int size= queue.size();
			for(int k=0; k<size; k++) {
				int x = queue.peek().x;
				int y = queue.peek().y;
				queue.remove();
				for(int i=0; i<4;i++) {
					int current_x = dx[i] +x;
					int current_y = dy[i] +y;
					if(current_x <row && current_y <col &&current_x>=0 && current_y>=0) {
						if(arr[current_x][current_y] !=2 && arr[current_x][current_y] !=4 && arr[current_x][current_y] !=1) {	
							arr[current_x][current_y]=1;
							queue.add(new Node(current_x,current_y));
						}
					}	
				}
			}
			
	
		
		
		
			int size2= queue1.size();
			for(int k=0; k<size2; k++) {
				int x = queue1.peek().x;
				int y = queue1.peek().y;
				queue1.remove();
				impossible_check[x][y] = true;
				for(int i=0; i<4; i++) {
					int current_x = dx[i] +x;
					int current_y = dy[i]+ y;
					if(current_x <row && current_y <col && current_x>=0 && current_y >=0) {
						if(current_x == dd[0] && current_y==dd[1]) {
//							System.out.println("find");
							return true;
						}
						if(arr[current_x][current_y] !=1 && arr[current_x][current_y] !=2 && impossible_check[current_x][current_y]==false) {
							arr[current_x][current_y]=3;
							impossible_check[current_x][current_y]=true;
							queue1.add(new Node(current_x,current_y));
						}
					}
				}
			}
			
				
		}
		
//		System.out.println(queue1.size() + "size!!");
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		arr = new int[row][col];
		impossible_check  = new boolean[row][col];
		int result =0;
		for(int i=0; i<row;i++) {
			String a = sc.next();
			for(int k=0; k<col; k++) {
				if(a.charAt(k) =='*') {
					queue.add(new Node(i,k));
					result=1;
				}					
				else if(a.charAt(k) =='X') {
					result=2;
				}
				else if(a.charAt(k) =='S') {
					result=3;
					queue1.add(new Node(i,k));
				
				}
				else if(a.charAt(k) =='D') {
					result=4;
					dd[0]=i;
					dd[1]=k;
				}
				else
					result =0;
				arr[i][k]=result;
			}		
		}
		
//		for(int i=0; i<row; i++) {
//			for(int k=0; k<col; k++)
//			{
//				System.out.print(arr[i][k] +" ");
//			}
//			System.out.println();
//		}
		
		if(bfs(row,col)) {
			System.out.println(count);
		}
		else {
			System.out.println("KAKTUS");
		}
//		System.out.println();
//		for(int i=0; i<row; i++) {
//			for(int k=0; k<col; k++)
//			{
//				System.out.print(arr[i][k] +" ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println(count + "count xz");
		
		
	}
	
	static class Node{
		int x, y;
		public Node(int x, int y) {
			this.x= x;
			this.y = y;
		}
	}
	
}
/*
 * 
 
D.*
...
.S.

 */
