package e3;

import java.util.Scanner;

public class Exam3new{
	
	
	
    public static boolean isLeapYear(Integer year){
    	String n;
    	String y;
    	String r;
    	int m;
    	System.out.println( "请输入某年某月某日：" );
        Scanner q = new Scanner(System.in);
        String e = q .nextLine();
        String e1 = q .nextLine();
        String e2 = q .nextLine();

       
       n=e.substring(0, 4);
       y=e1.substring(5, 2);
       r=e2.substring(8, 1);
      
       System.out.println(n);
       System.out.println(y);
       System.out.println(r);
       m=Integer.parseInt(n);
       

    if((m%4==0 && m%100!=0) || m%400==0){
    return true;
    }
    else
    return false;
}
    public static void main(String[]args){
    Integer i = new Integer(400);
    boolean res = isLeapYear(i);
    System.out.println(res); 
    }
}
