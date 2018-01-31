package beak_11023;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		String a = sc.nextLine();
		StringTokenizer s = new StringTokenizer(a," ");
		int count = s.countTokens();
		int arr[] = new int[count];
		for(int i=0; i<count ;i++) {
			arr[i] = Integer.parseInt(s.nextToken());
		}
		int sum =0;
		for(int i=0; i<count; i++) {
			sum +=arr[i];
		}
		System.out.println(sum);

	}

}
