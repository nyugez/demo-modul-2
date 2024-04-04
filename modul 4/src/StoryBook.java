package books; // More specific package name related to books

public class StoryBook {
    private String title;
    private String author;
    private String genre;

    public StoryBook(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public void displayInfo() {
        System.out.println("Story Book: " + title + " by " + author + ", Genre: " + genre);
    }
}