package ex240214;

import java.util.Scanner;

public class ex11021 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum[] = new int[a];
		
		for(int i =0; i<a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			sum[i] = b+c;
		}
		
		for(int i=0; i<a; i++) {
			System.out.println("Case #" + (i+1) + ": " + sum[i]);
		}

		sc.close();
	}

}
