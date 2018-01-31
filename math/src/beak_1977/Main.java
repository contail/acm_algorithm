package beak_1977;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int m =sc.nextInt();
		int n =sc.nextInt();
		
		ArrayList<Integer> al = new ArrayList();
		int sum =0;
		for(int i=m; i<=n; i++) {
			int value = (int) Math.sqrt(i);
			if(value * value ==i) {
				sum+=i;
				al.add(i);
			}
		}
		if(sum ==0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(al.get(0));
		}
		
		

	}

}
