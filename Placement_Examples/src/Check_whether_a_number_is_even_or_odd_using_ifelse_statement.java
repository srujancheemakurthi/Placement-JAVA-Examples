import java.util.*;
public class Check_whether_a_number_is_even_or_odd_using_ifelse_statement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		 float d= sc.nextFloat();
		 if(d%2==0) {
			 System.out.println("The entered value is an even number: " +d);
		 }
		 else
		 {
			 System.out.println("The entered value is an odd number: " +d);
		 }
		

	}

}
