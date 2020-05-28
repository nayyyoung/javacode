package exam.operator;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner scanner = new scanner(System.in);
		String inputstring;
		
		do {
			System.out.println('>"');
			inputstring = scanner.nextLine();
			System.out.println(inputString);
			} while(! inputstring.equal("q") );
		
		System.out.println();
		System.out.println();
		
	}

}
