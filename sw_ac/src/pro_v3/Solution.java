//package pro_v3;
//import java.util.*;
//public class Solution {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int testcase = sc.nextInt();
//		int n, m , c;
//		n=sc.nextInt();
//		m=sc.nextInt();
//		c=sc.nextInt();
//		ArrayList<Integer> al = new ArrayList();
//		
//		int map [][] = new int[n+1][n+1];
//		int dp[] = new int[1000];
//		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n ; j++) {
//				map[i][j]=sc.nextInt();
//			}		
//		}
//	
//		
//		
//		/*
//		 * c= 3일 떄 
//		 * 가로 행 n n n n    => n-3번 비교를 하고 n-3번 동안 각 각 5번 비교 
//		 * 
//		 * 
//		 * 
//		 */
//		
//		int count =0;
//		for(int i=1; i<=n;i++) {
//			
//			for(int j=1; j<=m; j++) {
//				
//				int sum = 0;
//				for(int z=j; z<=n; z++) {
//					
//					for(int k=0; k<=)
//					sum+=map[i][z];
//					
//				}
//				
//				
//			}
//			
//			
//		}
//		if(map[i][j-m]+map[i][j-m] <=c) {
//			al.add((int) Math.pow(map[i][m-2],2) + (int) (Math.pow(map[i][m-1],2)));
//		}
//		else {
//			al.add((int) Math.pow(Math.max(map[i][m-2], map[i][m-1]),2));
//		}
//		Collections.sort(al);
//		System.out.println(al.get(al.size()-1));
//		
//		
//		
//		
//		// TODO Auto-generated method stub
//
//	}
//
//}
