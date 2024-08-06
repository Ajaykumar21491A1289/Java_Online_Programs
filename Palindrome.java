package online;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a No");
		int n = in.nextInt();
		int m = n;
		int rev=0;
		while (n != 0)
		{
			rev = rev * 10 + n % 10;
			n = n / 10;
		}
		if (m == rev)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
