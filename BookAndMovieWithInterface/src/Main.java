import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        List<Product> myProduct = new ArrayList<>();
//        myProduct.add(new Book(1001, 10, "Starship Troopers", "Robert A. Heinlein"));
//        myProduct.add(new Book(1002, 20, "Stranger in a Strange Land", "Robert A. Heinlein"));
//        myProduct.add(new Book(1003, 15, "The Hobbit", "J. R. R. Tolkien"));
//        myProduct.add(new ChildrensBook(2004, 25, "Harry Potter", "J. K. Rowling", "from 4 years"));
//        myProduct.add(new ChildrensBook(2005, 25, "Потный Гарри", "NOT J. K. Rowling", "NEVER!!!"));
//        myProduct.add(new Movie(3001, 10, "Matrix", MovieGenre.ACTION));
//        myProduct.add(new Movie(3002, 10000, "One Flew Over the Cuckoo's Nest", MovieGenre.DRAMA));
//        myProduct.add(new Movie(3003, 1000, "Mr. Bean", MovieGenre.COMEDY));
//        myProduct.add(new Movie(3004, 21, "300", MovieGenre.DOCUMENTARY));
//        myProduct.add(new MovieWithDirector(2005, 150, "The Prestige", MovieGenre.DETECTIVE, "Christopher Nolan"));

//
        Movie Dune_Part_Two = new Movie();
        Movie Homo_Erectus = new Movie();
        Movie Intouchables = new Movie();
        Movie Hancock = new Movie();

//        List<String> movies = new ArrayList<>();
            List<Movie> movies = new ArrayList<>();


//        movies.add("Dune_Part_Two");
//        movies.add("Homo_Erectus");
//        movies.add("Intouchables");
//        movies.add("Hancock");
//        movies.add(Dune_Part_Two);
//        movies.add(Homo_Erectus);
//        movies.add(Intouchables);
//        movies.add(Hancock);
        movies.add(new Movie(3001, 10, "Matrix", MovieGenre.ACTION));
        movies.add(new Movie(3002, 10000, "One Flew Over the Cuckoo's Nest", MovieGenre.DRAMA));
        movies.add(new Movie(3003, 1000, "Mr. Bean", MovieGenre.COMEDY));
        movies.add(new Movie(3004, 21, "300", MovieGenre.DOCUMENTARY));
        System.out.println(movies);

        Collections.sort(movies);

        System.out.println(movies);


//        System.out.println(movies);
//        for (Product product : myProduct) {
//
//            product.printDetails();
//
//        }
        System.out.println("¯\\_(ツ)_/¯");
//        printMovies(movies);

    }

//    public static void printMovies(List movie) {
//
//
//
//        for (int i = 0; i < movie.size(); i++) {
//            System.out.println(movie.get(i));
//            System.out.println(movie.get(i).hashCode());
//
//
//        }
//    }


}