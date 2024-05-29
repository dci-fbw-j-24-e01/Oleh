import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("ASDS5-SSD-10558", "Starship Troopers", "Robert A. Heinlein", BookGenre.FANTASY));
        books.add(new Book("A34DS-021-F4141", "Stranger in a Strange Land", "Robert A. Heinlein", BookGenre.DRAMA));
        books.add(new Book("RW05D-VC2-FS325", "The Hobbit", "J. R. R. Tolkien", BookGenre.FANTASY));
        books.add(new Book("SDF34-FD3-FDS34", "Beyond the Isle of the Lost", "Melissa de la Cruz", BookGenre.ACTION));
        books.add(new Book("EDS5F-VB3-34432", "John Adams", "David McCullough", BookGenre.DOCUMENTARY));
        books.add(new Book("CMG34-QW3-78684", "Your Blood, My Bones", "Kelly Andrew", BookGenre.DRAMA));
        books.add(new Book("QASX4-455-FSW38", "The Divine Comedy", "Dante Alighieri", BookGenre.COMEDY));
        books.add(new Book("RW5S4-VC2-FS325", "The Life We Bury", "Allen Eskens", BookGenre.DETECTIVE));

        List<String> alphabet = books.stream()
                .sorted((o1, o2) -> o1.title().compareTo(o2.title()))
                .map(o1 -> o1.title().toUpperCase())

                .toList();

        alphabet.forEach(System.out::println);
        System.out.println(alphabet);
    }
}