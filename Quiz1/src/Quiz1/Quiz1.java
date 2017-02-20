package Quiz1;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is ATT?");
		double ATT = input.nextDouble();
		System.out.println("What is COMP?");
		double COMP = input.nextDouble();
		System.out.println("What is YDS?");
		double YDS = input.nextDouble();
		System.out.println("What is TD?");
		double TD = input.nextDouble();
		System.out.println("What is INT?");
		double INT = input.nextDouble();
		
		double a = (COMP/ATT - 0.3) * 5 ;
		double b = (YDS/ATT -3)*0.25;
		double c = (TD/ATT)*20;
		double d = 2.375 - ((INT/ATT) *25);
		
		double QB = ((a+b+c+d)/6)*100;
		System.out.println(QB);
	}
}
