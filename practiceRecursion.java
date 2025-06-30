package recursion;
import java.util.Scanner;

public class Recursion {
	static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else return n*factorial(n-1);
	}
	
	static int fibonacci(int x) {
		if(x<=1)
		 {
			return x;
		}
		else return fibonacci(x-1) + fibonacci(x-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number whose factorial you want to find : ");
        int a = sc.nextInt();
        System.out.println("Factorial is : " + factorial(a));
        System.out.print("Enter the number of terms in fibonacci series : ");
        int b = sc.nextInt();
        for(int i=0;i<b;i++) {
        System.out.print( fibonacci(i) + " ");
        }
	}

}
