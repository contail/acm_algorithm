package beak_2468;
import java.util.*;

public class Main {

	static int dx [] = {1,-1,0,0};
	static int dy [] = {0,0,1,-1};
	
	static class Node{
		int x, y;
		Node(int x, int y){
			this.x = x;
			this.y =y;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList();
		
		int arr[][] = new int[n][n];
		boolean checked[][];
		Queue<Node> queue;
		for(int i=0; i<n; i++) {
			for(int k=0; k<n; k++) {
				arr[i][k] = sc.nextInt();
				if(al.indexOf(arr[i][k]) ==-1)
					al.add(arr[i][k]);
			}
		}
		
		Collections.sort(al);
		int max_count =1;
		
		for(int i=0; i<al.size();i++) {
			
			queue = new LinkedList();
			checked = new boolean [n][n];
			for(int k=0; k<n; k++) {
				for(int j =0; j<n; j++) {
					if(arr[k][j] == al.get(i) && arr[k][j]!=0) {
						arr[k][j] =0;
						
					}
//					else if(arr[k][j]!=0)
//						queue.add(new Node(k,j));
					
						
				}
			}
			
			
			
			int temp =0;
			for(int k=0; k<n; k++) {
				for(int j=0 ; j<n; j++) {
					if(!checked[k][j] && arr[k][j]!=0) {
						queue.add(new Node(k,j));
						temp++;
					}
					
					
					while(!queue.isEmpty()) {
						int queue_size = queue.size();
						//System.out.println(queue_size + "====");
						
						for(int w=0; w<queue_size; w++) {
							
							int x = queue.peek().x;
							int y = queue.peek().y;
						//	System.out.println(x + "===========" +y);
							queue.remove();
							checked[x][y] = true;
							for(int v =0; v<4; v++) {
								int nx = dx[v]+x;
								int ny = dy[v]+y;
								
								if(nx <0 || ny < 0 || nx>=n || ny>=n) {
									continue;
								}
									
								if(checked[nx][ny])
									continue;
								if(arr[nx][ny]!=0) {
									checked[nx][ny] =true;
									queue.add(new Node(nx,ny));
								}
								
							}
							
							
						}
						
						
					}
						
				}
			}
			
			max_count = max_count < temp ? temp : max_count;
		}
		
		System.out.println(max_count);
		// TODO Auto-generated method stub

	}

}
