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
		pizza.name = "자바피자"; 
		double area = pizza.getArea();
		System.out.println(pizza.name + "의면적은" + area);
		ex1 donut = new ex1(); 
		donut.radius= 2; 
		donut.name = "자바도넛"; 
		area = donut.getArea(); 
		System.out.println(donut.name + "의면적은" + area);
	
	}
	}
	