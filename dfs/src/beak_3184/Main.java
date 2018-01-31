package beak_3184;

import java.util.*;

public class Main {

	static int dx[] = { 1, -1, 0, 0 };
	static int dy[] = { 0, 0, 1, -1 };
	static Queue<Node> queue = new LinkedList();
	

	static class Node {
		int x, y;

		Node(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] map = new char[n][m];

		for (int i = 0; i < n; i++) {
			String a = sc.next();
			for (int k = 0; k < m; k++)
				map[i][k] = a.charAt(k);
		}
		
		

		boolean checked[][] = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < m; k++) {
				if (map[i][k] == 'o' && !checked[i][k]) {
					 Queue<Node> temp1 = new LinkedList();
					 Queue<Node> temp2 = new LinkedList();
					queue.add(new Node(i, k));
					temp1.add(new Node(i,k));
					int shep_count = 1;
					int wolf_count = 0;
					while (!queue.isEmpty()) {
						//System.out.println( i + "==================" + " size: " + queue.size());
						int size = queue.size();
						for (int t = 0; t < size; t++) {
							int x = queue.peek().x;
							int y = queue.peek().y;
							queue.remove();

							checked[x][y] = true;

							for (int z = 0; z < 4; z++) {
								int nx = x + dx[z];
								int ny = y + dy[z];
								
								if (nx < 0 || ny < 0 || nx >= n || ny >= m)
									continue;
								if (checked[nx][ny])
									continue;
								
								if (map[nx][ny] != '#') {
							//		System.out.println(nx + "=========wofl=====" + ny);
									if (map[nx][ny] == 'o') {
										shep_count++;
										checked[nx][ny] = true;
										queue.add(new Node(nx, ny));
										temp1.add(new Node(nx, ny));
									} else if (map[nx][ny] == 'v') {
										
										wolf_count++;
										checked[nx][ny] = true;
										queue.add(new Node(nx, ny));
										temp2.add(new Node(nx, ny));
									}
									else {
										queue.add(new Node(nx,ny));
										checked[nx][ny] =true;
									}
								}
							}
						}

					}
				//	System.out.println(wolf_count + "=======size==========" + shep_count);
					if (wolf_count >= shep_count) {
						int temp1_size = temp1.size();
						
						for(int q=0; q<temp1_size; q++) {
							map[temp1.peek().x][temp1.peek().y] = '.';
							temp1.remove();
						}
					}
					else {
						int temp2_size = temp2.size();
						//System.out.println("dddd" + temp2.size());
						for(int q=0; q<temp2_size; q++) {
							map[temp2.peek().x][temp2.peek().y] = '.';
							temp2.remove();
						}
					}

				}
			}
		}
		
		int count1=0;
		int count2=0;
		
		for(int i=0; i<n; i++) {
			for(int k=0; k<m; k++) {
				if(map[i][k] =='o')
					count1++;
				else if(map[i][k] =='v')
					count2++;
			}
		}
		
		System.out.println(count1 + " " + count2);

	}

}
