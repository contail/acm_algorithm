package beak_2668;
import java.util.*;
public class Main {
	static int arr[] ;
	static int checked [] ;
	static int result [] ;
	static int index;
	static int pos;
	static int cur;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		index = sc.nextInt();
		result = new int [index+1];
		arr = new int [index+1];
		for(int i=1; i<=index; i++) arr[i] = sc.nextInt();
		pos = 0;
		checked = new int [index+1];
		for(int i =1; i<=index; i++) {
			checked[i] = 1;
			cur =i;
			find_value(i);
			checked[i] = 0;
		}	
		System.out.println(pos);
		for(int i=0; i<pos; i++) System.out.println(result[i]);
	}

	public static void find_value (int start) {
		if(!(checked[arr[start]] == 1)) {
			checked[arr[start]] =1;
			find_value(arr[start]);
			checked[arr[start]] =0;
		}
		if(arr[start] == cur) {
			result[pos] = cur;
			pos++;
		}	
	}
}