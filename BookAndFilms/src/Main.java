public class Main {
    public static void main(String[] args) {
        System.out.println("----Books-----");
     printBookDetails();
        System.out.println("-----Movies-----");
     printMovieDetails();


    }
    public static void printBookDetails(){
        Book b1 = new Book();
        b1.title = "Starship Troopers";
        b1.author = "Robert A. Heinlein";
        b1.price = 10;
        Book b2 = new Book();
        b2.title = "Stranger in a Strange Land";
        b2.author = "Robert A. Heinlein";
        b2.price = 20;
        Book b3 = new Book();
        b3.title = "The Hobbit";
        b3.author = "J. R. R. Tolkien";
        b3.price = 15;

        Book[] books = {
                b1,
                b2,
                b3
        };
        for (int i = 0; i < books.length; i++) {
            System.out.println("Title - " + books[i].title + ", Author - " + books[i].author + ", price: " + books[i].price + "$");
        }

    }
    public static void printMovieDetails(){
        Film m1 = new Film();
        m1.title = "Matrix";
        m1.genre = MovieGenre.ACTION;
        m1.price = 10;

        Film m2 = new Film();
        m2.title = "One Flew Over the Cuckoo's Nest";
        m2.genre = MovieGenre.DRAMA;
        m2.price = 10000;

        Film m3 = new Film();
        m3.title = "Mr. Bean";
        m3.genre = MovieGenre.COMEDY;
        m3.price = 1000;
        Film[] movie = {
                m1,
                m2,
                m3
        };
        for (Film i: movie){
            System.out.println("Title - " + i.title + ", Genre - " + i.genre + ", price: " + i.price + "$");
        }
    }

}