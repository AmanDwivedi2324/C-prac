package reverse;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
		int [] aman = {4,5,7,8,9};
		int l = aman.length;
		int n = Math.floorDiv(l,2); //give greatest integer
		int temp;
		for(int i=0;i<n;i++) {
			temp = aman[i];
			aman[i] = aman[l-1-i];
			aman[l-1-i] = temp;
			
		}
		for(int element:aman) {
			System.out.print(element + " ");
		}

	}

}
