package FirstHand;
import java.util.Scanner;

public class hw1Feb {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		
		check_oddEven(n);
		}
		
		static void check_oddEven(int n)
		{
		if(n%2==0) 
		    System.out.println(n+" is even"); 
		else 
		    System.out.println(n+" is odd");
		
		
		
		
//		int fact=1;
//		int m;
//		do {
//			System.out.println("Enter a Number :");
//			int n=sc.nextInt();
//
//			for(int i=1;i<=n;i++) {
//
//				fact=fact*i;
//			}
//
//			System.out.println("The factorial is "+fact);
//
//			System.out.println("If you want run again press 1 otherwise 0");
//			m=sc.nextInt();
//		}while(m==1); 
//
//		

//	
//	int n,cnt=0;
//	System.out.println("Enter any Number: ");
//	n = sc.nextInt();
//	
//	while(n > 0) {
//		n= n / 10;
//		cnt = cnt + 1; 
//	}
//	System.out.println(cnt);
}

}
