package back_2606;

import java.util.*;

class Node{
	int x,y;
	
	Node(int x){
		this.x = x;
		
	}
}

public class Main {
	static int arr[][];
	static boolean checked[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);		
		int computer = sc.nextInt();
		arr = new int[computer+1][computer+1];
		checked = new boolean[computer+1];
		int v = sc.nextInt();
		for(int i=0; i<v; i++) {			
			int index_1 = sc.nextInt();
			int index_2 = sc.nextInt();
			arr[index_1][index_2] = 1;
			arr[index_2][index_1] =1;			
		}		
		bfs(computer);
	}
	/*
	 * 	0 1 0 0 1 0 0 
		1 0 1 0 1 0 0 
		0 1 0 0 0 0 0 
		0 0 0 0 0 0 1 
		1 1 0 0 0 1 0 
		0 0 0 0 1 0 0 
		0 0 0 1 0 0 0 
	 */
	
	public static void bfs(int k) {		
		Queue <Node> bfs = new LinkedList<Node>();
		int count =0;
		checked[1]= true;
		for(int i=1; i<=k; i++) {			
			if (arr[1][i] ==1) {
				bfs.add(new Node(i));
				
				checked[i] =true;
				count+=1;
//				System.out.println(count + "check count");
			}
		}		
		while(!bfs.isEmpty()) {
			int j = bfs.peek().x;
			bfs.remove();			
				for(int z=1; z<=k; z++) {
					if(checked[z]==false && arr[j][z]==1) {
						bfs.add(new Node(z));
						checked[z] = true;
						count+=1;
					}
				}			
		}		
		String [] arr = {"1", "2"};
		
		System.out.println(count);	
	}
}