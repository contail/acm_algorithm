package pro3;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

    /*
     * Description :
     * Time complexity :
     * Space complexity :
     */
    public boolean match(String pattern, String str) {
        int j = 0;
       char possibleChar = '#'; 
        for(int i = 0; i < str.length(); i++){
             if(pattern.length() <= j)
                     return false;
             if(pattern.charAt(j) == '?'){
                j++;
                continue;
             }
             else if(pattern.charAt(j) == '*'){
                   possibleChar = pattern.charAt(j+1);
                   if(possibleChar == str.charAt(i) || possibleChar =='?'){
                       continue;
                   } else{
                      j+=2;
                      i--;
                   }
             }else if(pattern.charAt(j) == str.charAt(i)){
                j++;
             }else{
                return false;
             }
        }
        if(pattern.charAt(pattern.length()-1) == str.charAt(str.length()-1)) {
        		return true;
        }
        else
        		return false;
        	
        	
       
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        try (Scanner scan = new Scanner(System.in)) {
            int TC = Integer.parseInt(scan.nextLine());
            for (int t = 0; t < TC; t++) {
                String[] strs = scan.nextLine().split(" ");
                System.out.println(main.match(strs[0], strs[1]) ? "O" : "X");
            }
        }
    }
}