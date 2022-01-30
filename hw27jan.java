package FirstHand;
import java.util.Scanner;

public class hw27jan {
	
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
	/*	
		//  Compound Intrest
		
		
		double pr, rate, t, sim,com;
	   
	    System.out.println("Enter the amount:");
	    pr=sc.nextDouble();
	    
	    System. out. println("Enter the No.of years:");
	    t=sc.nextDouble();
	    
	    System. out. println("Enter the Rate of  interest");
	    rate=sc.nextDouble();
	    
	    com=pr * Math.pow(1.0+rate/100.0,t) - pr;
	   
	    System.out. println("Compound Interest="+com);
		
	/*	
		// WAP to print first x terms of the series 3N + 2 which are not multiples of 4.
		
		int n = sc.nextInt();
		int count = 0;
		for(int i=1; count<n;i++)
		{
		int ap = 3*i+2;
		
		if(ap%4!=0)
		{
		System.out.print(ap+" ");
		count=count+1;
		}
		}
		
		
	/*	//Reverse a number
		
		System.out.println("Enter a number which you want to reverse :");
		
		int n=sc.nextInt(); 
		int rev= 0;  
		while(n!= 0)   
		{  
		int rem = n % 10;  
		rev= rev* 10 + rem;  
		n = n/10;  
		}  
		System.out.println("The reverse of the given number is: " + rev);  
		
		
		
		/*
		//Sum of even and odd digits
		
		
		int n,evenSum = 0, oddSum = 0;
		
		
		System.out.print(" Please Enter any Number : ");
		n = sc.nextInt();	
		
		for(int i = 1; i <= n; i++)
		{
			if(i % 2 == 0)
			{
				evenSum = evenSum + i; 
			}
			else
			{
				oddSum = oddSum + i;
			}
		}
		System.out.println("Sum of Even Number" +n+ "  =  " + evenSum);
		System.out.println("Sum of Odd Numbers" +n+ "  =  " + oddSum);
		
		
		/*
		
		//Java Program To Calculate Distance Between Two Points
		         int x1,x2,y1,y2;
             	 double  distance;
	             System.out.println("enter x1 point");
	              x1=sc.nextInt();
	              System.out.println("enter y1 point");
	               y1=sc.nextInt();
                  System.out.println("enter x2point");
                  x2=sc.nextInt();
                    System.out.println("enter y2 point");
	                   y2=sc.nextInt();
	  	    
		 distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
 	 	    	 	    
  	         System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+distance);
 
	
 

		
		
		
		
		
		
		
		
		
		
		
		//Find permutation and combination of numbers
		        /*
		        System.out.println("Enter N : ");
		        int n =sc.nextInt();
		        System.out.println("Enter R :");
		        int r = sc.nextInt();
		        
		        int comb, per;
		        per = factorial(n) / factorial(n-r);
		        System.out.println("Permutation: " + per);
		        comb = factorial(n) / (factorial(r) * factorial(n-r));
		        System.out.println("Combination: " +comb);
	}
		
		
		private static int factorial(int n) {
	        int fact = 1;
	        int i = 1;
	        while(i <= n) {
	            fact *= i;
	            i++;
	        }
	        return fact;
	    
	   
		

		      */
		
		//Check if a year is leap year or not
		/*
		
		int year;
		System.out.println("Enter the year ");
		year=sc.nextInt();
		
		if(year %4 == 0) {
			System.out.println("This is the leap year");
		}else {
			System.out.println("This is not a leap year");
		}
		
		*/
		
		      
		     
		}

	}

