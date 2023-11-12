public class Organism {
        private static int organismCount = 0;
        private String name;

        public Organism(String name) {
            this.name = name;
            organismCount++;
        }

        public String getName() {return name;}
        public void setName(String name) {this.name = name;}

        public static int getOrganismCount() {return organismCount;}
    }

