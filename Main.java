package HW3;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Толстой Л.Н.", 1873);
        Book book2 = new Book("Мёртвые души", "Гоголь Н.В.", 1842);
        Book book3 = new Book("Руслан и Людмила", "Пушкин А.С.", 1820);
        Library library = new Library();
        library.add(book1);
        library.add(book2);
        library.add(book3);

        System.out.println("Список книг:\n");
        library.booksPrint();

        System.out.println("Сортировка книг по Автору:\n");
        library.books.sort(new AuthorComparator());
        library.booksPrint();

        System.out.println("ортировка книг по Названию:\n");
        library.books.sort(new TitleComparator());
        library.booksPrint();

        System.out.println("Вортировка книг Году издания:\n");
        library.books.sort(new PublichedYearComarator());
        library.booksPrint();
    }
}
