package beak_10868;
import java.util.*;
public class Main {
	static int arr[];
	static int tree[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		arr= new int [m];
		tree = new int [m*4];
		
		for(int i=0; i<m; i++) {
			arr[i] = sc.nextInt();
		}
		
		node_init(1,0,m-1);
//		
//		for(int i=0; i<m*4; i++) {
//			System.out.print(tree[i] + " ");
//		}
//		
		
		for(int i=0; i<n; i++) {
			int a= sc.nextInt();
			int b= sc.nextInt();
			
			int aws = find_node(1,0,m-1,a-1,b-1);
			System.out.println(aws);
		}

	}
	
	public static int node_init(int nodeNum, int start, int end) {
		
		if(start==end) {
			return tree[nodeNum] = arr[start];
		}
		
		int mid = (start + end)/2;
		
		
		return tree[nodeNum] = Math.min(node_init(nodeNum*2, start,mid) ,node_init(nodeNum*2+1, mid+1, end));
	}
	
	public static int find_node(int nodeNum, int start, int end, int left,int right) {
		
		
		if(left > end || right <start)
			return Integer.MAX_VALUE;
		
		 if(left <=start && right >=end) {
			return tree[nodeNum];
		}
		
			int mid = (start+end)/2;
			
			return Math.min(find_node(nodeNum*2, start, mid, left, right), find_node(nodeNum*2+1, mid+1, end, left,right));
		
		
		
		
	}

}
