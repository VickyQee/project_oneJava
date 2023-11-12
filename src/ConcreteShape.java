public class ConcreteShape {
    private double length;
    private double width;
    private int height;
    private double radius;

    public ConcreteShape(double length, double width, int height, double radius) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.radius = radius;
    }

    public double area(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    public double area( double length, double width){
        return length * width;
    }

    public double area(char x, int width, int height){
        return (0.5 * width) * height;
    }

    public static void main(String[] args) {
        ConcreteShape shape = new ConcreteShape(20, 10, 12, 7);
        System.out.println(shape.area(7));
        System.out.println(shape.area('T', 10, 12));
        System.out.println(shape.area(12, 10));
        System.out.println(shape.area(10,10));

    }
}

