package problem_4_4;
import java.util.*;

public class Main {
	static int apple;
	static Queue <Node> queue = new LinkedList<Node>();
	static class Node {
		int x;
		int y;
		Node(int x, int y){
			this.x= x;
			this.y=y;
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int house = sc.nextInt();
		apple = sc.nextInt();
		for(int i=0; i<house; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			queue.add(new Node(x,y));			
		}
		System.out.println(bfs());	
	}	
	public static int bfs() {
		int man_x=0;
		int man_y=0;
		int count =apple;
		int total_count =0;
		while(!queue.isEmpty()) {
			int x = queue.peek().x;
			int y = queue.peek().y;
			queue.remove();
			if (x <man_x || y< man_y)
				continue;
			if(count-((x-man_x +y-man_y)) >0 ) {
				count = count - (x-man_x +y-man_y);
				total_count = total_count + count ;
			}
			else
				break;
			man_x=x;
			man_y=y;		
		}	
		return total_count;
	}
}
