package HW05;

class Circle{
    private int x,y,r;
    
    public Circle(int x,int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    
    public String toString() {
        return "Circle("+x+","+y+")반지름"+r;
    }
    
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    
    public boolean equals(Object obj) {        //이것이 있고 없고의 차이를 봐보세요
        //Circle myCircle = (Circle)obj  << 이렇게 다운캐스팅 한 myCircle 객체를 만들어서 써도 됩니다.
        if(this.x == ((Circle) obj).getX() && this.y == ((Circle) obj).getY())    //받은 객체를 Circle로 다운캐스팅 해야합니다!!
            return true;
        else
            return false;
    }
}
 


public class test1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle a = new Circle(2, 3, 5); 
		Circle b = new Circle(2, 3, 30);
		System.out.println("원 a: " + a);
		System.out.println("원 b: " + b);
		if(a.equals(b))
		System.out.println("같은 원");
		else
		System.out.println("서로 다른 원");
	}

}
