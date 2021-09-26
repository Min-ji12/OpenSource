package HW01;

import java.util.Scanner;

public class test4 {
/*2장 실습 8번 문제*/
	public static boolean inRect(int x, int y, int rectx1, int rectx2, int recty1, int recty2) {
		if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2)) return true;
		else return false; 
	}
	
	public static void main(String[] args) { 
		Scanner scanner=new Scanner(System.in); 
		System.out.print("두 점 (x1,y1), (x2,y2)의 좌표를 입력하시오 >>");
		
		int rectx1 = scanner.nextInt();
		int recty1= scanner.nextInt();
		
		int rectx2 = scanner.nextInt();
		int recty2= scanner.nextInt();
		
		System.out.print("점(x,y)의 죄표를 입력하시오>>");
		
		int x = scanner.nextInt();
		int y= scanner.nextInt();
		
		if(inRect(x, y, rectx1, rectx2, recty1, recty2))
			System.out.println("사각형이 충돌합니다");
		else
			System.out.println("사각형이 충돌하지 않습니다");
		
		scanner.close();

 }
}