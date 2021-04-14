import java.util.*;
public class Swap_two_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value a:");
		double a= sc.nextDouble();
		System.out.print("Enter the value b:");
		double b= sc.nextDouble();
		System.out.println("Value of a: w45"+a+" and value of b"+b+" before Swapping.");
		
		double temp =a;
		a=b;
		b=temp;
		System.out.println("Value of a: "+a+" and value of b"+b+" After Swapping.");
			
		
	}

}
