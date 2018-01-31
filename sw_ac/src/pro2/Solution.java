package pro2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
	static Queue<Node> queue;
	static int n, m, r, c, l;
	static int arr[][];
	static boolean checked[][];
	static int temp [][];

	public static class Node {
		int x, y,z;

		Node(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}
	
	public static boolean check_up(int x, int y) {

		if (x -1 < 0) {
			return false;
		}
		if(checked[x-1][y])
			return false;
		if (arr[x - 1][y] == 5 || arr[x - 1][y] == 6 || arr[x - 1][y] == 1 || arr[x - 1][y] == 2) {
			return true;
		} else {
			return false;
		}

	}
	
	public static boolean check_down(int x, int y) {

		if (x + 1 >= n) {
			return false;
		}
		if(checked[x+1][y])
			return false;
		if (arr[x+1][y] == 1 || arr[x+1][y] == 2 || arr[x+1][y] == 4 || arr[x+1][y] == 7)

			return true;
		else {
			return false;
		}

	}
	
	public static boolean check_right(int x, int y) {

		if (y+ 1 >= m) {
			return false;
		}
		if(checked[x][y+1])
			return false;
		if (arr[x][y + 1] == 1 || arr[x][y + 1] == 3 || arr[x][y + 1] == 6 || arr[x][y + 1] == 7)

			return true;
		else {
			return false;
		}

	}
	
	public static boolean check_left(int x, int y) {
		
	//	System.out.println(y + "====");
		if (y-1< 0) {
			return false;
		}
		if(checked[x][y-1])
			return false;
		if (arr[x][y - 1] == 1 || arr[x][y - 1] == 3 || arr[x][y - 1] == 4 || arr[x][y - 1] == 5) 
			return true;
		else {
			return false;
		}

	}
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int testcase = sc.nextInt();
		
	//	System.out.println(r + "  " + c);
		int time_count = 0;
		int count = 0;
		
		while(testcase-- >0) {
			count=0;
			int temp_count=0;
			n = sc.nextInt();
			m = sc.nextInt();
			r = sc.nextInt();
			c = sc.nextInt();
			l = sc.nextInt();
			queue = new LinkedList<Node>();
			arr = new int[n][m];
			checked = new boolean[n][m];
			temp = new int[n][m];

			for (int i = 0; i < n; i++) {

				for (int k = 0; k < m; k++) {
					arr[i][k] = sc.nextInt();

				}
			}

			queue.add(new Node(r, c,1));
			checked[r][c] = true;
			temp[r][c]=8;
		
			temp_count =0;
		//	System.out.println("=========" + ++time_count + "==========================================");
			int z = queue.size();
//			for(int j =0; j<n;j++) {
//					for(int k=0; k<m;k++) {
//						System.out.print(temp[j][k] + " ");
//					}
//					System.out.println();
//				}
//				System.out.println("=================");
//				System.out.println("=================");
//				System.out.println("=================");
			while(!queue.isEmpty()) {
				int x = queue.peek().x;
				int y = queue.peek().y;
				int countz = queue.peek().z;
//				System.out.println(x + "======" + y + "======");
//				System.out.println(count +"ddddcount");
				queue.remove();
				
				if(countz ==l)
					continue;
				
				
				
				if (arr[x][y] == 1) {
					
						if(check_up(x, y)) {
							queue.add(new Node(x - 1, y,countz+1));
							checked[x - 1][y] = true;
							count+=1;
							temp[x-1][y] = 9;
						}
						if(check_down(x, y)) {
							queue.add(new Node(x + 1, y,countz+1));
							checked[x +1][y] = true;
							count+=1;
							temp[x+1][y] = 9;
						}
						if(check_right(x, y)) {
							queue.add(new Node(x , y+1,countz+1));
							checked[x ][y+1] = true;
							count+=1;
							temp[x][y+1] = 9;
						}
						if(check_left(x, y)) {
							queue.add(new Node(x, y-1,countz+1));
							checked[x ][y-1] = true;
							count+=1;
							temp[x][y-1] = 9;
						}
				
				} 
				else if (arr[x][y] == 2) { // 2랑 연결이 가능한거 1, 2, 4,7 (아래방향), 5,6(위에방향) ,
						
				//	System.out.println(x + "=ddd=d=d==d= +" + y);
					if(check_up(x, y)) {
						queue.add(new Node(x - 1, y,countz+1));
						checked[x - 1][y] = true;
						count+=1;
						temp[x-1][y] = 9;
					}
					if(check_down(x, y)) {
						queue.add(new Node(x + 1, y,countz+1));
						checked[x +1][y] = true;
						count+=1;
						temp[x+1][y] = 9;
					}

				} else if (arr[x][y] == 3) {
					if(check_right(x, y)) {
						queue.add(new Node(x , y+1,countz+1));
						checked[x ][y+1] = true;
						count+=1;
						temp[x][y+1] = 9;
					}
					if(check_left(x, y)) {
						queue.add(new Node(x, y-1,countz+1));
						checked[x ][y-1] = true;
						count+=1;
						temp[x][y-1] = 9;
					}	

				} else if (arr[x][y] == 4) {
					//	System.out.println(x + "====;;===" + y);
					if(check_up(x, y)) {
						queue.add(new Node(x - 1, y,countz+1));
						checked[x - 1][y] = true;
						count+=1;
						temp[x-1][y] = 9;
					}
					if(check_right(x, y)) {
						queue.add(new Node(x , y+1,countz+1));
						checked[x ][y+1] = true;
						count+=1;
						temp[x][y+1] = 9;
					}

				} else if (arr[x][y] == 5) {
					if(check_down(x, y)) {
						queue.add(new Node(x + 1, y,countz+1));
						checked[x +1][y] = true;
						count+=1;
						temp[x+1][y] = 9;
					}
					if(check_right(x, y)) {
						queue.add(new Node(x , y+1,countz+1));
						checked[x ][y+1] = true;
						count+=1;
						temp[x][y+1] = 9;
					}

				} else if (arr[x][y] == 6) {

					if(check_down(x, y)) {
						queue.add(new Node(x + 1, y,countz+1));
						checked[x +1][y] = true;
						count+=1;
						temp[x+1][y] = 9;
					}
					
					if(check_left(x, y)) {
						queue.add(new Node(x, y-1,countz+1));
						checked[x ][y-1] = true;
						count+=1;
						temp[x][y-1] = 9;
					}


				} else if (arr[x][y] == 7) {
					
					if(check_up(x, y)) {
						queue.add(new Node(x - 1, y,countz+1));
						checked[x - 1][y] = true;
						count+=1;
						temp[x-1][y] = 9;
					}
					if(check_left(x, y)) {
						queue.add(new Node(x, y-1,countz+1));
						checked[x ][y-1] = true;
						count+=1;
						temp[x][y-1] = 9;
					}

				}
			

		}
		time_count++;
		
		for(int i=0; i<n;i++) {
			for(int k=0; k<m;k++) {
				if(checked[i][k] ==true)
					temp_count++;
			}
			
		}
		System.out.println("#"+time_count +" "+(temp_count));
		}
		
//		for(int i=0; i<n;i++) {
//			for(int k=0; k<m;k++) {
//				System.out.print(temp[i][k] + " ");
//			}
//			System.out.println("");
//			
//		}

	}

}



