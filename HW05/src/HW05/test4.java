package HW05;

import java.util.Scanner;

public class test4 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어, 한글 모두 됩니다.");
	String str = sc.nextLine();
	
	int len = str.length(); 
	
	for(int i = 0; i < len; i++) {
	
		char toLast = str.charAt(0);
		StringBuffer target = new StringBuffer(str.substring(1));
		target.append(toLast); 
		System.out.println(target); 
		str = target.toString(); 
}
	sc.close();
 }
}
