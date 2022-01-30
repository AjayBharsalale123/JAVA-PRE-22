package FirstHand;
import java.util.Scanner;

public class hw28Jan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Diamond Shape Pattern
		
		int row, i, j, space, decider;
	     
	      
	      System.out.print("Enter the Row Size: ");
	      row = sc.nextInt();
	      
	      decider = row/2;
	      
	      for(i=0; i<row; i++)
	      {
	         if(i<=decider)
	         {
	            for(space=i; space<decider; space++)
	               System.out.print(" ");
	            for(j=0; j<(i*2)+1; j++)
	               System.out.print("*");
	            System.out.print("\n");
	         }
	         else
	         {
	            for(space=i; space>decider; space--)
	               System.out.print(" ");
	            for(j=(row*2)-1; j>(i*2); j--)
	               System.out.print("*");
	            System.out.print("\n");
	         }
	      }
		
		//Pyramid Pattern
		
		/*
		 
		int rows = 5, k = 0;

	    for (int i = 1; i <= rows; ++i, k = 0) {
	      for (int space = 1; space <= rows - i; ++space) {
	        System.out.print("  ");
	      }

	      while (k != 2 * i - 1) {
	        System.out.print("* ");
	        ++k;
	      }

	      System.out.println();
	    }
		
		
		//Left Triangle Star Pattern
/*
		int row,r,c;

		
		System.out.print("Enter rows : ");

		row =sc.nextInt();

		
		for (r=0; r<row; r++)

		{

		for (c=2*(row-r); c>=0; c--) 
			System.out.print(" "); 
		for (c=0; c<=r; c++ )
			
		System.out.print("* ");

		System.out.println();

	}
	*/

}
}
