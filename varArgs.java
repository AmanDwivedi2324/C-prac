package varArgs;
import java.util.Scanner;
public class VarArgs {
	static int sum(int a ,int b , int ... arr) {               //var act as array and perform function at any number of arguments
		int result = a+b;          
		for(int element: arr) {
			result = result + element;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = sum(5,6,5);
		System.out.println("The sum of three values : " + c);
		int d = sum(4,2,5,6);
		System.out.print("The sum of four values : " + d);
		

	}

}
