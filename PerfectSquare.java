package FirstHand;
import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) 
	{
		
		Scanner sca = new Scanner(System.in);     
		double number=sca.nextDouble();   
		if (checkPerfectSquare(number))  { 
		System.out.println("Yes, the given number is perfect square.");  
		}
		else {  
		System.out.print("No, the given number is not perfect square.");  
		}
		}  
		static boolean checkPerfectSquare(double number)   
		{   
		for (int i=1; i*i<=number; i++)   
		{   
		if((number%i==0) && (number/i==i))   
		{   
		return true;   
		}   
		}   
		return false;   
	}

}


