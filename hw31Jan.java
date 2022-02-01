package FirstHand;
import java.util.Scanner;		

public class hw31Jan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		     checkP("ABCBA");
		     
	}
		     static void checkP(String s) {
			     boolean result = true;
			     int length = s.length();
			     for (int i = 0; i < length / 2; i++) {
			        if (s.charAt(i) != s.charAt(length - i - 1)) {
			           result = false;
			           break;
			         }
			     }
			      System.out.println(s + " is palindrome = " + result);
		
//		//Take String input as Name of the city and convert it to reverse 
//		//string and show on the console.
//		
//		String a, r = " ";
//	    
//
//	    System.out.println("Enter a string to reverse");
//	    a = sc.nextLine();
//
//	    int length = a.length();
//
//	    for (int i = length - 1 ; i >= 0 ; i--)
//	      r = r + a.charAt(i);
//
//	    System.out.println("Reverse of the string: " + r);
		
		
		
//		// Write a Java program to convert minutes into a number of years and days.
//		
//		System.out.println("Enter a minute : ");
//		int mn=sc.nextInt();
//		
//		int yr=mn/(365*24*60);
//		int rm=mn%(365*24*60);
//		int dy=rm/(24*60);
//		
//		
//		System.out.println(+yr+"Year "+dy+" Days ");
		
//		//Write a Java program that reads a number in inches, converts it to meters.
//		System.out.println("Enter Inches''");
//		double inch=sc.nextInt();
//		
//		double inck = inch*0.0254;
//		
//		System.out.println(inck);
		
		
//		
//		//Write a Java program to convert temperature from Fahrenheit to Celsius degree.
//		System.out.println("Enter a Fahrenheit :");
//		int f=sc.nextInt();
//		
//		float c=(f-32)*5/9;
//		System.out.println(c);
//		
//		
		
		
//		Write a program to add 3 to the ASCII value of the any character user proides 
//		and print the equivalent character.
//		
//		System.out.println("Enter a Character :");
//		
//		char ch = sc.next().charAt(0);
//		
//		int chr=ch+3;
//		
//		char aj=(char) chr;
//		
//		System.out.println(aj);
//		
		
		
		
		
		
		// Print the ASCII value of any character user proides
		
//		System.out.println("Enter a Character :");
//		
//		char ch = sc.next().charAt(0);
//		
//		int chr=ch;
//		
//		System.out.println(chr);
//		
//		
//		
//		//ques 1 : 1.Write a program to print the product of the decimal and int numbers ex: 8.2 and 6
//		
//		float a = 8.2f;
//		int b = 6;
//		
//		float c=a+b;
//		System.out.println(c);
//		

	}

	

}
