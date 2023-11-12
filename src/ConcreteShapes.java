public class ConcreteShapes {
        private double length;
        private double width;
        private int height;
        private double radius;

        public ConcreteShapes(double length, double width, int height, double radius) {
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
            ConcreteShapes shapes = new ConcreteShapes(20, 10, 12, 7);
            System.out.println(shapes.area(7));
            System.out.println(shapes.area('T', 10, 12));
            System.out.println(shapes.area(12, 10));
            System.out.println(shapes.area(10,10));

        }
    }

