package example4;

public class ex1 {
	int radius; 
	String name; 
	public ex1() { }
	public double getArea() {
		return 3.14*radius*radius;
		}
	public static void main(String[] args) {
		ex1 pizza; pizza = new ex1(); 
		pizza.radius= 10;
		pizza.name = "�ڹ�����"; 
		double area = pizza.getArea();
		System.out.println(pizza.name + "�Ǹ�����" + area);
		ex1 donut = new ex1(); 
		donut.radius= 2; 
		donut.name = "�ڹٵ���"; 
		area = donut.getArea(); 
		System.out.println(donut.name + "�Ǹ�����" + area);
	
	}
	}
	