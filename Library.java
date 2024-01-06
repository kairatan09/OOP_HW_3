package HW3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library implements Iterable<Book> {
    List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public void booksPrint() {
        for (Book book : this.books) {
            System.out.println(book);
            System.out.println();
        }
    }

    @Override
    public Iterator<Book> iterator() {
        return new BooksIterator(books);
    }

    public static class BooksIterator implements Iterator<Book> {
        int index = 0;
        List<Book> internalBooks;

        public BooksIterator(List<Book> internalBooks) {
            this.internalBooks = internalBooks;
        }

        @Override
        public boolean hasNext() {
            return internalBooks.size() <= index + 1;
        }

        @Override
        public Book next() {
            Book book = internalBooks.get(index);
            index++;
            return book;
        }
    }
}
