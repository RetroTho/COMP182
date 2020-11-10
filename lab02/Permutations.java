import java.util.Scanner;

public class Permutations{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s = input.nextLine();

		displayPermutations(s);

		System.out.println("Number of Permutations: " + factorial(s.length()));
	}

	public static void displayPermutations(String s){
		displayPermutations("", s);
	}

	public static void displayPermutations(String s1, String s2){

		if(s2.isEmpty()){
			System.out.println(s1);

		}
		else{
			for(int i = 0, pCount = 0; i < s2.length(); i++){
				if(s2.isEmpty()){
					System.out.println(s1);
				}
				displayPermutations(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i+1));
			}
		}
	}

	public static long factorial(int n){
		if(n == 0){
			return 1;
		}
		else{
			return (n * factorial(n - 1));
		}
	}
}