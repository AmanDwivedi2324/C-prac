package array;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] aman = {4,5,5,7,9};
		System.out.print("Enter the element that you want to find : ");
        int num = sc.nextInt();
        boolean isInArray = false;
        for(int element:aman) {
        	if(num==element) {
        		isInArray = true;
        		break;
        	}
        }
        if(isInArray) {
        	System.out.print("Element is present in the array");
        }
        else System.out.print("Element is not present in the array");
	}

}
