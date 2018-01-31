package pro_7;

import java.util.*;

public class Main {
	static int D, W, K;
	static int arr[][];
	static int min;
	static int max;
	static int copy[][];
	static int copy2[][];

	public static boolean check_logic(int copy[][]) {

		int temp = 0;
		 for(int i=0; i<D; i++) {
		 for(int j=0; j<W; j++) {
		 System.out.print(copy[i][j] + " ");
		 }
		 System.out.println();
		 }
		
		 System.out.println("");

		for (int i = 0; i < W; i++) {
			int count = 0;
			for (int k = 0; k < D - 1; k++) {

				if (copy[k][i] == copy[k + 1][i])
					count++;
			}

			if (count >= K)
				temp++;
			else
				return false;
		}

		if (temp == W) {
			// System.out.println(temp + "========temp=====");

			return true;
		}

		else
			return false;
	}

	public static void dfs(int arr[][], int start, int count) {

		if (check_logic(arr)) {
			min = count;
			return;
		}

		if (count >= K) {

			min = K;
			return;
		}

		for (int i = start; i < D; i++) {

			int copy[][] = new int[D][W];
			System.arraycopy(arr[i], 0, copy[i], 0, arr[i].length);
			// System.arraycopy(copy[i], 0, arr[i], 0, arr[i].length);
			for (int k = 0; k < W; k++) {
				arr[i][k] = 1;
			}
			
			dfs(arr, i + 1, count + 1);
			System.arraycopy(copy[i], 0, arr[i], 0, arr[i].length);

		}

		for (int i = start; i < D; i++) {

			int copy[][] = new int[D][W];
			System.arraycopy(arr[i], 0, copy[i], 0, arr[i].length);

			for (int k = 0; k < W; k++) {
				arr[i][k] = 0;
			}
			
			dfs(arr, i + 1, count + 1);
			System.arraycopy(copy[i], 0, arr[i], 0, arr[i].length);
		}

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int start = 0;
		while (T-- > 0) {
			D = sc.nextInt();
			W = sc.nextInt();
			K = sc.nextInt();
			min = 987654321;
			arr = new int[D][W];
			copy = new int[D][W];
			copy2 = new int[D][W];
			for (int i = 0; i < D; i++) {
				for (int k = 0; k < W; k++) {
					arr[i][k] = sc.nextInt();
				}
			}
			max = 0;

			if (check_logic(arr)) // 한번에 찾으면 최소 갯수0
				min = 0;
			else {
				dfs(arr, 0, 1);

			}

			// 약품 처리 안한것 => 그대로

			// 약품처리 한것 => 1 (A)
			// 약품처리 한것 => 2 (B)

			System.out.println("#" + ++start + " " + min);
		}

	}

}
