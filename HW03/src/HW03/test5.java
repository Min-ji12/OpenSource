package HW03;

import java.util.Scanner;

class Dictionary {
	private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
	private static String [] eng = { "love", "baby", "money", "future", "hope" };
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
				return eng[i];
			}
		}
		return null;
	}
}

public class test5 {
	/*4장 실습 10번 문제*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		System.out.print("한글 단어?");
		String st=scanner.next();
		
		while(!st.equals("그만")) {
			String result=Dictionary.kor2Eng(st);
			if(result!=null) {
				System.out.println(st+"는 "+result);
			}
			else {
				System.out.println(st+"는 저의 사전에 없습니다.");
			}
			System.out.print("한글 단어?");
			
			st=scanner.next();
		}
	}

}
