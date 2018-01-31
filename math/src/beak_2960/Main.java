package beak_2960;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		ArrayList<Integer> al = new ArrayList();
		for(int i=2; i<=a; i++) {
			al.add(i); 
		}
		int check =0;
		boolean checking = false;
		int result =0;
		int value = 0;
		while(true) {			
			int temp = al.get(0);
			for(int i=1; i<=al.size(); i++) {
				result = al.indexOf(temp*i);
				if(result ==-1) {
					continue;
				}
				value = al.get(result);
				al.remove(result);
				check++;
				if (check==b) {
					checking = true;
					break;
				}		
			}
			if(checking==true)
				break;	
		}
		// TODO Auto-generated method stub
		System.out.println(value);

	}

}
