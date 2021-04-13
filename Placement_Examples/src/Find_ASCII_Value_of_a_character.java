import java.util.*;
public class Find_ASCII_Value_of_a_character {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter your letter");
		 char ch = sc.next().charAt(0);
	      //  int ascii = ch;
	        // You can also cast char to int
	        int castAscii = (int) ch;

	        //System.out.println("The ASCII value of " + ch + " is: " + ascii);
	        System.out.println("The ASCII dd value of " + ch + " is: " + castAscii);
	    }
	}