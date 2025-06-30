package overLoading;                      //using a method multiple types by changing parameters
import java.util.Scanner;

public class OverLoading {
	static void foo() {                           
		System.out.print("Hii AMAN fool...");
	}
    static int foo(int x) {
    	int y;
    	 y=x*x;
    	return y; 	
    }
    static int foo(int x, int y) {
    	int c;
		if(x>y) {
			c = (x*y)*x;
		}
		else {
			c = (x*y)*y;
		}
		return c;
    }
    
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		foo();
		System.out.println();
		
		System.out.print("Enter the number whose square you want to find : ");
		int a = sc.nextInt();
		int b = foo(a);
		System.out.println(b);
		
		System.out.print("Enter value of first number : ");
		int c = sc.nextInt();
		System.out.print("Enter the value of second number : ");
		int d = sc.nextInt();
		int e = foo(c,d);
		System.out.println(e);
	

	}

}
