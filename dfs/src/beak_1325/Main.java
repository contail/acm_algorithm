package beak_1325;
import java.util.*;
public class Main {
	
 
	static ArrayList<Integer> [] map;
	static int n;
	static int m;
	static int result[];
	static boolean checked[];
	static int count =0;
 
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
	 
		map = new ArrayList[n+1];
		for(int i = 1 ; i <= n ; i++){
            map[i] = new ArrayList();
		}
		for(int i=0; i<m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
		
			map[x].add(y);
		}
		
		result = new int[n+1];
		for(int i=1; i<=n; i++) {
			checked = new boolean[n+1];
			dfs(i);
		}
		
		for(int i : map[3])
			System.out.println(i);
		 
		int max = Integer.MIN_VALUE;
		
		int result_v2[] = new int[n+1];
		int index = 0;
		for(int i=1; i<=n; i++) {
			
			if(max < result[i]) {
				max = result[i];
				index = 0;
				result_v2[index++] =i;
			}
			
			else if(max == result[i]) {
				result_v2[index++] = i;
			}
		}
		
		
		for(int i=0; i < index; i++) {
			System.out.print(result_v2[i]+ " ");
		}
	 
	 
		// TODO Auto-generated method stub

	}
	
	public static void dfs(int x) {
		
		checked[x] = true;
		
		for(int i : map[x]) {
			if(!checked[i]) {
				dfs(i);
				result[i]++;
				
			}
		}
	 
	}

}


/*
5 4
3 1
3 2
4 3
5 3

   1 2 3 4 5 
1      1 
2      1
3  1 1   1 1
4      1
5      1

*/