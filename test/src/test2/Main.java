package test2;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String type = sc.next();
		String a = sc.next();
		int rotation = sc.nextInt();
		String b = sc.next();
		
		List al = new ArrayList<String>();
		ArrayList<String> result = new ArrayList<String>();
		String [] list_word = new String[b.length()+1];
		String arr[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t"
				,"u","v","w","x","y","z"};
		al =Arrays.asList(arr);
		
		if (type.equals("encrypt")) {
			int secret_count = 0;
			for(int i=0; i<b.length();i++) {
				if(secret_count == a.length())
					secret_count =0;
				int insert_value=Integer.parseInt(al.indexOf(a.charAt(secret_count)+"")+"") + Integer.parseInt(al.indexOf(b.charAt(i)+"")+"");
				if (Integer.parseInt(al.indexOf(a.charAt(secret_count)+"")+"") + Integer.parseInt(al.indexOf(b.charAt(i)+"")+"")>25)
					insert_value = Integer.parseInt(al.indexOf(a.charAt(secret_count)+"")+"") + Integer.parseInt(al.indexOf(b.charAt(i)+"")+"") -26;
				result.add(arr[insert_value]);
				secret_count++;			
			}
			if (rotation >0) {
				for(int i=0; i<rotation; i++) {
					
					String temp = result.get(0);
					result.remove(0);
					result.add(temp);
					
				
			}
			}
			else {
				for(int i=0; i<Math.abs(rotation); i++) {			
					String temp = result.get(result.size()-1);
					result.remove(result.size()-1);
					result.add(0,temp);
			}
			}
			
			
			String listString = String.join("", result);
			System.out.print(listString);
		}
		else {
			List<String> myList = new ArrayList<String>();
			for(int i=0; i<b.length();i++) {
				myList.add(b.charAt(i)+"");
			}
			
			if(rotation >0) {
				for(int i=0; i<rotation; i++) {			
					String temp = myList.get(myList.size()-1);
					myList.remove(myList.size()-1);
					myList.add(0,temp);		
					
			}
			}
			else {
				for(int i=0; i<Math.abs(rotation); i++) {			
					String temp = myList.get(0);
					myList.remove(myList.get(0));
					myList.add(temp);
			}
			}
			
			
			String listString = String.join("", myList);
			int secret_count = 0;
			for(int i=0; i<b.length();i++) {
				if(secret_count == a.length())
					secret_count =0;
				int insert_value=Integer.parseInt(al.indexOf(listString.charAt(i)+"")+"") - Integer.parseInt(al.indexOf(a.charAt(secret_count)+"")+"") ;
				if (Integer.parseInt(al.indexOf(listString.charAt(i)+"")+"") - Integer.parseInt(al.indexOf(a.charAt(secret_count)+"")+"")<0)
					insert_value = Integer.parseInt(al.indexOf(listString.charAt(i)+"")+"") - Integer.parseInt(al.indexOf(a.charAt(secret_count)+"")+"") + 26;
				result.add(arr[insert_value]);
				secret_count++;			
			}
			String result_String = String.join("", result);
			System.out.println(result_String);
			
			
			
		}
		
		

	}

}
