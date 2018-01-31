package dfsdfs;
import java.util.*;
/*다트 게임은 총 3번의 기회로 구성된다.
각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다.



옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다. 아차상(#) 당첨 시 해당 점수는 마이너스된다.
스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)
스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다. (예제 4번 참고)
스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다. (예제 5번 참고)
Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.*/
public class sdfdsf {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String str1 = sc.next();   
      String str2 = sc.next();   
      str1 = str1.toLowerCase();
      str2 = str2.toLowerCase();
      ArrayList<String>  list1 = new ArrayList<String>();
      ArrayList<String>  list2 = new ArrayList<String>();

      for(int i = 0; i < str2.length()-1; i++){
         if((97 <= (int)str2.charAt(i) && (int)str2.charAt(i) <= 122) 
               ||  (65 <= (int)str2.charAt(i) && (int)str2.charAt(i) <= 90)){
            if((97 <= (int)str2.charAt(i+1) && (int)str2.charAt(i+1) <= 122) 
                  ||  (65 <= (int)str2.charAt(i+1) && (int)str2.charAt(i+1) <= 90))
               list2.add(str2.charAt(i)+"" + str2.charAt(i+1) + "");
         }
      } 
      
      System.out.println(list2);
      for(int i = 0; i < str1.length()-1; i++){
         if((97 <= (int)str1.charAt(i) && (int)str1.charAt(i) <= 122) 
               ||  (65 <= (int)str1.charAt(i) && (int)str1.charAt(i) <= 90)){
            if((97 <= (int)str1.charAt(i+1) && (int)str1.charAt(i+1) <= 122) 
                  ||  (65 <= (int)str1.charAt(i+1) && (int)str1.charAt(i+1) <= 90))
               list1.add(str1.charAt(i)+"" + str1.charAt(i+1) + "");
         }
      }
      System.out.println(list1);
      
      
      ArrayList<String> result1 = new ArrayList<String>();
      ArrayList<String> result2 = new ArrayList<String>();
      for(int i = 0; i < list1.size(); i++)
         result2.add(list1.get(i));
      System.out.println(list1);
      for(int i = 0; i < list2.size(); i++)
         result2.add(list2.get(i));

      //교집합
      while(!list1.isEmpty()){
         if(list2.indexOf(list1.get(0)) != -1){
            result1.add(list1.get(0));
            list2.remove(list2.indexOf(list1.get(0)));
            result2.remove(result2.indexOf(list1.get(0)));
         }
         list1.remove(0);
      }

       int answer = 0;
      if(result2.size() == 0)
         answer = 65536;
      else
         answer = (int)(((float)result1.size()/(float)result2.size()) * 65536);
    		System.out.println(answer);
  }


     
      }
     
      
   






