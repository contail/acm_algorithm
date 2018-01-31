package test1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		String input = sc.nextLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		
		int test = st.countTokens();
		System.out.println(test + "test");
		long arr[]  = new long[input.length()+1];
		
		int count =0;
		int remove_count = 0;
		for(int i=0; i<test; i++) {
			String data = st.nextToken();
			if (count<3) {
				al.add(Integer.parseInt(data));
			}
			
			count++;
			if(count >3) {
				if(Integer.parseInt(data) == al.get(0)) {
					al.remove(0);
					
					al.add(Integer.parseInt(data));
				}
				else {
					arr[remove_count] = al.remove(0);
					remove_count++;
					al.add(Integer.parseInt(data));
				}
			}
		}
		
	
		if (remove_count ==0) {
			System.out.println(0);
		}
		else {
			for(int i=0; i<remove_count; i++) {
				System.out.println(arr[i]);
			}
		}
	
		
		
		

	}

}
