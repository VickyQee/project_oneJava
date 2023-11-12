public class Plant extends Organism{
        private static int plantCount = 0;
        private double length;

        public Plant(String name, double length) {
            super(name);
            this.length = length;
            plantCount++;
        }

        public double getLength() {return length;}
        public void setLength(double length) {this.length = length;}

        public static int getPlantCount() {
            return plantCount;
        }

        public void sleep(){
            System.out.println(getName() + " sleeps");
        }
    }
