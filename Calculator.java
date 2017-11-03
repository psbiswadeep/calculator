                                                                                                                 package com.java.core;

import java.util.Scanner;
class Calculator 
{
	public int add(int x,int y){
		return x+y;
	}
	public int sub(int x,int y){
		return x-y;
	}
	public int mul(int x,int y){
		return x*y;
	}
	public int div(int x,int y){
		return x/y;
	}

	public static void main(String[] args) 
	{
		int a,b,e;
	    int result;
		char d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no.s");
		System.out.println("Enter 1st no.= ");
		 a=sc.nextInt();
		System.out.println("Enter Second no.= ");
		 b=sc.nextInt();
		 System.out.println("Enter your symbol");
		 d=sc.next().charAt(0);
		Calculator cl=new Calculator();
		if(d=='+'){
			result=cl.add(a,b);
		System.out.println("Sum of two no.s = "+result);
		}
		else if(d=='-'){
			result=cl.sub(a,b);
		System.out.println("Substraction of two no.s = "+result);
		}
		else if(d=='*'){
			result=cl.mul(a,b);
		System.out.println("multiplication of two no.s = "+result);
		}
		else if(d=='/'){
			result=cl.div(a,b);
		System.out.println("Division of two no.s = "+result);
		}

		
	}
}
