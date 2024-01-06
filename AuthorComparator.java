package HW3;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book author1, Book author2) {
        return author1.getAuthor().compareTo(author2.getAuthor());
    }
}