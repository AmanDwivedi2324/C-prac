package website;
import java.util.Scanner;
public class Website {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str.endsWith(".org")) {
			System.out.print("Organisational Website");
		}
		else if(str.endsWith(".com")) {
			System.out.print("Commercial Website");
		}
		else if(str.endsWith(".in")) {
			System.out.print("Indian Website");
		}
		else{
			System.out.print("Other type of Website");
		}
		

	}

}
