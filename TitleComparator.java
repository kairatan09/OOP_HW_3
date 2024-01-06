package HW3;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book title1, Book title2) {
        return title1.getTitle().compareTo(title2.getTitle());
    }
}
