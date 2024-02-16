package ex240216;

import java.util.Scanner;

public class ex2439 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
	
		
		for(int i =1; i<=a; i++) {
			for(int j=a; j>0; j--) {
				if(j<=i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		
		sc.close();

	}

}
