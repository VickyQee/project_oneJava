public abstract class Shapes {
        protected String color;

        public Shapes(String color){
            this.color = color;
        }

        public abstract double calculateArea();

        public void display(){
            System.out.println("This is a " + color + " shape.");
        }
    }

    class Circles extends Shapes{
        private final double radius;

        public Circles(String color, double radius){
            super(color);
            this.radius = radius;
        }


        @Override
        public double calculateArea() {
            return Math.PI * Math.pow(radius, 2);
        }
    }

    class Rectangle extends Shapes{
        private final double length;
        private final double width;

        public Rectangle(String color, double length, double width){
            super(color);
            this.length = length;
            this.width = width;
        }


        @Override
        public double calculateArea() {
            return length * width;
        }
    }

    class ShapesTest{
        public static void main(String[] args) {
            Shapes circle = new Circles("Green Circle", 8);
            Shapes rectangle = new Rectangle("Blue Circle", 12, 10);

            System.out.println(circle.calculateArea());
            System.out.println(rectangle.calculateArea());
            circle.display();
            rectangle.display();
        }
    }

