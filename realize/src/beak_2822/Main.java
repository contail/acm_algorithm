package beak_2822;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[8];
		int temp [] = new int[8];
		ArrayList<Integer> al = new ArrayList();
		int sum =0;
		for(int i=0; i<8; i++) {
			int a= sc.nextInt();
			al.add(a);
			arr[i]=a;
			
		}
		
		
		
		Arrays.sort(arr);
		for(int i=0; i<5; i++) {
			temp[4-i] = al.indexOf(arr[3+i]); 
		}
		arr =new int[5];
		for(int i=0; i<5; i++) {
			sum+=al.get(temp[i]);
			arr[i] = temp[i];
			
		}
		
		Arrays.sort(arr);
		System.out.println(sum);
		for(int i=0; i<5; i++) {

			System.out.print(arr[i]+1 + " ");
			
		}
		
		// TODO Auto-generated method stub

	}

}
