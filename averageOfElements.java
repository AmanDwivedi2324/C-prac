package average;
import java.util.Scanner;

public class AverageUsingForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       float [] marks = {10.00f,11.5f,15.5f,19.4f,15.24f};
      
       int n = marks.length;
       float sum = 0;
       for(float element:marks) {
    	   sum = sum + element;
       }
       float average = sum/n;
       System.out.print("Average of marks is : " + average );
	}

}
