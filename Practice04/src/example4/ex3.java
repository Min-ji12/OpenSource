package example4;

public class ex3 {
int radius;
String name;

	public ex3() {
		radius = 1;
		name = "";
	}
	
	public ex3(int r, String n) {
		radius = r;
		name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex3 pizza = new ex3(10,"�ڹ�����");
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������" + area);
		
		ex3 donut = new ex3();
		donut.name = "���� ����";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
		
	}

}
