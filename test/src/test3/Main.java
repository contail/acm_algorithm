package test3;
import java.util.*;
public class Main {
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int arr[][];
	static boolean checked[][];
	static int bfs_count =0;
	static Queue <Node> bfs = new LinkedList<Node>();
	
	public static void bfs(int k) {
		
		while(!bfs.isEmpty()) {
			
			int current_x = bfs.peek().x;
			int current_y = bfs.peek().y;
			bfs.remove();
			for(int i=0; i<4; i++) {
				int rx = current_x + dx[i];
				int ry = current_y + dy[i];		
				if(rx >=1 && ry>=1 && rx<=k && ry<=k && checked[rx][ry]==false && arr[rx][ry]!=0) {
					arr[rx][ry]=bfs_count;
					bfs.add(new Node(rx, ry));
					checked[rx][ry] = true;
				}
			}
			
			if(bfs.isEmpty()) {
				
				int count =0;
				for(int i=1; i<=k; i++) {
					for(int z=1; z<=k; z++) {
						if(arr[i][z]==1 && count==0 && checked[i][z] ==false) {
							bfs_count +=1;
							bfs.add(new Node(i,z));
							arr[i][z]=bfs_count;
							checked[i][z] =true;
							count+=1;
							
						}
					}
				}
				
			}
		}
		
	}
	
	static class Node {
		int x, y;
		Node(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ts= sc.nextInt();
		sc.nextLine();
		int count =0;
		checked = new boolean[1500][1500];
		arr = new int [1500][1500];
		for(int i=1; i<=ts; i++) {
			String a=sc.nextLine();
			
			ArrayList<Integer> al = new ArrayList<Integer>();
			StringTokenizer st = new StringTokenizer(a, " ");
			
			int test = st.countTokens();
			
			int remove_count = 0;
			for(int k=0; k<test; k++) {
				String data = st.nextToken();
				
				al.add(Integer.parseInt(data));
				
			}
			
		
			for(int k=1; k<=ts; k++) {
				arr[i][k]=Integer.parseInt(al.get(k-1)+"");
				if(arr[i][k]==1 && count==0) {
					bfs.add(new Node(i,k));
					bfs_count+=1;
					arr[i][k]=bfs_count;
					checked[i][k] =true;
					count+=1;
					
				}
			}
		}
		
		bfs(ts);
		System.out.println(bfs_count);
		int check_arr[] = new int [bfs_count];
		for(int i=1; i<=bfs_count; i++) {
			int result_count =0;
			for(int k=1; k<=ts;k++) {
				for(int z=1; z<=ts; z++) {
					if(arr[k][z] ==i) {
						result_count+=1;
					}
				}
			}
			check_arr[i-1] = result_count;
			
		}
		
		Arrays.sort(check_arr);
		for(int i=0; i<bfs_count; i++) {
			System.out.println(check_arr[i]);
		}
//		
		
//		for(int i=1; i<=ts; i++) {
//			for(int k=1; k<=ts; k++) {
//				System.out.print(arr[i][k] +" ");
//			}
//			System.out.println();
//		}
		
	}

}