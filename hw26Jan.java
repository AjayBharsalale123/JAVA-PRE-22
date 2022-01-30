package FirstHand;

import java.util.Scanner;

public class hw26Jan {

	public static void main(String[] args) {
		
//		Write a program to swap 2 numbers, where numbers are taken from user"
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number a :");
		int a=sc.nextInt();
		System.out.println("Enter first number b :");
		int b=sc.nextInt();
		
		 a = a + b;
         b = a - b;
         a = a - b;
         System.out.println("After Swapping\n a= "+a+"\n b= "+b);
		
		
		
		
		/*
		
		//Write a program to print multiplication table of a number entered by user
		
		 System.out.print("Enter number: ");
	        int n=sc.nextInt();

	        for(int i=1;i<=10;i++){
	            System.out.println(n*i);
	        }
		
		
		/*
		//use while loop to calculate factorial of a number by taking user input
		
		int n,fact=1;
		
		System.out.println("Enter a number ");
		n=scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		
		
		
		/*
		 
	
	//Use while loop to calculate sum of numbrs till n, where n is taken from user

        int num, temp, sum = 0;
        
        System.out.print("Enter any number : ");
        num = scanner.nextInt();

        
        temp = num;

        while(temp != 0) {

            sum = sum+temp % 10;

           
            temp = temp/10;
        }

        System.out.println("\nSum of all digits in " + num + " : " + sum);
        */

	}

}
