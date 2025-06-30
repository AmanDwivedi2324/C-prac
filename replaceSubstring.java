package replaceSubstring;
import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		System.out.print("Enter the substring to replace : ");
        String str1 = sc.nextLine();
        System.out.print("Enter the substring by which the old one is replaced : ");
        String str2 = sc.nextLine();
        String str3 = str.replace(str1,str2);
        System.out.print("New string is : " + str3);
	}

}
