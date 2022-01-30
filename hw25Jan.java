package FirstHand;
import java.util.Scanner;

public class hw25Jan {
	
		public static void main(String[] args) {
			
			Scanner sc=new Scanner (System.in);
			
			long n,p,r=1;
			
			System.out.println("Enter a number ");
			n=sc.nextLong();
			System.out.println("Enter the power");
			p=sc.nextLong();
			
			if(n>=0 && p==0) {
				r=1;
				
			}else if(n==0 && p>=1) {
				r=0;
			}
			else {
				for(int i=1;i<=p;i++) {
					r=r*n;
					
				}
				System.out.println(" " +r);
			}

		/*
		
		Scanner sc=new Scanner (System.in);
        int num, i = 2;
        System.out.println("Entre a number : ");
        num=sc.nextInt();

        boolean flag = false;
        while (i <= num / 2) {
        if (num % i == 0) {
        flag = true;
        break;
        }
        ++i;
        }
        if (!flag)
        System.out.println(num + " is a prime number.");
        else
        System.out.println(num + " is not a prime number.");
        
        */

	}

}
