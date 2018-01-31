package problem_2_2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int n =sc.nextInt();
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		ArrayList<Integer> list2 = new ArrayList<Integer>();
//		int arr[] = new int [n];
//		int temp[] = new int [n];
//		for(int i=0; i<n;i++) {
//			int a= sc.nextInt();
//			list.add(a);
//			arr[i] = a;
//			temp[i] = a;
//			
//		}
//		int count =0;
//		
//		Arrays.sort(temp);
//		
//		for(int i=0; i<n; i++) {
//			//System.out.println(list);
//			
//			int temp2 = temp[i];
//			System.out.println(temp2 + "temp2");
//			Collections.sort(list);
//			list.remove(list.indexOf(temp2));
//			list.add(0,temp2);
//			int temp1 = list.get(list.size()-1);
//			for(int z=n-1; z>0; z--) {
//			
//				System.out.println(z);
//				
//				list.remove(list.indexOf(temp1));
//				list.add(z,temp1);
//				System.out.println(list+ "==list==");
//				
//				
//				
//			}
//			
//		}
		
		
		
//		for(int i=0; i<n;i++) {
//			if(arr[i] == temp[n-i-1])
//				count++;
//		
//		}
//		if(count==n)
//			System.out.println(-1);
//		else{
//			int temp_value = list.get(list.size()-1);
//			
//		}
//		
//	
		{
	        int[] arry = new int[10];                   // 배열 10개 선언
	        for(int i = 0; i < arry.length; i++)
	        {
	            arry[i]=i+1;// 배열 10개에 랜덤적으로 정수 입력
	        }
	         
	        for(int i = 0; i < arry.length; i++)
	        {
	            for(int j = i; j < arry.length; j++)         // 첫번째 배열의 값이 두번째 배열보다
	            {                                            // 작으면 자리를 바꿈
	                if(arry[i] < arry[j])                    // 순서대로 다음의 배열과 비교하여 작은경우에
	                {                                        // 자리를 바꿈
	                    int temp = arry[i];
	                    arry[i] = arry[j];
	                    arry[j] = temp;
	                }
	                for(int k = 0; k < arry.length; k++)
			        {
			            System.out.print(arry[k] + " ");    // 첫번째 배열부터 내림차순으로 출력
			        }
			        System.out.println();
	            }
	           
	        }
	        for(int i = 0; i < arry.length; i++)
	        {
	            System.out.print(arry[i] + " ");    // 첫번째 배열부터 내림차순으로 출력
	        }
	        System.out.println();


		}



		
		

	}
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}




}
