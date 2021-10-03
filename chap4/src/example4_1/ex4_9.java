package example4_1;

public class ex4_9 {
/*예제 4_9*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Normal");
		String d,e;
		a = null;
		d = c; //c가 가리키는 객체는 가비지 되었다
		c = null;
	}

}
