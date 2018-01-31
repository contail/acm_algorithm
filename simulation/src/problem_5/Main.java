package problem_5;
import java.util.*;
public class Main {
	static int N; // 도시의 개수 
	static int M; // 버스의 개수 
	static int START; 
	static int END; 
	static int[][] maps; 
	static long[] cost; 
	static boolean[] checked;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); N = sc.nextInt(); M = sc.nextInt(); maps = new int[N + 1][N + 1];

		for (int[] arr : maps) Arrays.fill(arr, -1); 
		for (int i = 0; i < M; i++) 
		{ int from = sc.nextInt(); int to = sc.nextInt(); int cost = sc.nextInt(); 
		if (maps[from][to] == -1) { maps[from][to] = cost; } 
		else if (maps[from][to] > cost) maps[from][to] = cost; } 
		START = sc.nextInt(); END = sc.nextInt();

		sc.close(); cost = new long[N + 1]; checked = new boolean[N + 1]; 
		for (int i = 1; i <= N; i++) 
		{ cost[i] = Integer.MAX_VALUE - 1; checked[i] = false; }

		for (int k = 0; k < N - 1; k++) { long min = Integer.MAX_VALUE; int from = -1; // 아직 가지 않은 경로 중 최소값 확인 
		for (int i = 1; i <= N; i++) 
		{ if (checked[i] == false && min > cost[i]) 
		{ min = cost[i]; from = i; }
		} 
		checked[from] = true; for (int to = 1; to <= N; to++) 
		{ 
			if (maps[from][to] != -1 && cost[from] != Integer.MAX_VALUE - 1 && cost[to] > cost[from] + maps[from][to])
			{ cost[to] = cost[from] + maps[from][to]; 
			} 
			} 
		} 
		System.out.println(cost[END]);
		

	

	}

}

