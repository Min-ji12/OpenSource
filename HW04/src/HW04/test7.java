package HW04;

interface Shape0{
	final double PI=3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}
class Circle0 implements Shape0{
	int r;
	public Circle0(int r) {
		this.r=r;
	}
	public void draw() {
		System.out.println("반지름이 "+r+"인 원 입니다.");
	}
	public double getArea() {
		return r*r*PI;
	}
}
class Oval implements Shape0{
	int x,y;
	public Oval(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public double getArea() {
		return x*y*PI; 
	}
	public void draw() {
		System.out.println(x+"x"+y+"에 내접하는 타원입니다.");
	}
}

class Rect0 implements Shape0{
	int x,y;
	public Rect0(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public double getArea() {
		return x*y;
	}
	public void draw() {
		System.out.println(x+"x"+y+"크기의 사각형 입니다.");
	}
}

public class test7 {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape0 [] list= new Shape0[3];
		list[0] = new Circle0(10);
		list[1]=new Oval(20,30);
		list[2]=new Rect0(10,40);
		for(int i=0;i<list.length;i++) list[i].redraw();
		for(int i=0;i<list.length;i++) System.out.println("면적은 "+list[i].getArea());
	}	
 
}
