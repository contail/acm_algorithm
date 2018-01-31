package dfs_prati;
import java.util.*;



public class Main {
	static class Node{
		int x, y;
		public Node(int x, int y) {
			this.x= x;
			this.y = y;
		}
	}
	
	static Node arr[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		arr = new Node[100];
		arr[1] = new Node(1,1);
		System.out.println(arr[1].x);
		
		
		// TODO Auto-generated method stub

	}

}
