package beak_5532;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int vaction = sc.nextInt();
		int korean = sc.nextInt();
		int math = sc.nextInt();
		int korean_page =sc.nextInt();
		int math_page = sc.nextInt();
		
		int count =0;
		if(math/math_page > korean/korean_page) {
			if(math%math_page==0)
				count = math/math_page;
			else
				count = math/math_page+1;
		}
		else {
			if(korean%korean_page ==0)
				count = korean/korean_page;
			else {
				count = korean/korean_page+1;
			}
		}
		
		System.out.println(vaction-count);

	}

}
