import java.util.*;
public class an_alphabet_is_vowel_or_consonant_using_switch_statement {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter your letter: ");
		  char a = Sc.next().charAt(0);
		   
		  switch (a) {
		  case  'a':
		  case 'e':
		  case 'i':
		  case 'o':
		  case 'u':
			  System.out.println(a + " Your letter is vowel.");
			  break;
			  default:
				  System.out.print(a+ "  Your letter is consonant.: ");
			  
		  }
		
		

	}

}
