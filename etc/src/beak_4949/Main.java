package beak_4949;

import java.util.*;
public class Main {
	
	static int arr [];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count  = 0;
	
		while(sc.hasNextLine()){
			arr = new int[100];
			String a = sc.nextLine();
			if ( a.equals("."))
				break;
			if(check_word(a)) {
				System.out.println("yes");
			}
			else
				System.out.println("no");
//			count ++;
		}
		sc.close();
	}
	
	public static boolean check_word(String word) {

		Stack<Integer> st = new Stack<>();
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i) == '[') {
				st.push(1);
				
			}
			else if (word.charAt(i) == ']') {
				if(st.isEmpty()) {
					return false;
				}
				else {
					if(st.peek() == 1) {
						 
						st.pop();
					}
					else
						return false;
				}
			}
			else if (word.charAt(i) == '(') {
				st.push(2);
				 
			}
			else if (word.charAt(i) == ')') {
				if(st.isEmpty()) {
					return false;
				}
				else {
					if(st.peek() == 2) {
					 
						st.pop();
					}
					else {
						return false;
					}
				}
			}
			
		}
		if(!st.isEmpty())
			return false;			
		return true;
	}
}
