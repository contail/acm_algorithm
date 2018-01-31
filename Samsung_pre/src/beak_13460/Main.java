package beak_13460;

import java.util.*;

public class Main {

	private static int n, m;
	static Queue<Node> queue_r = new LinkedList<Node>();
	static Queue<Node> queue_b = new LinkedList<Node>();
	static int map[][];
	static int red[][] = new int[1][2];
	static int blue[][] = new int[1][2];
	static int exit[][] = new int[1][2];
	static boolean check[][];
	static boolean check1[][];
	static int dx[] = { 0, 1, 0, -1 };
	static int dy[] = { 1, 0, -1, 0 };
	static int count=0;
	static boolean find_red;
	static boolean find_blue;
	
	public static void bfs() {
		

		while (!queue_r.isEmpty()) {
			int red_x = queue_r.peek().x;
			int red_y = queue_r.peek().y;
			int find = queue_r.peek().count;
			int blue_x = queue_b.peek().x;
			int blue_y = queue_b.peek().y;
			count = find;
	//		System.out.println(count + "==count== ");
	//		System.out.println(blue_x + " " + blue_y + "===");
			int navi = queue_r.peek().navi;
			
			//System.out.println(red_x + "====" + red_y);
			queue_r.remove();
			queue_b.remove();
			if (navi!=-1) {
				map[red_x][red_y] =3;
				if (navi==0) {
					int n_x = red_x;
					for(int i=1; i<=n; i++) { // 위  
						n_x =n_x-1;
				//		System.out.println("===up==");
						if(n_x <0) {
							break;
						}else if(n_x == exit[0][0] && red_y == exit[0][1]) {
							find++;
							count = find;
							find_red = true;
							map[n_x][red_y]=3;
							
						}
						else if( check[n_x][red_y] !=false || map[n_x][red_y] !=3)
							break;
						
						else {
							check[n_x][red_y] = true;
						}
					}
				
				
				
				int b_x = blue_x;
				for(int i=1; i<=n; i++) { // 위  
					b_x =b_x-1;
			//		System.out.println("===up==");
					if(b_x <0) {
						break;
					}else if(b_x == exit[0][0] && blue_y == exit[0][1]) {
						 
						 
						find_blue = true;
						return;
					}
					else if( check1[b_x][blue_y] !=false || map[b_x][blue_y] !=3)
						break;
					
					else {
						check1[b_x][blue_y] = true;
					}
				}
				if(find_red ==true)
					return;
				count = find+1;
				
				if(n_x ==b_x && red_y == blue_y) {
					if(red_x > blue_x) {
						n_x = b_x+1;
					}
					else {
						b_x = n_x +1;
					}
				}
				
				
				queue_r.add(new Node(n_x+1,red_y,count,-1));
		
				queue_b.add(new Node(b_x+1,blue_y,count,-1));
				
				
				}
				
				
				
				
				
				
				
				else if (navi==1) { //오  른  
					
					int n_y = red_y;
					for(int i=1; i<=m; i++) {
						n_y = n_y+ 1;
			//			System.out.println(red_x + "  " +  n_y +" " + "move ->");
						if(n_y >=m) {
							break;
						}else if(n_y == exit[0][1] && red_x == exit[0][0]) {
							count =find+1;
							find_red = true;
							map[red_x][n_y]=3;
							
						}
						else if( check[red_x][n_y] !=false || map[red_x][n_y] !=3)
							break;
						
						else {
							check[red_x][n_y] = true;
						}
					}
					
					int b_y = blue_y;
					for(int i=1; i<=m; i++) {
						b_y = b_y+ 1;
				//		System.out.println(red_x + "  " +  n_y +" " + "move ->");
						if(b_y >=m) {
							break;
						}else if(b_y == exit[0][1] && blue_x == exit[0][0]) {
							count =find+1;
							find_blue = true;
							return;
						}
						else if( check1[blue_x][b_y] !=false || map[blue_x][b_y] !=3)
							break;
						
						else {
							check1[blue_x][b_y] = true;
						}
					}
					
				if(find_red == true)
					return;
				count = find+1;
				
					
				if(b_y ==n_y && red_x == blue_x) {
					if(red_y > blue_y) {
						b_y = n_y-1;
					}
					else {
						n_y = b_y -1;
					}
				}
				queue_r.add(new Node(red_x,n_y-1,count,-1));
				queue_b.add(new Node(blue_x,b_y-1,count,-1));
				
				
				}
				else if(navi==2) { //아래  
					int n_x = red_x;
					for(int i=1; i<=n; i++) {
						
						n_x =n_x+1;
			//			System.out.println(n_x + "  " +red_y+ " ===down===");
						if(n_x >=n) {
							break;
						}else if(n_x == exit[0][0] && red_y == exit[0][1]) {
							find++;
							count = find;
							find_red = true;
							map[n_x][red_y]=3;
						
						}
						else if( check[n_x][red_y] !=false || map[n_x][red_y] !=3)
							break;
						
						else {
							check[n_x][red_y] = true;
						}
					}
					
					int b_x = blue_x;
					for(int i=1; i<=n; i++) {
						
						b_x =b_x+1;
			//			System.out.println(n_x + "  " +red_y+ " ===down===");
						if(b_x >=n) {
							break;
						}else if(b_x == exit[0][0] && blue_y == exit[0][1]) {
							find++;
							count = find;
							find_blue = true;
							return;
						}
						else if( check1[b_x][blue_y] !=false || map[b_x][blue_y] !=3)
							break;
						
						else {
							check1[b_x][blue_y] = true;
						}
					}
				if(find_red == true)
					return;
				count = find+1;
				
				
				if(n_x ==b_x && red_y == blue_y) {
					if(red_x < blue_x) {
						n_x = b_x-1;
					}
					else {
						b_x = n_x -1;
					}
				}
				queue_r.add(new Node(n_x-1,red_y,count,-1));	
				queue_b.add(new Node(b_x-1,blue_y,count,-1));
				
				
				
				}
				
				
				
				
				else {
					int n_y = red_y;
					
					for(int i=1; i<=m; i++) {
						
						n_y = n_y-1;
					//	System.out.println(red_x + "  " + n_y + "<- move");
						if(n_y < 0) {
							break;
						}else if(n_y == exit[0][1] && red_x == exit[0][0]) {
				//			System.out.println("find");
							find++;
							count = find;
							find_red = true;
							map[red_x][n_y]=3;
						
						}
						else if( check[red_x][n_y] !=false || map[red_x][n_y] !=3)
							break;
						
						else {
							check[red_x][n_y] = true;
						}
					}
					
//					 for(int i=0; i<n; i++) {
//					 for(int k=0; k<m; k++) {
//					 System.out.print(map[i][k] + " ");
//					 }
//					 System.out.println();
//					 }
//			
				//	System.out.println("======================");
				int b_y = blue_y;
				
				for(int i=1; i<=m; i++) {
					
					b_y = b_y-1;
			//		System.out.println(blue_x + "  " + b_y + "<- move");
					if(b_y < 0) {
						break;
					}else if(b_y == exit[0][1] && blue_x == exit[0][0]) {
			//			System.out.println("find");
						
						find_blue = true;
					
						return;
					}
					else if( check1[blue_x][b_y] !=false || map[blue_x][b_y] !=3)
						break;
					
					else {
						check1[blue_x][b_y] = true;
					}
				}
				if(find_red==true)
					return;
				count = find+1;
				if(b_y ==n_y && red_x == blue_x) {
					if(red_y > blue_y) {
					
						check[red_x][n_y+1]= false;
						n_y = b_y+1;
						
					}
					else {
						check[blue_x][b_y+1]= false;
						b_y = n_y+1;
					}
				}
				
				System.out.println(red_x + " ---- " + (n_y+1));
				System.out.println(blue_x + " ---- " + (b_y+1));
				queue_r.add(new Node(red_x,n_y+1,count,-1));
				
			
				queue_b.add(new Node(blue_x,b_y+1,count,-1));
				
				
				
				}
			}
			
			else {
				
				check[red_x][red_y] = true;
				
				
				check1[blue_x][blue_y] = true;
				// 위, 아래, 오른쪽, 왼 검사하기 있으면 나중에 갈 좌표 넣
				for (int i = 0; i < 4; i++) {
					int next_x = red_x + dx[i];
					int next_y = red_y + dy[i];
					 
					if (next_x > 0 && next_y > 0 && next_y < m && next_x < n) {
						if(next_x == exit[0][0] && next_y == exit[0][1]) {
							find++;
							count = find;
							return;
						}
						if (check[next_x][next_y] == false && map[next_x][next_y] ==3) {
						//	System.out.println( next_x + " ?? " + next_y + " " + i );
							if(i==0) {
								queue_r.add(new Node(red_x, red_y, find, 1)); //오른쪽  
								queue_b.add(new Node(blue_x, blue_y, find, 1)); //오른쪽  
							}
							else if(i==1) {
								queue_r.add(new Node(red_x, red_y, find,2));//아
								queue_b.add(new Node(blue_x, blue_y, find, 1)); //오른쪽  
							}
							else if (i==2) {
								queue_r.add(new Node(red_x, red_y, find,3));
								queue_b.add(new Node(blue_x, blue_y, find, 1)); //오른쪽  
							}
							else {
								queue_r.add(new Node(red_x, red_y, find,0));
								queue_b.add(new Node(blue_x, blue_y, find, 1)); //오른쪽  
							}
							
						}
						
					}
					
				}
				
			}
		//	System.out.println(find);
		

		}

		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		map = new int[n][m];
		check = new boolean[n][m];
		check1 = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			String a = sc.next();
			for (int k = 0; k < m; k++) {
				if (a.charAt(k) == '#') {
					map[i][k] = 0;
				} else if (a.charAt(k) == 'R') {
					map[i][k] = 3;
					queue_r.add(new Node(i, k, 0,-1));
				} else if (a.charAt(k) == 'B') {
					map[i][k] = 3;
					queue_b.add(new Node(i, k, 0,-1));
				} else if (a.charAt(k) == '.') // 갈수 있는 길 3!
				{
					map[i][k] = 3;

				} else if (a.charAt(k) == 'O') {
					map[i][k] = 3;
					exit[0][0] = i;
					exit[0][1] = k;
				}
			}
		}
		bfs();
		if(find_red && !find_blue) {
			System.out.println(count);
		}
		else {
			System.out.println("-1");
		}
		
		// for(int i=0; i<n; i++) {
		// for(int k=0; k<m; k++) {
		// System.out.print(map[i][k] + " ");
		// }
		// System.out.println();
		// }

	}

	static class Node {
		int x, y, count, navi;

		Node(int x, int y, int count, int navi) {
			this.x = x;
			this.y = y;
			this.count = count;
			this.navi = navi;
		}
	}

}
