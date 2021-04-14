import java.util.*;
public class Quotient_and_Remainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("enter the value of divident:");
		float divident = sc.nextFloat();
		System.out.print("enter the value of divisor:");
		float divisor = sc.nextFloat();
		
		float quotient = divident/divisor;
		float reminder = divident%divisor;
		
		System.out.println("The value of quotient:" +quotient);
		System.out.print("The value of reminder:" +reminder);
	}

}
