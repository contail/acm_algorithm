package beak_1389;
import java.util.*;
public class Main {

	static int people, vetex;
	static int arr[][];
	static boolean checked[][];
	static boolean test[];
	static int count =0;

	static int INF = 9999999;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		people = sc.nextInt();
		vetex = sc.nextInt();
		
		arr = new int [people+1][people+1];
		
		for(int i=1; i<=people; i++) {
			for(int k=1; k<=people; k++) {
				arr[i][k] = INF;
			}
		}
		
	
		
		for(int i=1; i<=people; i++) {
			arr[i][i] = 0;
		}
		
		
		for(int i=1; i<=vetex; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();			
			arr[a][b] =1;
			arr[b][a] =1;
		}
		
		
		
		
		
		for(int k=1; k<=people; k++) {
			for(int i=1; i<=people; i++) {
				for(int j=1; j<=people; j++) {
					if(arr[i][j] > arr[i][k] + arr[k][j]) {
						arr[i][j] = arr[i][k] + arr[k][j];
					}
				}
			}
		}
		int aws[] =new int [5000];
		int min =99999999;
		for(int i=1; i<=people; i++) {
			for(int k=1; k<=people; k++) {
				aws[i] += arr[k][i];
			}
		}
		
		int minnum =1;
		for(int i=1; i<=people; i++) {
			if(min > aws[i]) {
				min = aws[i];
				minnum= i;
			}
		}
		
		System.out.println(minnum);
	

		
		// TODO Auto-generated method stub

	}

}
