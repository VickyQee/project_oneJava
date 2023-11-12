public class Main2 {
        public static void main(String[] args) {
            Animals goat = new Animals("Goat", 4);
            Plant spinach = new Plant("Spinach", 5.0);
            Tree Iroko = new Tree("Iroko", 20.5);
            Dog dog = new Dog("Bulldog", 4);

            System.out.println("Total number of organisms = " + Organism.getOrganismCount());
            System.out.println("Total number of animals = " + Animals.getAnimalCounts());
            System.out.println("Total number of plants = " + Plant.getPlantCount());

            System.out.println("........................................................");
            System.out.println();


            goat.speak();
            spinach.sleep();
            Iroko.sleep();
            dog.speak();
        }
}







