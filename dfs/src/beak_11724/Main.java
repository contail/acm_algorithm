package beak_11724;
import java.util.*;
public class Main {
	
	static int vertex;
	static int arr[][];
	static boolean checked[];
	static int x,y;
	static int count=0;
	public static void dfs(int start) {
		
		checked[start]= true;
		for(int j=0; j<vertex; j++) {
			if(arr[start][j] ==1 && checked[j] == false) {	
				System.out.println( start + " move " + j );
				dfs(j);
			}
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		while(testcase -->0) {
			vertex = sc.nextInt();
			int line = sc.nextInt();
			arr =new int[vertex+1][vertex+1];
			checked = new boolean[vertex+1];
			
			for(int i=0; i<line;i++) {
				x=sc.nextInt();
				y=sc.nextInt();
				arr[x][y] = 1;
			}
			for(int i=0; i<vertex; i++) {
				if(checked[i] ==false) {
					
					dfs(i);
					count++;
				}
			}
			if(count ==1) {
				System.out.println("O");
			}
			else {
				System.out.println("X");
			}
			System.out.println(count);
			count =0;
			
			
		}
		
		// TODO Auto-generated method stub

	}

}


/*

6 5
1 2
2 5
5 1
3 4
4 6

1 - 2

2 -5

5 -1

3 - 4

4 -6

*/