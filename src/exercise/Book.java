package exercise;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", "some title", "some author", "some publisher", 10f, 0, true);
        book1.displayData();
        book1.calPriceOut();
        book1.displayData();
    }

    private String bookId;
    private String title;
    private String author;
    private String publisher;
    private float price_in;
    private float price_out;
    private boolean isActive;

    public Book() {
    }

    public Book(String bookId, String title, String author, String publisher, float price_in, float price_out, boolean isActive) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price_in = price_in;
        this.price_out = price_out;
        this.isActive = isActive;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public float getPrice_in() {
        return price_in;
    }

    public void setPrice_in(float price_in) {
        this.price_in = price_in;
    }

    public float getPrice_out() {
        return price_out;
    }

    public void setPrice_out(float price_out) {
        this.price_out = price_out;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void inputData(Scanner scanner) {
        System.out.println("Insert bookId: ");
        setBookId(scanner.nextLine());
        System.out.println("Insert book title: ");
        setTitle(scanner.nextLine());
        System.out.println("Insert author name: ");
        setAuthor(scanner.nextLine());
        System.out.println("Insert publisher name: ");
        setPublisher(scanner.nextLine());
        System.out.println("Insert price_in: ");
        setPrice_in(Float.parseFloat(scanner.nextLine()));
    }

    public void displayData() {
        System.out.printf("\"%s\" written by %s published by %s has the price %.3f%n", this.title, this.author, this.publisher, this.price_out);
    }

    public void calPriceOut() {
        setPrice_out((float) (this.price_in * 1.2));
    }
}
