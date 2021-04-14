import java.util.*;
public class Swap_two_numbers_without_using_temporary_variable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value a:");
		double a= sc.nextDouble();
		System.out.print("Enter the value b:");
		double b= sc.nextDouble();
		System.out.println("Value of a:"+a+" and value of b"+b+" before Swapping.");
		

		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("Value of a: "+a+" and value of b"+b+" After Swapping.");
			
	

	}

}
