package HW02;

import java.util.Scanner;

public class test8 {
/*3장 실습 16번 문제*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		String str[] = {"가위","바위","보"};
		
		do {
			int n= (int)(Math.random()*3);
			System.out.print("가위 바위 보!>>");
			String me = scanner.next();
			
			if(me.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			else if(me.equals(str[n])) {
					System.out.println("사용자  = "+ me +",컴퓨터 = " + str[n]+ ",비겼습니다." );
			}
			else if(me.equals("가위")) {
				if(n==1)
					System.out.println("사용자  = "+ me +",컴퓨터 = " + str[n]+ ",사용자가 졌겼습니다." );
				else
					System.out.println("사용자  = "+ me +",컴퓨터 = " + str[n]+ ",사용자가 이겼습니다." );
			}
			else if(me.equals("바위")) {
				if(n==0)
					System.out.println("사용자  = "+ me +",컴퓨터 = " + str[n]+ ",사용자가 이겼습니다." );
				else
					System.out.println("사용자  = "+ me +",컴퓨터 = " + str[n]+ ",사용자가 졌겼습니다." );
			}
			else {
				if(n==0)
					System.out.println("사용자  = "+ me +",컴퓨터 = " + str[n]+ ",사용자가 졌겼습니다." );
				else
					System.out.println("사용자  = "+ me +",컴퓨터 = " + str[n]+ ",사용자가 이겼습니다." );
			}
		}while(true);
		scanner.close();
	}

}
