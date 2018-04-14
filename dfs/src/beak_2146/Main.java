package beak_2146;
import java.util.*;
public class Main {
	
	static int arr[][];
	static boolean check[][];
	static boolean temp_check[][];
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,-1,1};
	static int index;
	static int min = Integer.MAX_VALUE;
	static int total_count =1;
	static Queue<Node> queue = new LinkedList<Node>();
	static Queue<Node> queue_v2 = new LinkedList<Node>();
	static class Node{
		int x,  y;
		int current;
		int count;
		Node(int x, int y, int current, int count){
			this.x = x;
			this.y = y;
			this.current = current;
			this.count = count;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		index = sc.nextInt();
		arr = new int[index][index];
		check = new boolean[index][index];
		for(int i=0; i<index;i++) {
			for (int k=0; k<index; k++)
				arr[i][k]  =sc.nextInt();
		}
		
		
		for(int i=0; i<index; i++) {
			for(int k=0; k<index; k++)
				if(arr[i][k]!=0 && !check[i][k]) {				
					dfs(i,k);
					total_count ++;
				}
		}
		
 
		for(int i=0; i<index; i++) {
			for(int k=0; k<index; k++) {
			  if (arr[i][k] !=0) {
				  
				  for(int z=0; z<4; z++) {
					  int next_x = i + dx[z];
					int next_y = k + dy[z];
					  if (next_x >=0 && next_y >=0 && next_x<index && next_y <index) {
						  if(arr[next_x][next_y] ==0) {
							  queue.add(new Node(i,k,arr[i][k],0));
							  break;
						  }
					  }
				  }
			  }
			}
		}
		
		while(!queue.isEmpty()) {
			int x = queue.peek().x;
			int y = queue.peek().y;
			int current_value = queue.peek().current;
			int count = queue.peek().count;
			queue_v2.add(new Node(x,y,current_value,count));
			queue.remove();
			temp_check  = new boolean[index][index];
			while(!queue_v2.isEmpty()) {
				
				int x_v2 = queue_v2.peek().x;
				int y_v2 = queue_v2.peek().y;
				int current_value_v2 = queue_v2.peek().current;
				int count_v2 = queue_v2.peek().count;
				temp_check[x_v2][y_v2] = true;
				queue_v2.remove();
				for(int z=0; z<4; z++) {
					  int next_x = x_v2 + dx[z];
					int next_y = y_v2 + dy[z];
					  if (next_x >=0 && next_y >=0 && next_x<index && next_y <index) {
						  if(arr[next_x][next_y] ==0 && !temp_check[next_x][next_y]) {
							  queue_v2.add(new Node(next_x,next_y,current_value,count_v2+1));
							  temp_check[next_x][next_y] = true;
						  }
						  if(arr[next_x][next_y] !=0 && arr[next_x][next_y]!=current_value_v2) {
							  min = Math.min(min, count_v2);
						  }
					  }
				  }
				
			}
		}
		

		System.out.println(min);
		
	}
	public static void dfs(int x, int y) {
		check[x][y] = true;
		
		if(arr[x][y]!=0)
			arr[x][y]= total_count;
		for(int k=0; k<4; k++) {
			int next_x = x + dx[k];
			int next_y = y + dy[k];
			
			if (next_x >=0 && next_y >=0 && next_x<index && next_y <index)
			{
				if(arr[next_x][next_y] !=0 && !check[next_x][next_y]) {
					
					dfs(next_x, next_y);
				}
			}
		}
		
		
	}

}
