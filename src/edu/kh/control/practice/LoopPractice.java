package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int input1 = sc.nextInt();
		if(input1<1) {
			System.out.println("1이상의 숫자를 입력하세요");
		}
		else{
			for(int i=1;input1>=i; ++i) {
				System.out.print(" " +i+ "");
		}
			
		}
	

	}
	public void practice2()	{
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int input1 = sc.nextInt();
		if(input1<1) {
			System.out.println("1이상의 숫자를 입력하세요");
		}
		else 
			{for(int i=input1; 1<=i; --i) { 
				System.out.print(" " +i+ "");}
			}
		
	
	}
	public void practice3() {
		System.out.println("정수를 하나 입력하세요 : ");
		int input1 = sc.nextInt();
		int sum = 0;
		for(int i=1; input1>=i; ++i) {
			sum+=i; System.out.print(i+"+");
		}
		System.out.print(input1+"="+sum);
	    
	}
	public void practice4() {
	 System.out.println("첫 번째 숫자 : ");
	 int input1 = sc.nextInt();
     System.out.println("두 번째 숫자 : ");
     int input2 = sc.nextInt();
		if(input1<1||input2<1) {
			  System.out.println("1이상 숫자를 입력해주세요");
		}
		else {
			for(int i =0; input1>=i&&input2>=i; ++i) {
			if(input1>input2) 
			{System.out.print(input2+i+" ");
			 }
			 else
			 {System.out.print(input1+i+" ");
			 }
			}
			}
	}
	public void practice5() {
		 System.out.println("숫자 : ");
		 int input1 = sc.nextInt();
		 System.out.println("=== "+input1+"===");
		
		 for(int i = 1; i<=9; ++i) {
			 int sum=i*input1;
			 System.out.println(input1+"*"+i+ "=" + sum);
			 
		 }
	}
	}
