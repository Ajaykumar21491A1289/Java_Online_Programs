package online;

import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] n = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter 9 elements");
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				n[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				System.out.println(n[i][j]);
				
			}
		}
	}

}
