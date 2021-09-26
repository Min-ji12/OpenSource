package HW02;

import java.util.Scanner;

public class test2 {

/*3장 실습 4번 문제*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오 >>");
		
		String s = scanner.next(); 
		char c = s.charAt(0);
		
		for(int i=0; i<=c-'a'; i++) {
			for(char j='a'; j<=c-i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		scanner.close();
	}

}

