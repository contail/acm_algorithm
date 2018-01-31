package beak_2042;
import java.util.*;
public class Main {

	static int arr[];
	static long node[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		// TODO Auto-generated method stub
		arr = new int[n];
		int h = (int) Math.ceil((int) Math.log(n)/Math.log(2.0));
		int tree_size = (1<<(h+1));
		
		
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		node = new long[n*4];
		init_node(1,0,n-1);
		
		
		for(int i=0; i<m+k; i++) {
			int a = sc.nextInt();
			
			
			if(a ==1) {
				int b= sc.nextInt();
				long c = sc.nextInt();
				long diff = c-arr[b-1];
				update_node(1, 0, n-1, b-1, c);
			}
			else if (a==2){
				int b= sc.nextInt();
				int c = sc.nextInt();
				System.out.println(sum_node(1,0,n-1,b-1,c-1));
			}
			
		}


	}
	
	public static long init_node(int nodeNum, int start, int end) {
	
		if(start==end) {
			node[nodeNum] = arr[start];
			
			return node[nodeNum];
		}
		int mid = (start+end)/2;
		node[nodeNum] = init_node(nodeNum*2, start, mid) + init_node(nodeNum*2+1, mid+1, end);
		return node[nodeNum];
	}
	
	public static long sum_node(int nodeNum, int start, int end, int left, int right) {
		
		if(left> end || right < start)
			return 0;
		
		if(left <=start && end<=right)  //구간 정하기  left 2 , right 3 일때 
			return node[nodeNum];
		
		int mid = (start+end)/2;
		return sum_node(nodeNum*2 ,start,mid,left,right) + sum_node(nodeNum*2+1,mid+1,end,left,right);
		
		
	}
	
	public static long update_node(int nodeNum, int start, int end, int index, long l) {
		
		if(index<start || index > end)
			return node[nodeNum];
		if(start == end)
			return node[nodeNum] = l;
		int mid = (start+end)/2;
		
		return node[nodeNum] = update_node(nodeNum*2 , start,mid,index,l) + update_node(nodeNum*2+1, mid+1, end,index,l);
		
	}

}
