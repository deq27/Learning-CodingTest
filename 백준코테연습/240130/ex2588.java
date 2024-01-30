package ex240130;

import java.util.Scanner;

public class ex2588 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum;
		
		System.out.println(sum=a*(b%10));
		System.out.println(sum=a*((b%100)/10));
		System.out.println(sum=a*(b/100));
		System.out.println(sum=a*b);
		
		sc.close();
	}

}
