package online;
import java.util.Scanner;
public class BigThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 3 numbers");
		int n1= sc . nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if(n1>n2 && n1>n3) {
			System.out.println("n1 is big");
		}

		else if(n2>n3) {
			System.out.println("n2 is big");
		}
		else {
			System.out.println("n3 is big");
		}
	}

}
