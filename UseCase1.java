package Basics;

public class UseCase1 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "J. Author", 350.0, "ISBN001");
        Book b2 = new Book("OOP Concepts", "K. Writer", 420.0, "ISBN002");

        System.out.println(b1.getTitle() + " by " + b1.getAuthor());
        System.out.println("Price: " + b2.getPrice());
        System.out.println("Library: " + Book.libraryName);
        System.out.println("Total books added: " + Book.bookCount);
    }
}
class Book {
    final static String libraryName = "Sunrise Public Library";
    static int bookCount = 0;
    private String title;
    private String author;
    private double price;
    private String isbn;
    public Book(String title, String author, double price, String isbn) {
        bookCount +=1;
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public double getPrice(){
        return this.price;
    }
    public String getISBN(){
        return this.isbn;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setISBN(String isbn){
        this.isbn = isbn;
    }
}
