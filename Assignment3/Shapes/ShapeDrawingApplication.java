package Assignment3.Shapes;

abstract class Shape {
    String color;
    Double r;
    Double l;
    Double b;

    public Shape(String color, Double r){
        this.color=color;
        this.r=r;
    }

    public Shape(String color, Double l, Double b){
        this.color=color;
        this.l=l;
        this.b=b;
    }

    abstract void calculateArea();
    abstract void draw();
}

class Circle extends Shape{
    public Circle(String color, Double r){
        super(color, r);
    }

    @Override
    void calculateArea(){
        Double area = 3.14 * r*r;
        System.out.println("Area of Circle is " + area);
    }

    @Override
    void draw(){
        System.out.println("Drawing a circle of color "+ color);
    }
}

class Rectangle extends Shape{
    public Rectangle(String color, Double l, Double b){
        super(color, l, b);
    }

    @Override
    void calculateArea(){
        Double area = l*b;
        System.out.println("Area of rectangle is "+ area);
    }

    @Override
    void draw(){
        System.out.println("Drawing a Rectangle of color "+ color);
    }
}

public class ShapeDrawingApplication{
    public static void main(String args[]){
        Shape s1 = new Circle("green", 4.00);
        Shape s2 = new Rectangle("pink", 5.00, 3.00);

        s1.calculateArea();
        s1.draw();
        s2.calculateArea();
        s2.draw();
    }
}