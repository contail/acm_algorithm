package beak_1707;
import java.util.*;
public class Main {

	static int vertex;
	static ArrayList<Integer> list[] ;
	static int edge;
	static boolean checked[];
	static int color_info[];
	static boolean is_bi;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		while(testcase-- > 0 ) {
			vertex = sc.nextInt();
			is_bi = true;
			color_info = new int [vertex+1];
			list = new ArrayList[vertex+1];
			for(int i=1; i<=vertex; i++)
				list[i] = new ArrayList();
			edge = sc.nextInt();
			for(int i=1; i<=edge; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				list[x].add(y);
				list[y].add(x);
				
			}
			checked = new boolean[vertex+1];
			for(int i=1; i<=vertex; i++) {
				if(color_info[i] == 0)
					dfs(i, 1);
			}
			
			for(int i=1; i<=vertex; i++) {
				
				for(int k : list[i]) {
					if(color_info[i] == color_info[k])
						is_bi = false;
				}
			}
			
			if(is_bi) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
	
	public static void dfs(int index, int color) {
	 
		color_info [index] = color;
		if(color == 2)
			color = 0;
		
		for(int i : list[index]) {
			if(color_info[i] ==0) {
				dfs(i,color+1);
			}
		 
				
		}
		
	}

}
