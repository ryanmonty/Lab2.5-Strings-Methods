import java.util.Scanner;

public class StringLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a word. Output prints out with the first letter capitalized and all other letters lowercase.");
		String word = scnr.nextLine();
		capitalize(word);
		System.out.println("Enter a phrase that includes the word 'Waldo'. Output prints the location (index) in the string where the word “Waldo” first appears.");
		String phrase = scnr.nextLine();
		wheresWaldo(phrase);
		System.out.println("Enter two words. Output prints the string that comes first alphabetically, then prints the other");
		String a = scnr.nextLine();
		String b = scnr.nextLine();
		firstThingsFirst(a, b);
		System.out.println("Enter a word. Output will print it backwards");
		String s = scnr.nextLine();
		reverse(s);
		System.out.println("Enter two words. Output prints the longer of the two");
		String c = scnr.nextLine();
		String d = scnr.nextLine();
		soLong(c, d);
		System.out.println("Enter a phrase. If the phrase contains the word math, output prints the rest of the phrase starting with math. If not, it prints 'dud'.");
		String phrase2 = scnr.nextLine();
		afterMath(phrase2);
		System.out.println("Enter a word. Output prints one letter at a time");
		String word2 = scnr.nextLine();
		letterize(word2);
		
		scnr.close();
	}
	
	public static void capitalize(String word) {
		String output = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		
		System.out.println(output);
	}
	public static void wheresWaldo(String phrase) {
		String waldo = "Waldo";
		
		System.out.println(phrase.indexOf(waldo));
	}
	public static void firstThingsFirst(String a, String b) {
		int compare = a.compareTo(b);
		
		if(compare < 0) {
			System.out.println(a);
			System.out.println(b);
		}
		else if (compare > 0) {
		    System.out.println(b);
		    System.out.println(a);
		}
		else {
		    System.out.println("Those are the same word!");
		}
	}
	public static void reverse(String s) {
		String reverse = new StringBuilder(s).reverse().toString();
		System.out.println(reverse);
	}
	public static void soLong(String c, String d) {
		if (c.length() > d.length()) {
			System.out.println(c);
		}
		else if (c.length() < d.length()) {
			System.out.println(d);
		}
		else {
			System.out.println("Words are the same length");
		}
	}
	public static void afterMath(String phrase2) {
		if (phrase2.contains("math")) {
			String[] split = phrase2.split("math");
			String subString = split[1];
			System.out.println("math"+subString);
		}
		else {
			System.out.println("dud");
		}
		
	}
	public static void letterize(String word2) {
		char ch;
		
		for (int i=0; i<word2.length(); i++) {
			ch = word2.charAt(i);
			System.out.println(ch);
		}
	}
	
}