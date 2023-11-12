public class Animals extends Organism{
    private static int animalCounts = 0;
    private int numberOfLegs;

    public Animals(String name, int numberOfLegs) {
        super(name);
        this.numberOfLegs = numberOfLegs;
        animalCounts++;
    }

    public int getNumberOfLegs() {return numberOfLegs;}
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public static int getAnimalCounts() {return animalCounts;}
    public void speak(){
        System.out.println(getName() + " makes sound");
    }
}
