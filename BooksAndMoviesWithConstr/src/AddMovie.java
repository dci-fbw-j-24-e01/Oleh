import java.util.Scanner;

public class AddMovie {
    static Scanner scanner = new Scanner(System.in);
    public AddMovie(){

        Movie m1 = new Movie("Matrix", MovieGenre.ACTION, 10);
        Movie m2 = new Movie("One Flew Over the Cuckoo's Nest", MovieGenre.DRAMA, 10000);
        Movie m3 = new Movie("Mr. Bean", MovieGenre.COMEDY, 1000);
        Movie m4 = new Movie("300", MovieGenre.DOCUMENTARY, 21);
        Movie m5 = new Movie("The Prestige", MovieGenre.DETECTIVE, 150, "Christopher Nolan");

//        System.out.println("We also have a list of movies directed by Christopher Nolan.");
//
//        int director = scanner.nextInt();
printMovieDetails(m1, m2, m3, m4);



    }
        public static void printMovieDetails (Movie m1,Movie m2,Movie m3,Movie m4){
            int choice= scanner.nextInt();
            if (choice== 1 ){
                System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $ \n", m1.getTitle(), m1.getGenre(), m1.getPrice());
            }
            if (choice== 2 ){
                System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $ \n", m2.getTitle(), m2.getGenre(), m2.getPrice());
            }
            if (choice== 3 ){
                System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $ \n", m3.getTitle(), m3.getGenre(), m3.getPrice());
            }
            if (choice== 4 ){
                System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $ \n", m4.getTitle(), m4.getGenre(), m4.getPrice());
            }
        }
}
