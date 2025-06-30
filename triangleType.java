package triangleType;
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first side : ");
		int a = sc.nextInt();
		System.out.print("Enter the second side : ");
		int b = sc.nextInt();
		System.out.print("Enter the third side : ");
		int c = sc.nextInt();
		if(a+b>c && b+c>a && c+a>b ) {
			System.out.println("Triangle is possible...");
            if(a==b && b==c) System.out.println("Triangle is equilateral");
			else if((a==b && b!=c)||(b==c && c!=a) || (c==a && a!=b)) System.out.println("Traingle is isosceles triangle");
			else if((a!=b && b!=c)||(b!=c && c!=a) || (c!=a && a!=b)) System.out.println("Triangle is scalene triangle");
		}
		else {
			System.out.print("Triangle is not possible");
		
		}
		
	}

}
