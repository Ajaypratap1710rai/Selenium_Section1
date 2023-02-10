package section1_selenium.java;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean cond=true;
		while(cond)
		{
			System.out.println("Enter 1 for mul\nEnter 2 for add\nEnter 3 for sub\nEnter 4 for div\nEnter 5for exit");
		     int a=sc.nextInt();
			
			switch(a)
			{
			case 1:System.out.println(mul(40,40));
			break;
			case 2:System.out.println(add(50,50));
			break;
			case 3:System.out.println(sub(60,30));
			break;
			case 4:System.out.println(div(20,2));
			break;
			default :System.out.println("Invalid output");
			break;
			case 5:cond=false;
			}
		}
	}
	
    public static int mul(int b,int c)
    {
	return b*c;
    }
    public static int add(int d,int e)
    {
    	return d+e;
    }
    public static int sub(int f,int g)
    {
    	return f-g;
    }
    public static int div(int h,int i)
    {
    	return h/i;
    }
}