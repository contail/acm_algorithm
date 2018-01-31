package beak_2357;
import java.util.*;
public class Main {

	static int arr[];
	static int min_tree[];
	static int max_tree[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int m = sc.nextInt();
		arr = new int[n];
		min_tree =new int[n*4];
		max_tree = new int[n*4];
		for(int i=0; i<n; i++)
			arr[i]= sc.nextInt();
		
		init_min_tree(1,0,n-1);
		init_max_tree(1,0,n-1);
		
		for(int i=0; i<m;i++) {
			
			int a =sc.nextInt();
			int b = sc.nextInt();
			System.out.println( find_min(1,0,n-1,a-1,b-1) + " " + find_max(1,0,n-1,a-1,b-1));
			
		}

	}
	
	public static int init_min_tree(int nodeNum, int start, int end) {
		
		if(start == end)
			return min_tree[nodeNum] = arr[start];
		
		int mid = (start+end)/2;
		
		return min_tree[nodeNum] = Math.min(init_min_tree(nodeNum*2, start, mid), init_min_tree(nodeNum*2+1,mid+1,end));
	}
	
	public static int init_max_tree(int nodeNum, int start, int end) {
		if(start==end)
			return max_tree[nodeNum] = arr[start];
		int mid = (start+end)/2;
		return max_tree[nodeNum] = Math.max(init_max_tree(nodeNum*2,start,mid), init_max_tree(nodeNum*2+1,mid+1,end));
	}
	
	public static int find_min(int nodeNum, int start, int end, int left, int right) {
		if(left > end || right<start)
			return Integer.MAX_VALUE;
		if( left<=start && right>=end)
			return min_tree[nodeNum];
		int mid = (start+end)/2;
		return Math.min(find_min(nodeNum*2,start,mid,left,right),find_min(nodeNum*2+1,mid+1,end,left,right));
	}
	public static int find_max(int nodeNum, int start, int end, int left, int right) {
		if(left > end || right<start)
			return Integer.MIN_VALUE;
		if( left<=start && right>=end)
			return max_tree[nodeNum];
		int mid = (start+end)/2;
		return Math.max(find_max(nodeNum*2,start,mid,left,right),find_max(nodeNum*2+1,mid+1,end,left,right));
	}
	

}
