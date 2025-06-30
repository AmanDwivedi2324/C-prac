package rockPaperScissor;
import java.util.Random;
import java.util.Scanner;
//import java.util.random.*;

public class RockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1 for stone, 2 for paper and 3 for scissor...");
		System.out.println("Now choose your number");
		int a = sc.nextInt();
		if(a==1) {
			System.out.println("User choose stone");
		}
		else if(a==2) {
			System.out.println("User choose paper");
		}
		else if(a==3) {
			System.out.println("User choose scissor");
		}
        Random ran = new Random();
        int b = ran.nextInt(1,4);
//        if(b==1) {
//			System.out.print("PC choose stone");
//		}
//		else if(b==2) {
//			System.out.print("PC choose paper");
//		}
//		else if(b==3) {
//			System.out.print("PC choose scissor");
//		}
        switch(b) {
        case 1:
        	System.out.println("PC choose stone");
        	break;
        case 2:
        	System.out.println("PC choose paper");
        	break;
        case 3:
        	System.out.println("PC choose scissor");
        	break;
        }
        int draw=0;
        int PC = 0;
        int user = 0;
       
        	if(a==1 && b==1) {
        		draw++;
        	}
        	else if(a==1 && b==2) {
        		PC++;
        	}
        	else if(a==1 && b==3) {
        		user++;
        	}
        	else if(a==2 && b==1) {
        		user++;
        	}
        	else if(a==2 && b==2) {
        		draw++;
        	}
        	else if(a==2 && b==3) {
        		PC++;
        	}
        	else if(a==3 && b==1) {
        		PC++;
        	}
        	else if(a==3 && b==2) {
        		user++;
        	}
        	else if(a==3 && b==3) {
        		draw++;
        	}
        
        if(user > PC && user > draw) {
        	System.out.println("User winner");
        }
        else if(PC > user && PC > draw) {
        	System.out.println("PC winner");
        }
        if(draw > PC && draw > user) {
        	System.out.println("Draw ");
        }
        }
	}


