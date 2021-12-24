package FirstHand;
import java.util.Scanner;

public class CountNumberDigit {

	public static void main(String[] args) {
		int Number, Count=0;
		Scanner sc = new Scanner(System.in);	
		Number = sc.nextInt();
		
		for (Count = 0; Number > 0; Number = Number/10) {
			Count = Count + 1; 
		}
		System.out.println(Count);
	}

}

