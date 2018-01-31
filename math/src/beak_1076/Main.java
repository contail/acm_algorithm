package beak_1076;
import java.util.*;

 
public class Main {
	
	static class Node{
		String s;
		int b;
		int c;
		
		Node(String s, int b, int c){
			this.s = s;
			this.b =b;
			this.c =c;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b= sc.next();
		String c = sc.next();
		
		long total = 1;
		if(a.equals("black")) {
			total*=0;
		}
		else if(a.equals("brown")) {
			total*=10;
		}else if(a.equals("red")) {
			total*=20;
		}else if(a.equals("orange")) {
			total*=30;
		}else if(a.equals("yellow")) {
			total*=40;
		}else if(a.equals("green")) {
			total*=50;
		}else if(a.equals("blue")) {
			total*=60;
		}else if(a.equals("violet")) {
			total*=70;
		}else if(a.equals("grey")) {
			total*=80;
		}
		else if(a.equals("white")) {
			total*=90;
		}
		
		
		if(b.equals("black")) {
			total=total+0;
		}
		else if(b.equals("brown")) {
			total+=1;
		}else if(b.equals("red")) {
			total+=2;
		}else if(b.equals("orange")) {
			total+=3;
		}else if(b.equals("yellow")) {
			total+=4;
		}else if(b.equals("green")) {
			total+=5;
		}else if(b.equals("blue")) {
			total+=6;
		}else if(b.equals("violet")) {
			total+=7;
		}else if(b.equals("grey")) {
			total+=8;
		}
		else if(b.equals("white")) {
			total+=9;
		}
		
		
		if(c.equals("black")) {
			total*=1;
		}
		else if(c.equals("brown")) {
			total*=10;
		}else if(c.equals("red")) {
			total*=100;
		}else if(c.equals("orange")) {
			total*=1000;
		}else if(c.equals("yellow")) {
			total*=10000;
		}else if(c.equals("green")) {
			total*=100000;
		}else if(c.equals("blue")) {
			total*=1000000;
		}else if(c.equals("violet")) {
			total*=10000000;
		}else if(c.equals("grey")) {
			total*=100000000;
		}
		else if(c.equals("white")) {
			total*=1000000000;
		}
		// TODO Auto-generated method stub

		System.out.println(total);
	}

}
