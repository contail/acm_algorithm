package beak_14502;
import java.util.*;
public class Main {

	static int n,m;
	static Queue<Node>queue = new LinkedList<Node>();
	static Queue<Node> vi = new LinkedList<Node>();
	static boolean checked[][];
	
	
	static final int Virus =2;
	static final int Safe_area = 0;
	static final int Wall = 1;
	static int dx[] = {0,-1,1,0};
	static int dy[] = {1,0,0,-1};
	
	static class Node{
		int x,y,z;
		Node(int x, int y,int z){
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}
	
	public static void reset_map(int map[][], int arr[][]) {
		
		map = new int[n][m];
		map = deep_copy(arr);
		checked  = new boolean[n][m];
		queue = new LinkedList<Node>();
		
//		for(int i=0; i<n; i++) {
//			for(int k=0; k<m; k++) {
//				System.out.print(map[i][k] + " ");
//				}
//				System.out.println();
//			
//		}
//		
		
		for(int i=0; i<n; i++) {
			for(int k=0; k<m; k++) {
				if(map[i][k] == Virus) {
					vi.add(new Node(i,k,0));
					queue.add(new Node(i,k,0));
					checked[i][k] = true;
				}
			}
			
		}
	
	}
	
	public static int bfs(int map[][]) {
		int count =0;
		
		while(!queue.isEmpty()){
			
			int x = queue.peek().x;
			int y = queue.peek().y;
			int z = queue.peek().z;
		
			count++;
			queue.remove();
			for(int i=0; i<4; i++) {
				int next_x = x+dx[i];
				int next_y = y+dy[i];
				
				if(next_x >=0 && next_y >=0 && next_y<m && next_x<n)
					if(map[next_x][next_y]==0 && checked[next_x][next_y]==false) {
						checked[next_x][next_y]=true;
						
						queue.add(new Node(next_x,next_y,z+1));
						
					}
				
				
			}
		//	System.out.println(z+ "=====count========");
			
		}
		
//
//		for(int ii=0; ii<n; ii++) {
//			for(int kk=0; kk<m; kk++) {
//				System.out.print(map[ii][kk] + " ");
//			}
//			System.out.println();
//
		return count;
	}
	
	public static int[][] deep_copy(int arr[][]) {
		int dcopy [][] = new int [n][m];
		System.arraycopy(arr, 0, dcopy, 0, arr.length);
		return dcopy;
	}
	
	public static void main(String[] args) {
		int map[][];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int wall_count =0;
		map = new int[n][m];
	
		checked = new boolean[n][m];
		for(int i=0; i<n; i++) {
			for(int k=0; k<m; k++) {			
				map[i][k] = sc.nextInt();
				if(map[i][k] == Virus) {
					vi.add(new Node(i,k,0));
					queue.add(new Node(i,k,0));
					checked[i][k] = true;
				}
					
				else if(map[i][k] == Wall)
						wall_count++;
			}
		}
	

		int max_safe_area=0;
		int count =0;
		for(int i=0; i<n; i++) {
			for(int k=0; k<m; k++) {
				for(int a=0; a<n; a++) {
					for(int b=0; b<m; b++) {
						for(int c=0; c<n; c++) {
							for(int d=0; d<m; d++) {
								if(map[i][k] !=Safe_area || map[a][b] !=Safe_area || map[c][d]!=Safe_area || (i==a && k==b) 
										|| (i==c && k==d) ||(a==c && b==d)) {
									continue;
							}
								count++;
								map[i][k] =1;
								map[a][b] =1;
								map[c][d] =1;
								
								
//								for(int ii=0; ii<n; ii++) {
//									for(int kk=0; kk<m; kk++) {
//										System.out.print(map[ii][kk] + " ");
//									}
//									System.out.println();
//								}
//									System.out.println();
//							
//								for(int ii=0; ii<n; ii++) {
//									for(int kk=0; kk<m; kk++) {
//										System.out.print(prev_map[ii][kk] + " ");
//									}
//									System.out.println();
//								}
//								
//								System.out.println(map);
//								System.out.println(prev_map);
//							
								
							int virus_count = bfs(map);
							//System.out.println(virus_count);
							if( max_safe_area < n*m - virus_count-wall_count-3) {
//								for(int ii=0; ii<n; ii++) {
//									for(int kk=0; kk<m; kk++) {
//										System.out.print(map[ii][kk] + " ");
//									}
//									System.out.println();
//								}
								max_safe_area=n*m - virus_count-wall_count-3;

							}
							
							map[i][k] =0;
							map[a][b] =0;
							map[c][d] =0;
							queue = new LinkedList<Node>();
							checked  = new boolean[n][m];
							for(int ii=0; ii<n; ii++) {
								for(int kk=0; kk<m; kk++) {
									if(map[ii][kk] == Virus) {
										vi.add(new Node(ii,kk,0));
										queue.add(new Node(ii,kk,0));
										checked[ii][kk] = true;
									}
								}
							
							}
							
								
								
						}
						
							
						}
					}
				}
			}
		}
		
	
		

	
		System.out.println(max_safe_area);
		// TODO Auto-generated method stub

	}

}
