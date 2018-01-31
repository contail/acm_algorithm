package beak_11559;

import java.util.*;

public class Main {

	static int dx[] = { 1, -1, 0, 0 };
	static int dy[] = { 0, 0, 1, -1 };
	static int arr[][];
	static boolean checked[][];
	static int combo;
	

	static class Node {
		int x;
		int y;
		int z;

		Node(int x, int y, int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}

	public static void reset_map() {
		for (int i = 0; i < 6; i++) {
			for (int k = 10; k > 0; k--) {
				for (int z = k; z < 11; z++) {
					// System.out.println(i + " : " + k + " : " + z);
					if (arr[z][i] != 0 && arr[z + 1][i] == 0) {
						arr[z + 1][i] = arr[z][i];
						arr[z][i] = 0;
					}

				}
			}
		}

		
//		for (int i = 0; i < 12; i++) {
//			for (int j = 0; j < 6; j++) {
//
//				if (arr[i][j] == 1) {
//
//					//queue.add(new Node(i, j, 1));
//				}
//				if (arr[i][j] == 2) {
//
//					//queue.add(new Node(i, j, 2));
//				}
//				if (arr[i][j] == 3) {
//
//					//queue.add(new Node(i, j, 3));
//				}
//				if (arr[i][j] == 4) {
//
//					//queue.add(new Node(i, j, 4));
//				}
//			}
//		}
//
//		for (int i = 0; i < 12; i++) {
//			for (int j = 0; j < 6; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();

	}

	public static int bfs() {

		checked = new boolean[12][6];
		
		boolean checking = false;
		
		int total=0;
		checked =new boolean[12][6];
		for(int i=0; i<12; i++) {
			for(int k=0; k<6; k++) {
				if(arr[i][k] ==0)
					continue;
				int count = 0;
				 Queue<Node> queue = new LinkedList<Node>();
				 Queue <Node> temp_queue = new LinkedList<Node>();
				queue.add(new Node(i,k,arr[i][k]));
				temp_queue.add(new Node(i,k,arr[i][k]));
				count++;
				checked[i][k] = true;
				while(!queue.isEmpty()) {
					int x = queue.peek().x;
					int y = queue.peek().y;
					int z = queue.peek().z;
					
					
					queue.remove();
				//	System.out.println( " x :" + x  + " y : " + y);
					for(int a=0; a<4; a++) {
						int nx = x+ dx[a];
						int ny = y+dy[a];
						
						if (nx < 0 || ny < 0 || nx >= 12 || ny >= 6)
							continue;
						if(checked[nx][ny])
							continue;
						if(arr[nx][ny] !=z)
							continue;
						checked[nx][ny] = true;
						queue.add((new Node(nx,ny,z)));
						temp_queue.add(new Node(nx,ny,z));
						count++;
						
					
					}
					
				}
				
				if(count >=4) {
					total+=count;
					while(!temp_queue.isEmpty()){
						arr[temp_queue.peek().x][temp_queue.peek().y] =0;
						temp_queue.remove();
					}
				}
			}
		
		
		
		}
		return total;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		arr = new int[13][7];

		for (int i = 0; i < 12; i++) {
			String a = sc.next();
			for (int j = 0; j < 6; j++) {

				if (a.charAt(j) == 'R') {
					arr[i][j] = 1;
					//queue.add(new Node(i, j, 1));
				} else if (a.charAt(j) == 'B') {
					arr[i][j] = 2;
					//queue.add(new Node(i, j, 2));
				} else if (a.charAt(j) == 'G') {
					arr[i][j] = 3;
					//queue.add(new Node(i, j, 3));
				} else if (a.charAt(j) == 'Y') {
					arr[i][j] = 4;
					//queue.add(new Node(i, j, 4));
				}
				else if (a.charAt(j) == 'P') {
					arr[i][j] = 5;
					//queue.add(new Node(i, j, 4));
				}
			}
		}
	//	System.out.println("ddd");
		while (true) {
			int result = bfs();
			if (result >= 4) {
				reset_map();
				combo++;
			} else if (result ==0){
				break;
			}

		}

		System.out.println(combo);

		// 만약 처음부터 끝까지 탐색했을 때 한번 터지는 각 나오면 위치 재조정 해주기

	}

}
