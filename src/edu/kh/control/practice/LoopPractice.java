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
	
	public void practice6() {
		System.out.println("숫자 :");
		int dan = sc.nextInt();
		if(dan<2||dan>9) {
			System.out.println("2~9사이 숫자만 입력해주세요.");
			
		}
		else {
			for(int i=dan; i<=9; i++) {
				System.out.println("====="+i+"단"+"=====");
			}
		}
			
				
	}
	public void practice7() {
		System.out.println("정수 입력 : ");
		int i =sc.nextInt();
		for(int n=1; n<=i; n++){
			for(int j=1; j<=n; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		}
	public void practice8() {
		System.out.println("정수 입력 : ");
		int i =sc.nextInt();
		for(int n=i; n>=1; n--) {
			for(int j=1;j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
	}
	public void practice9() {
		System.out.println("정수 입력 : ");
		int i =sc.nextInt();
		for(int n=1; n<=i; n++) {
			for(int j=i; j>n; j--) {
				System.out.print(" ");
			}
			 for(int j=1; j<=n; j++) 
			 {System.out.print("*");
		}
			 System.out.println();
			 }
		
	}
	public void practice10() {
		 System.out.print("정수 입력: ");
	        int i = sc.nextInt();

	        // 삼각형 위쪽 부분 출력
	        for (int n = 1; n <= i; n++) {
	            for (int j = 1; j <= n; j++) {
	                System.out.println("*");
	            }
	        }

	        // 삼각형 아래쪽 부분 출력
	        for (int n = i - 1; n >= 1; n--) {
	            for (int j = 1; j <= n; j++) {
	                System.out.println("*");
	            }
	        }
	}
	public void practice11() {
		System.out.print("정수 입력: ");
        int i = sc.nextInt();

        for (int n = 1; n <= i; n++) {
            // 각 줄의 시작에 띄어쓰기를 출력
            for (int s = i - n; s > 0; s--) {
                System.out.print(" ");
            }

            // 별(*) 출력
            for (int j = 1; j <= 2 * n - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
		
	}
	public void practice12() {
		System.out.print("정수 입력: ");
        int i = sc.nextInt();

        // 첫 번째 줄 출력
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();

        // 두 번째 줄부터 i-1 번째 줄 출력
        for (int n = 1; n <= i - 2; n++) {
            System.out.print("*");
            for (int s = 1; s <= i - 2; s++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        // 마지막 줄 출력
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
	}
		  
	public void practice13() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("자연수 하나를 입력하세요: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.print("2와 3의 배수: ");
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.print(i + " ");
                if (i % 2 == 0 && i % 3 == 0) {
                    count++;
                }
            }
        }

        System.out.println("\ncount: " + count);
    }
	}
