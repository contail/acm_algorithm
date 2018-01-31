package crack;

import java.util.*;

public class Main {

	static int arr[][];
	static int arr1[][];
	static boolean checked[][];
	static int dx[] = { 0, 0, 1, -1 };
	static int dy[] = { 1, -1, 0, 0 };
	static Queue<Node> queue = new LinkedList<Node>();

	static class Node {
		int x, y;

		Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		arr = new int[a][a];
		arr1 = new int[a][a];
		checked = new boolean[a][a];
		for (int i = 0; i < a; i++) {
			String word = sc.next();

			for (int k = 0; k < a; k++) {
				if (word.charAt(k) == 'R') {
					arr[i][k] = 1;
					arr1[i][k] = 1;
				} else if (word.charAt(k) == 'B') {
					arr[i][k] = 2;
					arr1[i][k] = 2;
				} else {
					arr[i][k] = 3;
					arr1[i][k] = 1;
				}
			}
		}

		int red_are = 0;
		int blue_are = 0;
		int green_are = 0;

		int red_are1 = 0;
		int blue_are1 = 0;

		for (int i = 0; i < a; i++) {
			for (int k = 0; k < a; k++) {

				if (!checked[i][k]) {

					queue.add(new Node(i, k));
					if (arr[i][k] == 1) {
						red_are++;

					} else if (arr[i][k] == 2) {
						blue_are++;

					} else {
						green_are++;
					}
				}
				while (!queue.isEmpty()) {
					int que_size = queue.size();

					for (int q = 0; q < que_size; q++) {
						int x = queue.peek().x;
						int y = queue.peek().y;

						queue.remove();
						checked[x][y] = true;
						for (int w = 0; w < 4; w++) {
							int nx = x + dx[w];
							int ny = y + dy[w];
							if (nx < 0 || ny < 0 || nx >= a || ny >= a)
								continue;
							if (checked[nx][ny])
								continue;
							if (arr[x][y] == arr[nx][ny]) {
								queue.add(new Node(nx, ny));
								checked[nx][ny] = true;
							}
						}
					}
				}
			}
		}
		checked = new boolean[a][a];
		queue.clear();
		for (int i = 0; i < a; i++) {
			for (int k = 0; k < a; k++) {
				if (!checked[i][k]) {
					queue.add(new Node(i, k));
					if (arr1[i][k] == 1) {
						red_are1++;
					} else if (arr1[i][k] == 2) {
						blue_are1++;
					}
				}
				while (!queue.isEmpty()) {
					int que_size = queue.size();
					for (int q = 0; q < que_size; q++) {
						int x = queue.peek().x;
						int y = queue.peek().y;
						queue.remove();
						checked[x][y] = true;
						for (int w = 0; w < 4; w++) {
							int nx = x + dx[w];
							int ny = y + dy[w];
							if (nx < 0 || ny < 0 || nx >= a || ny >= a)
								continue;
							if (checked[nx][ny])
								continue;
							if (arr1[x][y] == arr1[nx][ny]) {
								queue.add(new Node(nx, ny));
								checked[nx][ny] = true;
							}
						}

					}
				}
			}
		}
		System.out.println(red_are + blue_are + green_are + " " + (red_are1 + blue_are1));
		// TODO Auto-generated method stub
	}
}
