package example4;


 class ex6 {
	int radius;
	public ex6(int radius) {
		this.radius= radius;
		}
	public double getArea() {
		return 3.14*radius*radius;
		}
	
 public static class ex6Array{
	public static void main(String[] args) {
		ex6 [] c; c = new ex6[5];
		for(int i=0; i<c.length; i++)
			c[i] = new ex6(i);
		for(int i=0; i<c.length; i++) 
			System.out.print((int)(c[i].getArea()) + " "); 
		}
	}
 }
