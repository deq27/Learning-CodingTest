package ex240222;

import java.util.Scanner;

public class ex10807 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int ar[] = new int[a];
		int cnt=0;
		
		for(int i=0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		
		int b = sc.nextInt();
		
		for(int i=0; i<ar.length; i++) {
			if(ar[i]==b) {
				cnt++;
			}
		}
		System.out.println(cnt);

		sc.close();
	}

}
