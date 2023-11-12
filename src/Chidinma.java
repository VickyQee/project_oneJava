public class Chidinma {
    private String firstName;
    private String lastName;
    private String fullName;
    private int age;
    private String address;
    private String email;

    public Chidinma(String firstName, String lastName, int age, String address, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.email = email;
        this.fullName = firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
    public static void main(String[] args) {
        Chidinma chidinma1 = new Chidinma("Yahya", "Khadijat", 25, "Phase1, Lagos"
                , "chidinma@mail.com");
        System.out.println(chidinma1.getFullName());
        System.out.println(chidinma1.getAddress());
    }
}

