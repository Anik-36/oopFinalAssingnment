package designclasses;
class Point{
    private double x;
    private double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void display(){
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

class Line{
    private double startX;
    private double startY;
    private double endX;
    private double endY;

    public Line(double startX,double startY,double endX,double endY){
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
    }

    public double Length(){
        return Math.sqrt(Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2));
    }
    
    public void display(){
        System.out.println("Line: ");
        System.out.println("Point: (" + startX + ", " + startY + ")");
        System.out.println("Point: (" + endX + ", " + endY + ")");
        System.out.println("Length: " + Length());
    }
}

class Triangle{
    private double side1;
    private double side2;
    private double side3;

    public Triangle (double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double calculateArea(){
        double a = side1;
        double b = side2;
        double c = side3;
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public void display(){
        System.out.println("Triangle : ");
        System.out.println("Side 1: " + side1);
        System.out.println("Side 2: " + side2);
        System.out.println("Side 3: " + side3);
        System.out.println("Area: " + calculateArea());
    }
}
class Quadrangle{
    void square(int side){
        int area = side * side;

        System.out.println("Square:");
        System.out.println("Side Length: " + side);
        System.out.println("Area: " + area);
    }

    void rectangle(int length,int width){
        int area = length * width;
        System.out.println("Rectangle:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
    }

    void parallelogram(int base, int height){
        int area = base * height;
        System.out.println("Parallelogram:");
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area);

    }

    void trapezoid(int base1, int base2, int height){
        double area = 0.5 * (base1 + base2) * height;
        System.out.println("Trapezoid:");
        System.out.println("Base 1: " + base1);
        System.out.println("Base 2: " + base2);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area);
    }
    
    void rhombus(int diagonal1,int diagonal2){
        double area = 0.5 * diagonal1 * diagonal2;
        System.out.println("Rhombus:");
        System.out.println("Diagonal 1: " + diagonal1);
        System.out.println("Diagonal 1: " + diagonal2);
        System.out.println("Area: " + area);

    }
}
class Circle{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public void display(){
        System.out.println("Circle: ");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
    }
}
class Ellipse{
    private double semiMajorAxis;
    private double semiMinorAxis;
    public Ellipse(double semiMajorAxis, double semiMinorAxis){
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }
    public double calculateArea(){
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }
    public void display(){
        System.out.println("Ellipse:");
        System.out.println("Semi-Major Axis: " + semiMajorAxis);
        System.out.println("Semi-Minor Axis: " + semiMinorAxis);
        System.out.println("Area: " + calculateArea());
    }
}
class Hyperbola{
    private double a;
    private double b;
    public Hyperbola(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double calculateArea(){
        // Area of a hyperbola is not straightforward and often involves calculus.
        // This example just returns -1 to indicate that the calculation is not straightforward.
        return -1;
    }
    public void display() {
        System.out.println("Hyperbola:");
        System.out.println("Semi-Major Axis: " + a);
        System.out.println("Semi-Minor Axis: " + b);
        System.out.println("Area: Calculation not straightforward for a hyperbola.");
    }
}
class Cone{
    private double radius;
    private double height;
    public Cone(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    public double calculateVolume(){
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
    public double calculateSurfaceArea(){
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }
    public void display() {
        System.out.println("Cone:");
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
        System.out.println("Volume: " + calculateVolume());
        System.out.println("Surface Area: " + calculateSurfaceArea());
    }
}
class Sphere{
    private double radius;
    public Sphere(double radius){
        this.radius = radius;
    }
    public double calculateVolume(){
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
    public double calculateSurfaceArea(){
        return 4 * Math.PI * Math.pow(radius, 2);
    }
    public void display(){
        System.out.println("Sphere:");
        System.out.println("Radius: " + radius);
        System.out.println("Volume: " + calculateVolume());
        System.out.println("Surface Area: " + calculateSurfaceArea());
    }
}
class Cylinder {
    private double radius;
    private double height;
    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    public double calculateVolume(){
        return Math.PI * Math.pow(radius, 2) * height;
    }
    public double calculateSurfaceArea(){
        return 2 * Math.PI * radius * (radius + height);
    }
    public void display(){
        System.out.println("Cylinder:");
        System.out.println("Radius: " + radius);
        System.out.println("Height: " + height);
        System.out.println("Volume: " + calculateVolume());
        System.out.println("Surface Area: " + calculateSurfaceArea());
    }
}
public class GeomatricalShape{
    public static void main(String[] args){
        Point point = new Point(5,6);
        Line line = new Line(3, 5, 3, 7);
        Triangle triangle = new Triangle(4, 24, 34);
        
        // Quadrangle
        Quadrangle quadrangle = new Quadrangle();
        
        // Others
        Circle circle = new Circle(7);
        Ellipse ellipse = new Ellipse(4,6);
        Hyperbola hyperbola = new Hyperbola(4, 2);
        
        Cone cone = new Cone(2, 5);
        Sphere sphere = new Sphere(6);
        Cylinder cylinder = new Cylinder(5, 8);
        

        // Call methods on objects
        point.display();
        System.out.println("-------------------------");
        line.display();
        System.out.println("-------------------------");
        triangle.display();
        System.out.println("-------------------------");
        // Quadrangle
        quadrangle.square(55);
        System.out.println("-------------------------");
        quadrangle.rectangle(6, 6);
        System.out.println("-------------------------");
        quadrangle.parallelogram(2, 18);
        System.out.println("-------------------------");
        quadrangle.trapezoid(7, 9, 6);
        System.out.println("-------------------------");
        quadrangle.rhombus(4, 8);
        // Others
        System.out.println("-------------------------");
        circle.display();
        System.out.println("-------------------------");
        ellipse.display();
        System.out.println("-------------------------");
        hyperbola.display();
        System.out.println("-------------------------");
        cone.display();
        System.out.println("-------------------------");
        sphere.display();
        System.out.println("-------------------------");
        cylinder.display();

    }
}