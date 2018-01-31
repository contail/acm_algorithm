package beak_1018;
import java.util.*;

public class Main {
	static int arr[][];
	static int dx[] = {1,0};
	static int dy[] = {0,1};
	static int []check_w[] = {{0,1,0,1,0,1,0,1},
							 {1,0,1,0,1,0,1,0},
							 {0,1,0,1,0,1,0,1},
							 {1,0,1,0,1,0,1,0},
							 {0,1,0,1,0,1,0,1},
							 {1,0,1,0,1,0,1,0},
							 {0,1,0,1,0,1,0,1},
							 {1,0,1,0,1,0,1,0}};
	static int []check_b[] = 
			{
			 {1,0,1,0,1,0,1,0},
			 {0,1,0,1,0,1,0,1},
			 {1,0,1,0,1,0,1,0},
			 {0,1,0,1,0,1,0,1},
			 {1,0,1,0,1,0,1,0},
			 {0,1,0,1,0,1,0,1},
			 {1,0,1,0,1,0,1,0},
			 {0,1,0,1,0,1,0,1}};
	
	static class Node{
		int x, y;
		int z;
		Node(int x, int y){
			this.x = x;
			this.y = y;
		}
		Node(int x, int y, int z){
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue<Node> queue = new LinkedList<Node>();
		Queue<Node> queue1 = new LinkedList<Node>();
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		arr = new int[m][n];
		
		for(int i=0; i<=m-8; i++) {
			for(int k=0; k<=n-8; k++)
				queue.add(new Node(i,k));
		}
		
		for(int i=0; i<m; i++) {
			String a = sc.next();
			int result =0;
			for(int k=0;k<n;k++) {
				if (a.charAt(k) == 'W') {
					result =0;
				}
				else {
					result =1;
				}
				arr[i][k] = result;
			}
		}
		
		
		int final_result[] = new int[queue.size()];
//		System.out.println(arr[0][0]+ " size ");
	
		final_result[0]=987654321;
		while(!queue.isEmpty()) {
			int count =0;
			int count1 =0;
			int check_x = queue.peek().x;
			int check_y = queue.peek().y;
//			System.out.println(8+check_x + "check_x");
//			System.out.println(8+check_y +  "check_y");
			
			queue.remove();
			for(int i=check_x; i<8+check_x;i++) {
				for(int k=check_y; k<8+check_y; k++) {
					
					if(arr[i][k] != check_w[i-check_x][k-check_y])
						count++;
					if(arr[i][k] != check_b[i-check_x][k-check_y])
						count1++;
					
					
//					for(int z=0; z<2; z++) {
//						int current_x = dx[z]+i;
//						int current_y = dy[z]+k;
//						if(current_x >=0 && current_y>=0 && current_x<m-check_x && current_y <n-check_y) {
//							
//							if(i+2 <m-check_x && k+2 <n-check_y) {
//								if(arr[i][k] != arr[i+2][k+2]) {
//									queue1.add(new Node(i,k,arr[i][k]));
//									arr[i][k] = arr[i+2][k+2];
//									count ++;
//								}
//									
//								
//							}
//							
//							if(arr[i][k] == arr[current_x][current_y]) {
//								count++;
//								if(arr[i][k]==1) {
//									queue1.add(new Node(current_x,current_y,1));
//									
//									arr[current_x][current_y]=0;
//								}
//								else {
//									queue1.add(new Node(current_x,current_y,0));
//									arr[current_x][current_y]=1;
//								}
//							}
//						}
//						
//					}
					
					
					
				}
				
				
				
				
			}
//			while(!queue1.isEmpty()){
//				int x = queue1.peek().x;
//				int y = queue1.peek().y;
//				int z = queue1.peek().z;
//				System.out.println( x + " ddd");
//				queue1.remove();
//				
//				arr[x][y] = z;
//			}
//			System.out.println(count + " count ");
			int result_count;
			if(count > count1)
				result_count=count1;
			else
				result_count =count;
			if(final_result[0] > result_count )
				final_result[0]=result_count;
			
			
		}
		
//		for(int i=0; i<8; i++) {
//			for(int k=0; k<8; k++) {
//				System.out.print(arr[i][k] + " ");
//			}
//			System.out.println();
//		}
		
		//Arrays.sort(final_result);
		System.out.println(final_result[0]);
	}

}

/*
 8 8
WWWWWWBW
WWWWWWWB
WWWWWWBW
WWWWWWWB
WWWWWWBW
WWWWWWWB
WWWWWWBW
WWWWWWWB 


8 8
WWWWWBWB
WWWWWWBW
WWWWWBWB
WWWWWWBW
WWWWWBWB
WWWWWWBW
WWWWWBWB
WWWWWWBW
 */
 

