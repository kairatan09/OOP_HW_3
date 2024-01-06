package HW3;

import java.util.Comparator;

public class PublichedYearComarator implements Comparator<Book> {
    @Override
    public int compare(Book publichedYear1, Book publichedYear2) {
        return Integer.compare(publichedYear1.getPublichedYear(), publichedYear2.getPublichedYear());
    }
}
