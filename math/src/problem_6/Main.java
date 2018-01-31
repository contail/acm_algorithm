package problem_6;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int M = sc.nextInt();
		boolean check[]= new boolean[M+1];
		int total_count=0;
		for(int i=0; i<N; i++) {
			String a = sc.next();
			StringTokenizer st = new StringTokenizer(a, "");
			int count = st.countTokens();
			for(int k=0; k<count; k++) {
				String temp = st.nextToken();
				if(check[Integer.parseInt(temp+"")] ==false) {
					check[Integer.parseInt(temp+"")] = true;
					total_count++;
				}
					
			}
		}
		System.out.println(total_count);
		

	}

}
