package beak_10451;
import java.util.*;
public class Main {
	
	static int arr [];
	static boolean checked[];
	static int index;
	static int cur;
	static int count;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		while(testcase-- > 0) {
			index = sc.nextInt();
			arr = new int[index+1];
			count =0;
			checked = new boolean[index+1];
			for(int i=1; i<=index; i++) arr[i] =sc.nextInt();
			for(int i=1; i<=index; i++) {
				checked[i] = true;
				cur = i;
				dfs(i);
			}
			System.out.println(count);
		}
		
	}
	
	public static void dfs(int start) {
		
		if(!checked[arr[start]]) {
			checked[arr[start]] = true;
			dfs(arr[start]);
			checked[arr[start]] = false;
		}
		if (arr[start] == cur) {
			count++;
		}
	}

}
