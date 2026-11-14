package by.itacademy.satsuk.javabasics.oop.book;

public class Book {
    private String id;
    private String name;
    private String author;
    private String price;
    private String publisher;
    private String yearOfPublication;
    private int numberOfPages;

    public Book(String id, String name, String author, String price, String publisher, String yearOfPublication, int numberOfPages) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price='" + price + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearOfPublication='" + yearOfPublication + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPrice() {
        return price;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
