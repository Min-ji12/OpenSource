package example4;

import java.util.Scanner;

	public class ex2 {
		int width;
		int height;
		public int getArea() {
			return width*height;
			}
		public static void main(String[] args) {
			ex2 rect= new ex2();
			Scanner scanner= new Scanner(System.in);
			System.out.print(">> ");
			rect.width= scanner.nextInt();
			rect.height= scanner.nextInt();
			System.out.println("�簢���Ǹ�����"+ rect.getArea());
			scanner.close();
			}
		}
	
