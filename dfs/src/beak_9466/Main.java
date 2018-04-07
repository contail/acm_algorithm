package beak_9466;
import java.util.*;
public class Main {
	
	static boolean checked[];
	static boolean finished[];
	static int arr[];
	static int pos;
	static int cur;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		
		while (testcase-- >0) {
			pos = 0;
			cur = 0;
			int index = sc.nextInt();
			arr = new int[index+1];
			checked = new boolean[index+1];
			finished = new boolean[index+1];
			for(int i=1; i<=index; i++) arr[i] = sc.nextInt();
			
			for(int i=1; i<=index; i++) {
				dfs(i);
			}
			System.out.println(index - pos);
			
		}

	}
	
	public static void dfs(int start) {
		
		checked[start] = true;
		int next = arr[start];
		if(checked[next]) {
			if(!finished[next]) {
				for(int temp = next; start != temp; temp = arr[temp]) {
					pos++;
				}
				pos++;
			}	
		}
		else {
			dfs(next);
		}
		finished[start] = true;
		
	}

}
