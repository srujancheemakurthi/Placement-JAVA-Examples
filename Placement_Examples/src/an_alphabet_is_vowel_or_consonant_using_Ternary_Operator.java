import java.util.*;
public class an_alphabet_is_vowel_or_consonant_using_Ternary_Operator {

	public static void main(String[] args) {
	Scanner srujan = new Scanner(System.in);
	System.out.println("ENter your letter:");
	char ch = srujan.next().charAt(0);
	
	String ConorVol = (ch== 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch =='u')  ? "vowel": "Consonent";
		System.out.println(ch + "  is a " +ConorVol);
	

	}

}
