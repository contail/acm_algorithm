package beak_1551;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a-b;
		sc.nextLine();
		
		String aa = sc.nextLine();
		StringTokenizer  s = new StringTokenizer(aa,",");
		int count = s.countTokens();
		int arr[] = new int[count];
		for(int i=0; i<count; i++) {
			arr[i] = Integer.parseInt(s.nextToken());
		}
		int temp[] = arr;
		int count1=0;
		while(b-- > 0) {
			int arr1 [] = new int[a-count1];
			
			for(int i=0; i<a-count1-1;i++) {
			
				arr1[i] = temp[i+1] -temp[i];
			}
			count1++;
			temp = arr1;
		}
		
		for(int i=0; i<c;i++) {
			if(i+1!=c)
				System.out.print(temp[i]+",");
			else
				System.out.println(temp[i]);
		}
		
		// TODO Auto-generated method stub

	}

}


