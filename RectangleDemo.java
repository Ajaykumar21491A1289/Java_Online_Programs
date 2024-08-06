package online;
class Rectangle{
	int length;
	int breadth;
	int area;
	Rectangle(int l,int b){
		length = l;
		breadth =b;
	}
	public void area() {
		area = length*breadth;
		System.out.println("Area of Rectangle is : "+ area);
	}
	
}
public class RectangleDemo {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(10,10);
		r.area();

	}

}
