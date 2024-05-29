import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setTitle("Starship Troopers");
        b1.setAuthor("Robert A. Heinlein");
        b1.setPrice(10);

        Book b2 = new Book();
        b2.setTitle("Stranger in a Strange Land");
        b2.setAuthor("Robert A. Heinlein");
        b2.setPrice(20);

        Book b3 = new Book();
        b3.setTitle("The Hobbit");
        b3.setAuthor("J. R. R. Tolkien");
        b3.setPrice(10);

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

        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to see? Books or movies?");
        System.out.println("Press 1 to go to Books or 2 to go to Movies. ");
        int x = scanner.nextInt();
        if (x == 1) {
            System.out.println("What kind of book are you interested in?");
            System.out.println("#1 - Starship Troopers, #2 - Stranger in a Strange Land, #3 - The Hobbit");
            int z = scanner.nextInt();
            if (z == 1 ){
                System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $ \n", b1.getTitle(), b1.getAuthor(), b1.getPrice());
            }
            if (z == 2 ){
                System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $ \n", b2.getTitle(), b2.getAuthor(), b2.getPrice());
            }
            if (z == 3 ){
                System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $ \n", b3.getTitle(), b3.getAuthor(), b3.getPrice());
            }

        }
        if (x == 2){
            System.out.println("What kind of movie are you interested in?");
            System.out.println("#1 - Matrix, #2 - One Flew Over the Cuckoo's Nest, #3 - Mr. Bean, #4 - 300");
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




}