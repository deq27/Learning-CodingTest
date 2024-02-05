package ex240205;

import java.util.Scanner;

public class ex2525 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int tp = sc.nextInt();
		
		int a = (h*60 + m + tp);
		int b = (a/60)%24;
		int c = a%60;
		
		System.out.println(a + " " + c);
		
		sc.close();
	}

}
