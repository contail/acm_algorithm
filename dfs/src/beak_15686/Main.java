package beak_15686;
import java.util.*;
public class Main {

	static int arr[][];
	static boolean check[][];
	static boolean company[][];
	static int n;
	static int m;
	static int total_count = Integer.MAX_VALUE;
	static int min = Integer.MAX_VALUE;
	static int check_count = 0;
	static int check_count_v2 = 0;
	static ArrayList<Node> al = new ArrayList();
	static ArrayList<Node> home = new ArrayList();
	static ArrayList<Node> temp_al = new ArrayList();
	static class Node{
		int x, y;
		Node(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[n][n];
		check = new boolean[n][n];
		company = new boolean[n][n];
		
		 
		for(int i=0; i<n; i++) {
			for(int k=0; k<n; k++) {
				int temp = sc.nextInt();
				arr[i][k] = temp;
				if(temp ==1)
					home.add(new Node(i,k));
				else if (temp == 2)
					al.add(new Node(i,k));
			 
			}
		}
		
		int temp_count =0;
		for(int i=0; i<n; i++) {
			for(int k=0; k<n; k++) {
				 if(arr[i][k] == 2) {
					 temp_count++;
					 if(temp_count == m) {
						 
						 temp_count =0;
					 }
				 }
					
			 
			}
		}
	 
		check = new boolean[n][n];
		recur(0,0);
		System.out.println(total_count);
	}
 
	public static void recur(int count,int index) {
		
		if(count ==m) {
			int temp_total=0;
			for(Node a : home) {
				int min_val = distance(a.x, a.y);
				temp_total +=min_val;
			}
			total_count = Math.min(total_count, temp_total);
			return;
		
		}
		else {
				 
			for(int i=index; i<al.size(); i++) {
				temp_al.add(new Node(al.get(i).x,al.get(i).y));
				recur(count+1,i+1 );
				temp_al.remove(temp_al.size()-1);
			}
			 		
		 
		}
		
		
	}
	
	public static int distance(int x, int y) {
		
		int min_val=999999;
		for(Node a : temp_al) {
			min_val = Math.min(min_val, Math.abs(x-a.x) + Math.abs(y-a.y));
		}
		
		return min_val;
	}

}
