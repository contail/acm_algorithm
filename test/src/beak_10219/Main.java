package beak_10219;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		String arr[][] = new String[height][width];
		
		for(int i=0; i<height; i++) {
			for(int k=0; k<width;k++)
				arr[i][k] =sc.nextLine();
		}
		
		

	}

}
