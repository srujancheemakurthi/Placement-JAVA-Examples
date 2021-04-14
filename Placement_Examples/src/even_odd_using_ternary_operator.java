import java.util.*;
public class even_odd_using_ternary_operator {

	public static void main(String[] args) {
		Scanner srujan = new Scanner( System.in);
		System.out.println("Enter your value");
		int a= srujan.nextInt();
		
		String evenodd = (a%2==0) ? "even" : "odd";
		System.out.print(a+"is"+evenodd);

	}

}
