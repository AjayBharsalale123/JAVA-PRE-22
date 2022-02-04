package hw_Geekster;
import java.util.Scanner;
public class hw2_3_Feb {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int m;
		
		System.out.println("Enter any character");
		char ch=sc.next().charAt(0);
		
		String str=(ch=='a'|ch=='e'|ch=='i'|ch=='o'|ch=='u')?"Character is Vowel":"Character is Consonent";
		
		System.out.println(str);
		
		
		
//		System.out.println("Enter a Number :");
//		int num=sc.nextInt();
//		
//		switch(num)
//		{
//		case 1:
//			System.out.println("January ");
//			break;
//		
//		case 2:
//			System.out.println("February ");
//			break;
//		
//		case 3:
//			System.out.println("March  ");
//			break;
//			
//		case 4:
//			System.out.println("April  ");
//			break;
//			
//		case 5:
//			System.out.println("May  ");
//			break;
//			
//		case 6:
//			System.out.println("June ");
//			break;
//			
//		case 7:
//			System.out.println("July  ");
//			break;
//			
//		case 8:
//			System.out.println("August  ");
//			break;
//			
//		case 9:
//			System.out.println("September  ");
//			break;
//			
//		case 10:
//			System.out.println("October  ");
//			break;
//			
//		case 11:
//			System.out.println("November  ");
//			break;
//			
//		case 12:
//			System.out.println("December ");
//			break;
//			
//		default:
//			System.out.println("You Enter Wrong ");
//			break;
//		}
//		
//		
		
		
		
//		System.out.println("Enter a number ");
//		int n=sc.nextInt();
//		
//		String str = ( n ==10|n ==20|n ==30|n ==40|n ==50)?"Number is Present":"Number is Not Present ";
//		
//		
//		
//		System.out.println(str);
//		
//		
		
		
		
		
		
		
//		System.out.println("Enter a number");
//		int n=sc.nextInt();
//		String str = "";
//		
//		str=(n>10)?"Number is Greater than 10 "
//				:(n>5)?"Number is Greater than 5"
//				:"Number is Smaller than 5";
//		System.out.println(str);
//		
		

	}

}
