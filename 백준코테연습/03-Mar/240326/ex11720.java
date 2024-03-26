package ex240326;

import java.util.Scanner;

public class ex11720 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String ar = sc.next();
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			
			sum = sum + ar.charAt(i) -'0';
		}
		
		System.out.println(sum);

	}

}
