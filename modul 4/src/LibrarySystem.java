package com.main;

import java.awt.print.Book;
import java.util.ArrayList;

public class LibrarySystem {
    public static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Library System Program");

        // Add some sample books (replace with actual logic)
        books.add(new books.HistoryBook("History of Java", "Robert Griesemer"));
        books.add(new books.StoryBook("The Lord of the Rings", "J.R.R. Tolkien"));

        // Call methods to manage the library (replace with stubs)
        displayMenu();
    }

    public static void displayMenu() {
        System.out.println("\n=== Library Menu ===");
        System.out.println("1. Add Book");
        System.out.println("2. Display Books");
        System.out.println("3. Exit");

        int choice = InputUtil.inputInt("Enter your choice: ");

        switch (choice) {
            case 1:
                addBook();
                break;
            case 2:
                displayBooks();
                break;
            case 3:
                System.out.println("Exiting Library System...");
                System.exit(0);
            default:
                System.out.println("Invalid choice!");
        }
    }

    // Add methods for addBook(), displayBooks(), etc. (stubs for now)
    public static void addBook() {
        System.out.println("Adding Book (stub)");
    }

    public static void displayBooks() {
        System.out.println("Displaying Books (stub)");
        for (Book book : books) {
            System.out.println(book.toString()); // Assuming Book has a toString() method
        }
    }
}