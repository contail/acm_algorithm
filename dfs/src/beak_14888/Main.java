package beak_14888;
import java.util.*;

public class Main {
	
	static int arr[];
	static int oper[];
	static boolean checked[];
	static int s;
	static int result;
	static long min =Long.MAX_VALUE;
	static long max = Long.MIN_VALUE;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		s=  sc.nextInt();
		
		arr = new int [s+1];
		oper = new int[5];
		
		for(int i=1; i<=s; i++)
			arr[i] = sc.nextInt();
		
		
		for(int i=1; i<=4; i++) {
			oper[i] = sc.nextInt();
		}
		
		
		int first = arr[1];
		
		 
		 
		// 5 6  입력된 수 2
		// 0 0 1 0 연산 1
		
		dfs(0,first,2);
		System.out.println(max);
		System.out.println(min);
		
	}
	
	public static void dfs(int depth,int result, int next_index) {
		if (depth == s-1) {
			max = Math.max(result, max);
			min = Math.min(result, min);
			
			return;
		}
			
		
		for(int i=1; i<=4; i++) {
			if(oper[i]!=0) {
				oper[i] -=1;
				switch(i) {
				case 1:
					result +=arr[next_index];
					dfs(depth+1, result,next_index+1);
					result -=arr[next_index];
					break;
				case 2:
					result -=arr[next_index];
					dfs(depth+1, result,next_index+1);
					result +=arr[next_index];
					break;
				case 3:
					result *=arr[next_index];
					dfs(depth+1, result,next_index+1);
					result /=arr[next_index];
					break;
				case 4:
					result /=arr[next_index];
					dfs(depth+1, result,next_index+1);
					result *=arr[next_index];
					break;
				}
				
				oper[i] +=1;
				
			}
		}
		
	}
	
	

}
