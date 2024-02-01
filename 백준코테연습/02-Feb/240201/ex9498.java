package ex240201;

import java.util.Scanner;

public class ex9498 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		if(cnt >= 90) System.out.println("A");
		else if (cnt >= 80) System.out.println("B");
		else if (cnt >= 70) System.out.println("C");
		else if (cnt >= 60) System.out.println("D");
		else System.out.println("F");

		sc.close();
	}

}
