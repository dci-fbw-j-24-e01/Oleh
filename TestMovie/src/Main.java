import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Book> myBooks = new ArrayList<>();
        myBooks.add(new Book("Lord of the Rings", "J. R. R. Tolkien", 10));
        myBooks.add(new Book("Hitchhiker's Guide to the Galaxy", "Douglas Adams", 5));
        myBooks.add(new Book("Harry Potter", "J. K. Rowling", 10));

        for (int i = 0; i < myBooks.size(); i++) {
            myBooks.get(i).printBookDetails();
        }
//        for (Book myBook : myBooks) {
//            myBook.printBookDetails();
//        }

//        List<Movie> myMovies = List.of(
//                new Movie("The Matrix", MovieGenre.ACTION, 10),
//                new Movie("The Barbie Movie", MovieGenre.COMEDY, 15),
//                new Movie("Mr. Bean the movie", MovieGenre.COMEDY, Integer.MAX_VALUE),
//                new Movie("One flew over the cuckoo's nest", MovieGenre.DRAMA, 10, "Milos Forman"),
//                new Movie("The Prestige", MovieGenre.DRAMA, 10, "Christopher Nolan")
//                );
        List<Movie> myMovies = new ArrayList<>();
        myMovies.add(new Movie("The Matrix", MovieGenre.ACTION, 10, 1000));
        myMovies.add(new Movie("The Barbie Movie", MovieGenre.COMEDY, 15, 10001));
        myMovies.add(new Movie("Mr. Bean the movie", MovieGenre.COMEDY, Integer.MAX_VALUE, 10002));
        myMovies.add(new Movie("One flew over the cuckoo's nest", MovieGenre.DRAMA, 10, "Milos Forman", 10003));
        myMovies.add(new Movie("The Prestige", MovieGenre.DRAMA, 10, "Christopher Nolan", 10004));

        for (Movie movie : myMovies) {
            movie.printMovieDetails();
        }



    }

    public static Movie finfById(long productId, List<Movie> movies){
        for ( Movie movie : movies){
            if (productId == movie.getProductId()){
                return movie;
            }
        }
        return null;
    }

}