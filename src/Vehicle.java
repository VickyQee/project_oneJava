public class Vehicle {
    protected String brand;

        public void drive(){
            System.out.println("Driving the Vehicle");
        }

    }

    class Car extends Vehicle{
        private int numberOfSeats;

        public int getNumberOfSeats() {
            return numberOfSeats;
        }

        public void setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
        }

        public void drive(){
            System.out.println("Driving the Car");
        }
    }

    class MotorCycle extends Vehicle{

        private boolean hasSideCar;

        public boolean isHasSideCar() {
            return hasSideCar;
        }

        public void setHasSideCar(boolean hasSideCar) {
            this.hasSideCar = hasSideCar;
        }
    }

    class Test{
        public static void main(String[] args) {
            Car car = new Car();
            car.brand = "Toyota";
            car.setNumberOfSeats(6);

            car.drive();
            System.out.println(car.getNumberOfSeats());
            System.out.println("_____________________________________________________");

            MotorCycle motorCycle = new MotorCycle();
            motorCycle.brand = "Honda";
            motorCycle.setHasSideCar(false);
            motorCycle.drive();
            System.out.println(motorCycle.isHasSideCar());

        }
    }

