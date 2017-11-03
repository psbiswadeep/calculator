package com.java.core;
import java.util.Scanner;
	public class CalculatorTest  {
		  public static void main(String args[]){
			  Scanner sc=new Scanner(System.in);
              int a=sc.nextInt();
              int b=sc.nextInt();
			  Calculator cl=new Calculator();
			  assert cl.add(a,b) ==12: "Not valid" ;
			  System.out.println("12");
			  assert cl.sub(a, b)==4: "Not valid";
			  System.out.println("4");
			  assert cl.mul(a, b)==32: "Not valid";
			  System.out.println("32");
			  assert cl.div(a, b)==2: "Not valid";
			  System.out.println("2");
		  }
	
	}

