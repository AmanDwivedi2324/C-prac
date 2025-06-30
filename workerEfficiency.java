package worker;
import java.util.Scanner;

public class Worker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the time : ");
		int a = sc.nextInt();
		if(a>2 && a<=3) {
			System.out.print("Highly efficient..");
		}
		else if(a>3 && a<=4) {
			System.out.print("Improve Speed..");
		}
		else if(a>4 && a<=5) {
			System.out.print("Training will be given..");
		}
		else {
			System.out.print("Leave the company..");
		}

	}

}
