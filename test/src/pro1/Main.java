package pro1;
import java.util.*;
public class Main {

	
	static class Node{
		int x, y;
		Node(int x, int y){
			this.x =x;
			this.y=y;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int arr[] = new int[test*2];
		
		Node [] node = new Node[test];
		int index=0;
		for(int i=0; i<test;i++) {
			int a= sc.nextInt();
			arr[index] =a;
			index++;
			int b= sc.nextInt();
			arr[index] = b;
			index++;
			
			node[i] = new Node(a,b);
		}
		
		
		
		for(int i=0; i<test; i++) {
			System.out.println(node[i].x);
			System.out.println(node[i].y);
		}

	}

}
