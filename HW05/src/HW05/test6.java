package HW05;

import java.util.Scanner;
import java.util.Random;

class Person1 {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	private String name;
	private String str;
	private int [] num = new int[3];
	public Person1(String name) {
		this.name = name;
	}
	public String get() {
		return this.name;
	}
	public boolean run() {
		System.out.print("[" + this.name + "]: <Enter>");
		while(!(str = sc.nextLine()).equals("")); //엔터키를 입력받으면 종료
		for(int i = 0; i < 3; i++) {
			num[i] = r.nextInt(3) + 1; //랜덤 생성
			System.out.print(num[i] + " ");
		}
		if(num[0] == num[1] && num[1] == num[2] && num[2] == num[0])
			return true; //모두 같으면 true 리턴
		return false;
	}
}

public class test6 {
	public static void main(String[] args) {
		boolean res;
		String name;
	
		Scanner sc = new Scanner(System.in);
		System.out.print("겜블링 게임에 참여할 선수 숫자>>");
		
		int n = sc.nextInt();
		Person1 P [] = new Person1[n]; //객체 배열 생성
		for(int i = 0; i < n; i++) {
		System.out.print((i + 1) + "번째 선수 이름>>");
		name = sc.next();
		P[i] = new Person1(name);
		}
		
		int i = 0;
		while(true) {
		res = P[i].run();
		if(res) {
		System.out.println("\t" + P[i].get() + "님이 이겼습니다!");
		break;
	}
		else System.out.println("아쉽군요!");
		i++;
		if(i == n) i = 0; //4명 모두 반복하면 다시 시작
	}
		sc.close();
	}
}
