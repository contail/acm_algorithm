package beak_1764;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		HashMap<String, String> hash_map = new HashMap();
		
		HashSet<String> set = new HashSet();
		ArrayList <String> al = new ArrayList();
		ArrayList <String> a2 = new ArrayList();
		for(int i=0; i<m+n; i++) {
			String a = sc.next();
			if(hash_map.containsKey(a))
				a2.add(a);
			else
				hash_map.put(a, "name");
		}
		System.out.println(a2.size());
		Collections.sort(a2);
		for(int i=0; i<a2.size();i++) {
			System.out.println(a2.get(i));
		}
		// TODO Auto-generated method stub

	}

}
