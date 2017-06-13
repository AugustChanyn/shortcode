import java.util.Scanner;
import java.io.IOException;
/**
 * Fibonacci Sequence Calculator
 * @author amardeepparhar
 * 	
 * Description: Enter a number and have the program generate the Fibonacci number recursively.
 */
public class fibonacci {

	public static void main(String args[]) throws IOException{
		Scanner scan = new Scanner(System.in);
			System.out.println("Enter a integer : ");
			int num = scan.nextInt();
			
			System.out.println("Number: "+fibRecusion(num));		
	}
	
	private static int fibRecusion(int num){
		if(num == 1 || num == 2){
			return 1;
		}
		else{
			return fibRecusion(num-1)+fibRecusion(num-2);
		}
	}
}
