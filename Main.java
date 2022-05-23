import java.util.Scanner;

/**
 * This class is a an implementation of term retrieval for the fibonnaci sequence,
 * using recursion. The user inputs the term they wish to retrieve, and it is printed out.
 * @author Kevin Lai
 */

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a term in the fibonnaci sequence:");
		int n = scanner.nextInt();
		System.out.println("Term " + n + " of the fibonnaci sequence is " + fibonnaci(n));
	}
	
	/**
	 * This is the recursive method which retrieves the specified term in the sequence.
	 * @param n  nth term in the sequence the user wishes to retrieve.
	 * @return the value of the term,
	 * For example, the 10th term has a value of 55, so it is returned and then printed 
	 * in the upstream method.
	 */
	public static int fibonnaci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		
		return fibonnaci(n - 2) + fibonnaci(n - 1);
	}
}
