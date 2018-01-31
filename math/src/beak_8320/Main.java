package beak_8320;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = 0;
		// TODO Auto-generated method stub
		for(int i=2; i<=n; i++) {
			for(int k=i; k<=n;k++) {
				if(i*k<=n)
					temp++;
			}
		}
		System.out.println(n+temp);

	}

}


