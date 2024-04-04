package books;

// Remove the incorrect import statement
// import java.awt.print.Book;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

public class HistoryBook extends Book { // Assuming a Book class exists
    private int year;

    public HistoryBook(String title, String author, int year) {
        super(title, author);
        this.year = year;
    }

    @Override
    public void displayInfo() {
        System.out.println("History Book: " + title + " by " + author + ", Year: " + year);
    }
}