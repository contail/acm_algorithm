package beak_4673;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//셀프 넘버 구하기
		// 1+1 = 2
		// 2+2 = 4
		// 3+3 = 6
		// 4+4 = 8
		// 5+5 = 10
		boolean arr[] = new boolean[10002];
		
		
		for(int i=1; i<=10000; i++) {
			if(self_num_check(i) > 10000)
				break;
			arr[self_num_check(i)] = true;
		}
		for(int i=1; i<=9999; i++) {
			if(arr[i] == false)
				if(i<=9993)
					System.out.println(i);
		}
		
		// 131 이면 131 + 1 + 3 + 1
		
	}
	
	public static int self_num_check(int num) {
		int result = num;
		if(num >=10000) {
			result = result + num/10000;
			num = num%10000;
		} 
		if (num >= 1000) {
			result = result + num/1000;
			num = num%1000;
		} 
		if (num >= 100) {
			result = result + num/100;
			num = num%100;
		} 
		if (num >= 10) {
			result = result + num/10;
			num = num%10;
			
		} 
		if(num >=1){
			result = result + num;
		}
		return result;
	}
	

}
