import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IncorrectProductIdException {


        try {
            Movie Dune_Part_Two = new Movie(3001, 10, "Matrix", MovieGenre.ACTION);
        } catch (IllegalArgumentException e) {
            System.out.println("");
            System.out.println();
        }
        System.out.println("sdsd");

        try {
            Book b1 = new Book(-1002, 10000, "One Flew Over the Cuckoo's Nest", "Someone");
        } catch (IncorrectProductIdException e) {
            throw new RuntimeException(e);
        }
//        System.out.println(movies);
//
//        Collections.sort(movies);

//        try {
//            idMoiveExeptionMethod();
//        } catch (IllegalArgumentException e) {
//            throw new RuntimeException(e);
//        }
//
//        try {
//            idBookExeptionMethod();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//
//    }
//
//    public static void idMoiveExeptionMethod() throws IllegalArgumentException {
//        Movie Dune_Part_Two = new Movie();
//        Movie Homo_Erectus = new Movie();
//        Movie Intouchables = new Movie();
//        Movie Hancock = new Movie();
//        List<Movie> movies = new ArrayList<>();
//        movies.add(new Movie(-3001, 10, "Matrix", MovieGenre.ACTION));
//        movies.add(new Movie(3002, 10000, "One Flew Over the Cuckoo's Nest", MovieGenre.DRAMA));
//        movies.add(new Movie(3003, 1000, "Mr. Bean", MovieGenre.COMEDY));
//        movies.add(new Movie(3004, 21, "300", MovieGenre.DOCUMENTARY));
//        System.out.println(movies);
//    }
//
//    public static void idBookExeptionMethod() throws Exception {
//        Book b1 = new Book();
//        Book b2= new Book();
//        Book b3 = new Book();
//        Book b4 = new Book();
//        List<Book> books = new ArrayList<>();
//        books.add(new Book(-1001, 10, "Matrix", "Terminator"));
//        books.add(new Book(1002, 10000, "One Flew Over the Cuckoo's Nest", "Someone"));
//        books.add(new Book(1003, 1000, "Mr. Bean", "COMEDY"));
//        System.out.println(books);
//    }
    }
}