package beak_2161;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int arr[] = new int[testcase];
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=1; i<=testcase; i++) {
			al.add(i);
		}
		int count =0;
		while(true) {
			if(al.size() ==1) {
				arr[count]=al.get(0);
				break;
			}
			arr[count]=al.get(0);
			count++;
			al.remove(0);
			int temp = al.get(0);
			al.remove(0);
			al.add(temp);
				
			
		}
		
		for(int i=0; i<count; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(al.get(0));

	}

}
