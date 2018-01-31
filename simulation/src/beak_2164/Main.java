package beak_2164;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i=0; i<testcase;i++) {
			queue.add(i+1);
		}
		
		for(int i=0; i<testcase-1;i++) {
			queue.remove();
			int x = queue.peek();
			queue.remove();
			queue.add(x);
			
		}
		
		System.out.println(queue.peek());
		
	}

}
