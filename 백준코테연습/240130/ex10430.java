package ex240130;

import java.util.Scanner;

public class ex10430 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum;
		
		System.out.println(sum=(a+b)%c);
		System.out.println(sum=((a%c)+(b%c))%c);
		System.out.println(sum=(a*b)%c);
		System.out.println(sum=((a%c)*(b%c))%c);
		
		sc.close();
	}

}
