package HW3;

import java.util.Comparator;

public class PublishedYearComparator implements Comparator<Book> {
    @Override
    public int compare(Book publishedYear1, Book publishedYear2) {
        return Integer.compare(publishedYear1.getPublishedYear(), publishedYear2.getPublishedYear());
    }
}
