package beak_1107;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int current_position =100;
		Scanner sc = new Scanner(System.in);
		String want_channel = sc.next();
		String temp = want_channel;
		String temp1 = want_channel;
		int wrong_button = sc.nextInt();
		int min_check_count = 0;
		
		
		int arr[] = new int[wrong_button];
		for(int i=0; i<wrong_button; i++)
			arr[i] = sc.nextInt();
		int count =0;
		if (want_channel.equals("100"))
			System.out.println(0);
		else if(want_channel.equals("99") || want_channel.equals("101"))
			System.out.println(1);
		else if(want_channel.equals("98") || want_channel.equals("102"))
			System.out.println(2);
		else if(want_channel.equals("97") || want_channel.equals("103"))
			System.out.println(3);
		else {
			count = want_channel.length();
			int check = 0;
			int check_count=0;
			int check_up_count=0;
			if (wrong_button ==10) {
				System.out.println(Math.abs(current_position-Integer.parseInt(want_channel)));
			}
			else if(wrong_button >0) {
				while(true) {
					
					for(int i=0; i<wrong_button; i++) {
						if(want_channel.contains(arr[i]+""))
						{
							
							check++;
							break;
						}
					}
					if (check==0)
						break;
					else {
						int a = Integer.parseInt(want_channel);
						a--;
						
						if (a==current_position)
							break;
						want_channel = Integer.toString(a);
						
						check =0;
						check_count++;
						}
				}
				
					while(true) {
					
					for(int i=0; i<wrong_button; i++) {
						if(temp.contains(arr[i]+""))
						{
							
							check++;
							break;
						}
					}
					if (check==0)
						break;
					else {
						int a = Integer.parseInt(temp);
						a++;
						if(a >500000)
							break;
						temp = Integer.toString(a);
						
						check =0;
						check_up_count++;
						}
				}
				
				
				
				if(check ==0 && check_count==0)
					System.out.println(count);
				else {
					
					System.out.println(Math.min(Math.min(count+check_up_count, Math.abs(100-Integer.parseInt(temp1))),count+check_count));
				}
				
			}else {
				System.out.println(count);
			}
			
		}
	}

}
/*
5457
3
6 7 8


 */
