package beak_5397;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		
		
		int testcase = sc.nextInt();
		
		while(testcase-- >0) {
			
		ArrayList <String> al = new ArrayList<String>();
		ArrayList <String> a2 = new ArrayList<String>();
		String a = sc.next();
		for(int i=0; i<a.length(); i++) {
			
			if(a.charAt(i)!='<' && a.charAt(i) !='>' && a.charAt(i) !='-') al.add(a.charAt(i)+"");
			if(a.charAt(i) =='<' && al.size()!=0) a2.add(al.remove(al.size()-1)); 
			if(a.charAt(i)=='>'&& a2.size()!=0)  al.add(a2.remove(a2.size()-1));	
			if(a.charAt(i)=='-' && al.size()!=0) 
				{
				
				al.remove(al.size()-1);
				}		
		}
		while(!al.isEmpty()) {
			a2.add(al.remove(al.size()-1));
		}
		while(!a2.isEmpty()) {
			System.out.print(a2.remove(a2.size()-1) + "");
		}
		System.out.println();
		
	
				
//				System.out.println(a.charAt(i) + "======================");
//				
//				if(i <a.length()-1) {
//					if(a.charAt(i) =='<') {
//						check_value[i] = true;
//						left_count++;
//						
//					}
//					else if(a.charAt(i) == '>') {
//						check_value[i] = true;
//						right_count++;
//					}
//					else if (a.charAt(i+1)== '-') {
//						System.out.println(a.charAt(i+1));
//						al.remove(al.size()-1);
//						check_value[i+1] =true;
//					}
//					if (a.charAt(i+1)!='<' && a.charAt(i+1)!='>' && a.charAt(i+1) !='-') {
//						
//						System.out.println(al + " = ==== = ");
//						System.out.println(al.size() + "size ++");
//						System.out.println(temp + "temp + + + ");
//						if(left_count > right_count)
//							temp = temp-(left_count-right_count);
//						else if (left_count < right_count)
//							temp = temp+(right_count - left_count);
//						
//						if(left_count ==0 && right_count ==0) {
//							al.add(al.size(),a.charAt(i)+"");
//						}
//						else {
//							System.out.println(temp + "  " + a.charAt(i+1) + "  ");
//							al.add(temp,a.charAt(i+1)+"");
//						}
//						check_value[i+1] =true;
//						left_count =0;
//						right_count=0;
////						System.out.println(al + " = = ");
//					
//					}
//					else if(check_value[i] ==false) {
//						temp++;
//						al.add(a.charAt(i)+"");
//					}
//				}
//				
//				
//					
//			}
			
			
	
		
		
		}
	}

}
