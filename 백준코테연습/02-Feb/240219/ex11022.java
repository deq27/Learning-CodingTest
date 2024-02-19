package ex240219;

import java.util.Scanner;

public class ex11022 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int a1[] = new int[a];
		int b1[] = new int[a];

		for(int i = 0; i<a; i++)
		{
			int b = sc.nextInt();
			int c = sc.nextInt();
			a1[i] = b;
			b1[i] = c;
		}
		
		for(int i = 0; i<a; i++) {
			System.out.println("Case #" + (i+1) + ": " + a1[i] + " + " + b1[i] + " = " + (a1[i]+b1[i]));
		}
		
		sc.close();
		
	}

}
