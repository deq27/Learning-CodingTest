package ex240320;

import java.util.Scanner;

// 알파벳으로만 이루어진 단어를 입력받아서 길이를 출력하는 프로그램을 작성.
// ex) 입력 pulljima / 출력 8



public class ex2743 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		
		System.out.println(word.length()); // 변수명.length() : 문자열의 길이를 구하는 메소드

	}

}
