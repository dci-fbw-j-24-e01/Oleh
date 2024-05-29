import java.util.Scanner;

public class AddBook {
    public AddBook(){
        Scanner scanner = new Scanner(System.in);
        Book b1 = new Book("Starship Troopers", "Robert A. Heinlein", 10);
        Book b2 = new Book("Stranger in a Strange Land", "Robert A. Heinlein", 20);
        Book b3 = new Book("The Hobbit", "J. R. R. Tolkien", 10);

        int choice= scanner.nextInt();

        if (choice== 1 ){
            System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $ \n", b1.getTitle(), b1.getAuthor(), b1.getPrice());
        }
        if (choice== 2 ){
            System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $ \n", b2.getTitle(), b2.getAuthor(), b2.getPrice());
        }
        if (choice== 3 ){
            System.out.printf("Titel: %s\nAuthor: %s\nPrice: %d $ \n", b3.getTitle(), b3.getAuthor(), b3.getPrice());
        }

    }

}
