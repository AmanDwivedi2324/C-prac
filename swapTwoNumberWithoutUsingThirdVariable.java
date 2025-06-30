package swapTwoNumber;
import java.util.Scanner;


public class SwapNumber {

	public static void main(String[] args) {
		
		//using third variable
//		Scanner sc = new Scanner(System.in);
//		int c;
//		System.out.print("Enter the first number : ");
//		int a = sc.nextInt();
//		System.out.print("Enter the second number : ");
//		int b = sc.nextInt();
//		 c=a;
//		 a=b;
//		 b=c;
//		 System.out.println("Swapped numbers using third variable c are : ");
//		 System.out.println("a is :" + a);
//		 System.out.println("b is :" + b);
		
		//without using third variable
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int a = sc.nextInt();
		System.out.print("Enter second number : ");
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Swapped numbers using third variable c are : ");
		System.out.println("a is :" + a);
	    System.out.println("b is :" + b);
        
	}

}
