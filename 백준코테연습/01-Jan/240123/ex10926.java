package baekJoonCT;

import java.util.Scanner;

public class ex10926 { // 문자열 입력후 뒤에 ??! 출력

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str;
		str = sc.nextLine();
		
		System.out.println(str+"??!");

		sc.close();
	}
	
}
