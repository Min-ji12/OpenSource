package HW02;

public class test6 {
/*3장 실습 12번 문제*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i=0; i<args.length;i++) {
			try {
				sum+=Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e) {
				continue;
			}
		}
		System.out.println("합:" + sum);
	}

}
