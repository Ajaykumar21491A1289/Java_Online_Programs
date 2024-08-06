package online;

interface Shape {
    void area();
}

class Circle implements Shape {
    float pi = 3.14f, area;
    int r3 = 5;  // Assuming a radius value, as it wasn't provided

    public void area() {
        area = pi * r3 * r3;
        System.out.println("Area of circle is " + area);
    }
}

class Rect implements Shape {
    int l = 3, b = 3, area;

    public void area() {
        area = l * b;
        System.out.println("Area of Rectangle is " + area);
    }
}

public class Interface {
    public static void main(String[] args) {
        Rect r = new Rect();
        r.area();
        
        Circle c = new Circle();
        c.area();
    }
}
