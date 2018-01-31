package pro4;

import java.util.*;

public class Solution {

	static int dx[] = { 1, 1, -1, -1 };
	static int dy[] = { 1, -1, -1, 1 };
	static Queue<Node> queue;
	static int n;
	static int max =-1;
	static int f_x, f_y;
	static boolean[][] checked =new boolean[100][100];
	static ArrayList<Integer> al;
	static class Node {
		int x, y, z;

		Node(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}

	public static void start(int arr[][], int x, int y, int next_x,int next_y, int step) {
		int count = 0;
		
		al.add(arr[next_x][next_y]);
		//System.out.println(al);
		checked[next_x][next_y] = true;
	//	System.out.println(next_x + "=============="+ next_y+"==========");
	//	System.out.println(al + "===");
		for(int i=step; i<4; i++) {
			int n_x = next_x+dx[i];
			int n_y = next_y+dy[i];
			
			if(n_x>=1 && n_y >=1 && n_y<=n && n_x<=n) {
				if(!checked[n_x][n_y] &&!al.contains(arr[n_x][n_y]))
					{
					
					start(arr,x,y,n_x,n_y,i);
					}
				else if(n_x ==x && n_y ==y) {
					if(al.size() >max)
						max = al.size();
				}
			}
			
			
			
			//return;
			
		}
		
		checked[next_x][next_y] = false;
			
			al.remove(al.size()-1);
			
		
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		int start=0;
		while(testcase-- >0) {
			max=-1;
			n = sc.nextInt();
			queue = new LinkedList();
			int arr[][] = new int[n + 1][n + 1];
			boolean checeked[][] = new boolean[n + 1][n + 1];

			
			
			for (int i = 1; i <= n; i++) {
				for (int k = 1; k <= n; k++) {
					arr[i][k] = sc.nextInt();
				}
			}
			
			for(int i=1; i<=n; i++) {
				for(int j=2; j<=n; j++) {
					f_x =i;
					f_y =j;
					al = new ArrayList();
					checked= new boolean[100][100];
					start(arr, i, j,i,j,0);
					
					//System.out.println(al);
				}
			}
			
			queue.add(new Node(1, 1, 1));
			if(max <4)
				max= -1;

			System.out.println("#" + ++start + " " + max);
		}

		

		// TODO Auto-generated method stub

	}

}
