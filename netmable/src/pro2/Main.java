package pro2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String words [] = {"a", "b","c","d"};
		int num = 5;
		
		System.out.println(solve(words,num));
		
		// TODO Auto-generated method stub

	}
	
	
	
	public static HashMap<Integer, Integer> solve(String words[],int num){
		int people =0;
		ArrayList<String> temp = new ArrayList();
		HashMap<Integer, Integer> map = new HashMap();
		for(int i=0; i<words.length;i++) {
			if(temp.indexOf(words[i]) !=-1) {  //이전에 사용했던 단어인지 검사하기. 
				if((i+1)%num ==0) {
					map.put(i+1, num); // 해당하는 번호, 차례 저장하기. 
				}
				else {
					map.put(i+1, (i+1)%num); // 해당하는 번호, 차례 저장하기. 
				}
			}
			else //이전에 사용한 단어 없으면 temp list에 단어 추가 
			{
				System.out.println(temp.indexOf(words[i]));
				temp.add(words[i]);
				
				
				break;  // 반복 종료  
			}
		}
		
		System.out.println(map+ "------------");
		
		if(map.isEmpty()) {  // 중복이 없었을 경우 
			map.put(0,0);  //0번째 , 0 차례 
			return map;
		}
		else 
			return map;
		
		
	}

}
