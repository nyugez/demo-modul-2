package books;

public class TextBook extends Book {
    private String subject;

    public TextBook(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("Text Book: " + title + " by " + author + ", Subject: " + subject);
    }
}