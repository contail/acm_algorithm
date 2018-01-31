package pro2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
	
		
		int find_value [] = new int [12];
		int x1 =sc.nextInt();
		find_value [0] =x1;
		int y1 =sc.nextInt();
		find_value [1] =y1;
		int x2 =sc.nextInt();
		find_value [2] =x2;
		int y2 = sc.nextInt();
		find_value [3] =y2;
		int x3 =sc.nextInt();
		find_value [4] =x3;
		int y3 = sc.nextInt();
		find_value [5] =y3;
		int x4 =sc.nextInt();
		find_value [6] =x4;
		int y4 = sc.nextInt();
		find_value [7] =y4;
		int x5 = sc.nextInt();
		find_value [8] =x5;
		int y5 = sc.nextInt();
		find_value [9] =y5;
		int x6 =sc.nextInt();
		find_value [10] =x6;
		int y6 =sc.nextInt();
		find_value [11] =y6;
		
		Arrays.sort(find_value);
		
		
		int arr[][] =new int [find_value[11]+1][10000+1];
		
		for(int i=x1; i<=x2; i++) {
			for(int k=y1; k<=y2; k++) {
				arr[i][k] =1;
			}
		}
		
	 
		for(int i=x3; i<=x4; i++) {
			for(int k=y3; k<=y4; k++) {
				arr[i][k] =2;
			}
		}
		
	 
		
		for(int i=x5; i<=x6; i++) {
			for(int k=y5; k<=y6; k++) {
				arr[i][k] =3;
			}
		}
		
		int sum =0;
		
		for(int i=x1+1; i<=x2; i++) {
			for(int k=y1+1; k<=y2; k++) {
				if(arr[i][k] ==1)
					sum++;
			}
		}
		
	
		System.out.println(sum);


	}

}
