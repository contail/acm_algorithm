package beak_7562;
import java.util.*;
public class Main {

	static int dx[] = {-1,1,2,2,1,-1,-2,-2};
	static int dy[] = {2,2,1,-1,-2,-2,-1,1};
	static Queue<Node> queue ;
	static int map[][];
	static boolean checked[][];
	static int dest[];
	static int map_size;
	static public int bfs() {
		
		
		while(queue.isEmpty()!=true) {

			int x = queue.peek().x;
			int y = queue.peek().y;
			
			int temp= queue.peek().z;
			queue.remove();
			if(x == dest[0] && y == dest[1]) {
			
				return temp;
			}
				
			
			for(int i=0; i<8; i++) {
				int next_x = dx[i] + x;
				int next_y = dy[i] + y;

				if(next_x>=0 && next_y >=0&& next_x<map_size &&next_y<map_size) {
		
					if(checked[next_x][next_y]==false)
					{
						checked[next_x][next_y] =true;	
						queue.add(new Node(next_x, next_y,temp+1 ));
						
					}
					
				}
			}

		
		}
		return 0;
	
		
	}
	
	static class Node{
		int x,y,z;
		Node(int x, int y,int z){
			this.x = x;
			this.y = y;
			this.z = z;
			
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int testcase =sc.nextInt();
		
		while(testcase-- >0) {
			map_size =sc.nextInt();
			map = new int [map_size+1][map_size+1];
			checked = new boolean[map_size+1][map_size+1];
			queue = new LinkedList<Node>();
			int x = sc.nextInt();
			int y = sc.nextInt();
			queue.add(new Node(x,y,0));
			dest = new int[2];
			checked[x][y]=true;
			dest[0] = sc.nextInt();
			dest[1] = sc.nextInt();
			System.out.println(bfs());
		}
		// TODO Auto-generated method stub
		
		

	}

}
