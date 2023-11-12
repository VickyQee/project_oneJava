import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean borrowed;
    public int numberOfPages;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.borrowed = false;
    }

    public Book(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public String toString(){
        return String.format("The book title: %s,\nAuthor: %s, \nPublication Year: %d,\n" +
                        "Borrowed: %s, \nNumber of Pages: %d \n________________________________", getTitle(), getAuthor(), getPublicationYear(),
                isBorrowed(), this.numberOfPages);
    }

}

class BookTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",");
        System.out.println("Please enter the Title, Author and publication year in a single line");
        String title = scanner.next();
        String author = scanner.next();
        String year = scanner.next().trim();
        int pubYear = Integer.parseInt(year);
        Book book = new Book();
        System.out.println(book);
        book.setTitle(title);
        book.setAuthor(author);
        book.setPublicationYear(pubYear);
        book.setBorrowed(true);
        book.numberOfPages = 350;
        System.out.println(book);

        Book bookTwo = new Book("How to Program, Java", "T.D John", 2023);
        bookTwo.numberOfPages = 2000;
        System.out.println(bookTwo);
    }
}


