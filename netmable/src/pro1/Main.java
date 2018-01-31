package pro1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub

		/*
		 * ArrayList를 이용하여, 각 단어에 대한 자리 위치를 비교하는 알고리즘으 작성  
		 */
		 
		ArrayList<String> temp = new ArrayList();
		String a = sc.next().toLowerCase(); // 첫번 째 단어  
		String b = sc.next().toLowerCase(); // 두번 째 단어 
		System.out.println(check_wording(a, b, temp)); // 함수 실행 

	}

	public static boolean check_wording(String a, String b, ArrayList<String> temp) {
		for (int i = 0; i < b.length(); i++) { // 비교할 단어만큼 길이를 반복
			temp.add(b.charAt(i) + ""); // 
		}
		for (int i = 0; i < a.length(); i++) { //첫번째 단어로 비교 시
			if ((temp.indexOf(a.charAt(i) + "") != -1)) { //첫번째 단어 자리 위치에 해당하는 요소가 리스트안에 있을 경
				temp.remove(temp.get(temp.indexOf(a.charAt(i) + "")));  //list의 길이를 줄임  
			} 

		}

		if (temp.size() == 0 && a.length() == b.length()) //리스트의 길이가 0   =>즉, 단어가 다 일치함.  그리고 입력받은 첫번째, 두번째 단어 길이가 똑같아야함  
			return true;
		else
			return false;

	}

}