/*
 * 	5 6 2 2 6      
	
	
	3 0 0 0 0 3
	2 0 0 0 0 6
	1 3 1 1 3 1
	2 0 2 0 0 2
	0 0 4 3 1 1
	
	3 0 0 0 0 3
	2 0 0 0 0 6
	1 x x x 3 1
	2 0 x 0 0 2
	0 0 4 3 1 1
	
	3 0 0 0 0 3
	2 0 0 0 0 6
	x x x x x 1
	2 0 x 0 0 2
	0 0 x 3 1 1
	
	3 0 0 0 0 3
	x 0 0 0 0 6
	x x x x x x
	x 0 x 0 0 2
	0 0 x 3 1 1
	
	x 0 0 0 0 3
	x 0 0 0 0 x
	x x x x x x
	x 0 x 0 0 x
	0 0 x x x 1
	
	x 0 0 0 0 3
	x 0 0 0 0 x
	x x x x x x
	x 0 x 0 0 x
	0 0 x x x x
	
	
	10 10 4 3 9
	
0 0 0 0 0 0 0 0 0 0
0 0 0 7 5 0 5 0 0 0
0 0 3 2 2 6 0 0 0 0
0 4 7 2 2 2 7 0 0 4
0 3 0 1 1 2 2 0 0 5
0 5 6 x 1 1 1 6 2 5
7 4 1 2 0 0 4 6 0 0
5 3 1 7 0 2 2 6 5 7
7 3 2 1 1 7 1 0 2 7
3 4 0 0 4 0 5 1 0 1

0 0 0 0 0 0 0 0 0 0           
0 0 0 7 5 0 5 0 0 0
0 0 3 2 2 6 0 0 0 0
0 4 7 x 2 2 7 0 0 4
0 3 0 x x 2 2 0 0 5
0 5 6 x 1 1 1 6 2 5
7 4 1 2 0 0 4 6 0 0
5 3 1 7 0 2 2 6 5 7
7 3 2 1 1 7 1 0 2 7
3 4 0 0 4 0 5 1 0 1      

0 0 0 0 0 0 0 0 0 0
0 0 0 7 5 0 5 0 0 0
0 0 3 x 2 6 0 0 0 0  2
0 4 7 x x 2 7 0 0 4  1 2
0 3 0 x x 2 2 0 0 5  1 1
0 5 6 x 1 1 1 6 2 5  2
7 4 1 x 0 0 4 6 0 0  2
5 3 1 7 0 2 2 6 5 7
7 3 2 1 1 7 1 0 2 7
3 4 0 0 4 0 5 1 0 1

0 0 0 0 0 0 0 0 0 0
0 0 0 7 5 0 5 0 0 0
0 0 3 x x 6 0 0 0 0  2 2
0 4 7 x x 2 7 0 0 4  1 2
0 3 0 x x x 2 0 0 5  1 1 2
0 5 6 x x 1 1 6 2 5  2 1
7 4 1 x 0 0 4 6 0 0  2
5 3 1 x 0 2 2 6 5 7  7
7 3 2 1 1 7 1 0 2 7
3 4 0 0 4 0 5 1 0 1
	
	
*/
