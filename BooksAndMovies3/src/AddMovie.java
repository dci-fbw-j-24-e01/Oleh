import java.util.Scanner;

public class AddMovie {
    public AddMovie(){
        Scanner scanner = new Scanner(System.in);
        Movie m1 = new Movie();
        m1.setTitle("Matrix");
        m1.setGenre(MovieGenre.ACTION);
        m1.setPrice(10);

        Movie m2 = new Movie();
        m2.setTitle("One Flew Over the Cuckoo's Nest");
        m2.setGenre(MovieGenre.DRAMA);
        m2.setPrice(10000);

        Movie m3 = new Movie();
        m3.setTitle("Mr. Bean");
        m3.setGenre(MovieGenre.COMEDY);
        m3.setPrice(1000);

        Movie m4 = new Movie();
        m4.setTitle("300");
        m4.setGenre(MovieGenre.DOCUMENTARY);
        m4.setPrice(2);

        int z = scanner.nextInt();

        if (z == 1 ){
            System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $ \n", m1.getTitle(), m1.getGenre(), m1.getPrice());
        }
        if (z == 2 ){
            System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $ \n", m2.getTitle(), m2.getGenre(), m2.getPrice());
        }
        if (z == 3 ){
            System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $ \n", m3.getTitle(), m3.getGenre(), m3.getPrice());
        }
        if (z == 4 ){
            System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $ \n", m4.getTitle(), m4.getGenre(), m4.getPrice());
        }

    }

}
