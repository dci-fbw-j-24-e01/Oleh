import java.util.Scanner;

public class AddBook {
    public AddBook(){
        Scanner scanner = new Scanner(System.in);
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

}
