package beak_5063;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase =sc.nextInt();
		while(testcase-->0) {int a=sc.nextInt();int b=sc.nextInt(); int c=sc.nextInt(); 
		if(b-c>a)System.out.println("advertise");
		else if(b-c<a)System.out.println("do not advertise"); 
		else System.out.println("does not matter");}}}
