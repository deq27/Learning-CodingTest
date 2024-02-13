package ex240213;

import java.util.Scanner;

public class ex25304 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int price = sc.nextInt();
		int cnt = sc.nextInt();
		int pr2=0, a=0;
		
		int sum=0;
		
		for(int i = 0; i<cnt; i++) {
			pr2 = sc.nextInt();
			a = sc.nextInt();
			sum += (pr2*a);
		}
		
		if(price == sum) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		sc.close();
		
		

	}

}
