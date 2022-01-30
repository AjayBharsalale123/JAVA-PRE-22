package FirstHand;
import java.util.Scanner;

public class hw24Jan {
	
	public static void main(String[] args) {
		
		// Write a program to print 10, 8, 6, 4, 2 using for loop and  while loop"
		
		for(int i=10;i>=2;i=i-2) {
			System.out.println(i);
		}
		
		/*
		
		for(int i=2;i<=10;i=i+2) {
			System.out.println(i);
		}
		
		/*
		
		int i=10;
		
		while(i>=2) {
			
				System.out.println(i);
				i=i-2;
			}
		
		
	//	Write a program to print 2,4,6,8,10 using for loop and  while loop
	
		/*
		int i=2;
		
		while(i<=10) {
			
				System.out.println(i);
				i=i+2;
			}
		
		
		
		 */
		// Write a program to print 10 to 1 using while loop
		
		/*
		int i=10;
		
		
		while(i>=1) {
			
				System.out.println(i);
				i--;
			}
		
	
		
		
		//Write a program to print 1 to 10 using while loop
		
		/*
		int i=1;
		
		
		while(i<=10) {
			
				System.out.println(i);
				i++;
			}
		
		
	//	Write an Algorithm that checks two numbers and print average of Two numbers
		
		/*
		int a,b,avg;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter first Number");
		 a=sc.nextInt();
		 System.out.println("Enter second Number");
		 b=sc.nextInt();
		 
		 avg = (a+b)/2;
		 
		 System.out.println("The Average is "+avg);
		 
		
		
		//Write an Algorithm that checks two numbers and print minimum of Two numbers
		/*
		 
		int a ,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		a=sc.nextInt();
		
		System.out.println("Enter Second Number ");
		b=sc.nextInt();
		
		if(a>b) {
			System.out.println("The Minimum Number is " +b);
		}else {
			System.out.println("The Minimum Number is " +a);
		}
		
		*/
		
		//Write algorithm that checks two numbers and print maximum of Two numbers
		
	/*	int a ,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		a=sc.nextInt();
		
		System.out.println("Enter Second Number ");
		b=sc.nextInt();
		
		if(a>b) {
			System.out.println("The Maximum Number is " +a);
		}else {
			System.out.println("The Maximum Number is " +b);
		}
		
	*/
	}

}
