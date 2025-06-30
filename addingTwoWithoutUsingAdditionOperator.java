package addTwoNumberWithoutUsingAdditionOperator;
import java.util.Scanner;

public class AddingOperator {

	public static void main(String[] args) {

		// using subtraction operator

//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter the first number : ");
//		int a = sc.nextInt();
//		System.out.print("Enter the second number : ");
//		int b = sc.nextInt();
//		System.out.print("Sum of two numbers is : " + (a-(-b)));
		
		// using increament decreament operator
        
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a = sc.nextInt();
		System.out.print("Enter the second number : ");
		int b = sc.nextInt();
		
		// to handle positive a 
		while(a > 0) {
			b++;
			a--;
		}
		 
		// to handle negative a 
		while(a<0) {
			a++;
			b--;
		}
		
		System.out.print("Sum of two numbers is : " + b);

	}

}
