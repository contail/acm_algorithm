package ss;


import java.util.*;

public class test {
	

	static int arr[][] = new int [1001][1001];
	static boolean  [][] checked = new boolean [1001][1001];
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0, 1,-1};
	
	static int M;
	static int N;
	static Queue<Node> bfs=  new LinkedList<Node>();;
	
	public static void bfs() {
	    
	
		
		
		
		int temp_count =0;
		while(!bfs.isEmpty()) {
			
			int current_x = bfs.peek().x;
			int current_y = bfs.peek().y;
			int count = bfs.peek().z;
			temp_count = count;
			
			
			
			bfs.remove();
			
		
		//	System.out.println(current_y + "================ " + current_x);
			
			
				
				
				
				//System.out.println(temp);
				
			
					int rx =0;
					int ry=0;
					for(int i=0; i<4; i++) {
						
						rx = dx[i]+ current_x;
						ry = dy[i] + current_y;
						
						if(rx >=1 && ry>=1 && rx <=N && ry <=M && arr[rx][ry] ==0 && checked[rx][ry]!=true) {
							
							int tcurrent_x=  rx;
							int tcurrent_y =ry;
							//System.out.println(rx + " " + ry + "       ================    " + count);
							checked[tcurrent_x][tcurrent_y]= true;
							arr[tcurrent_x][tcurrent_y] =1;
							bfs.add(new Node(tcurrent_x, tcurrent_y, count+1));
							
							
							
						}
						
						
						
						
					
				}
			

			
			
					
		}
		int check_int =0;
		for(int i=1; i<=N; i++) {
			for(int k=1; k<=M; k++) {
				if(arr[i][k]==0) {
					check_int=1;
				}
				}
			
			
			}
		
		if (check_int ==1)
			System.out.println(-1);
		else
			System.out.println(temp_count);
		
		
	}
	
	static class Node {
		
		int x, y, z;
		
		Node(int x, int y, int z){
			this.x = x;
			this.y = y;
			this.z = z;
		}
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		M = sc.nextInt();
		N = sc.nextInt();
		
		int temp_2=0;
		
		for(int i=1; i<=N; i++) {
		
			for(int k=1; k<=M; k++) {
				arr[i][k] = sc.nextInt();
				
				if(arr[i][k] ==1) {
					bfs.add(new Node(i,k,0));
					checked[i][k]=true;
					temp_2+=1;
				}
				
			}
		}
		
		bfs();
		
		
		
		
	
		


		
	
		
		

		

	}

}
