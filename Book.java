package HW3;

public class Book {
    private final String title;
    private final String author;
    private final int publishedYear;

    public Book(String title, String author, int publishedYear) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    @Override
    public String toString() {
        return "Название: " + title +
                "\nАвтор: " + author +
                "\nГод издания: " + publishedYear;
    }
}
