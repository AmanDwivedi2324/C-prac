package tax;
import java.util.Scanner;

public class TaxPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the income(in lakhs) per annum : ");
		float income = sc.nextFloat();
		float tax = 0;
		if(income <= 2.5f) {
		   tax=tax + 0;
		   System.out.print("Tax payment : ");
		   System.out.print(tax);
		}
		else if(income > 2.5f && income <= 5f) {
			   tax= (float) (tax + (0.05*(income-2.5f)));
			   System.out.print("Tax payment : ");
			   System.out.print(tax);
			}
		else if(income > 5f && income <= 10f) {
			   tax=(float)(tax + (0.05*(5.0f-2.5f)));
			   tax=(float)(tax + (0.2*(income-5f)));
			   System.out.print("Tax payment : ");
			   System.out.print(tax);
			}
		else if(income > 10f) {
			 tax=(float)(tax + (0.05*(5.0f-2.5f)));
			   tax=(float)(tax + (0.2*(10f-5f)));
			   tax = (float)(tax + 0.3*(income - 10f));
			 System.out.print("Tax payment : ");
			   System.out.print(tax);
		}
		

	}

}
