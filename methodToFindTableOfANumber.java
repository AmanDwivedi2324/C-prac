package methodQuestions;
import java.util.Scanner;

public class Method {
	
//	problem 1
	
//	static int table(int n,int i) {
//		
//			return n*i;
//	
//	}
//	 static void table(int n) {
//		 for(int i=1;i<=10;i++) {
//			 System.out.format("%d x %d = %d",n,i,n*i);
//			 System.out.println();
//		 }
//		 
//	 }
	
//	problem 2
	
//	static void pattern(int n) {
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
	
//	problem 3
	
//	static int sum(int n) {
//		if(n==1) return 1;
//		else return (n + sum(n-1));
//	}
	
//	problem 4
	
//	static void pattern1(int n) {
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n-i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
	
//	problem 5
	
//	static int fibo(int n) {
//		if(n==1) return 0;
//		else if(n==2) return 1;
//		else return fibo(n-1) + fibo(n-2);
//	}
	
//	problem 6 ///////
	
//	static float average(int b,int... n) {
//		int sum = 0;
//		float ave = 0;
//		for(int element:n) {
//		   sum += element;
//		   ave = sum/b;
//		}
//		return ave;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the Nth term : ");
//		int a = sc.nextInt();
//		for(int i=1;i<=10;i++) {
//			System.out.println(table(a,i));
//		}
//		table(a);  (problem 1)
//		pattern(a); (problem 2)
//		System.out.print("Sum of n natural numbers : " + sum(a));   (problem 3)
//        pattern1(a);    (problem 4)
//		int b = fibo(a);  (fibonacci series = 0,1,2,3,5,8,13,...)
//		System.out.print(b);
//		System.out.print("Enter the number of parameters : ");
//		int b = sc.nextInt();
//		System.out.print("Average is : " + average(b,1,2,3,4,5));
	}

}
