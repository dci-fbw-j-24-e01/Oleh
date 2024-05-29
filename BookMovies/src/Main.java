import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Book book = new Book();
      book.title = "LOTR";
      book.author = "J .R. R. Tolkien";
      book.price = 10;

      Book book1 = new Book();
      book1.title = "Stranger in a Strange Land ";
      book1.author = "Robert A. Heinlein";
      book1.price = 20;

      printBookDetails(book);
    }

    public static void printBookDetails(Book book){
        System.out.println("Titel: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Price: " + book.price + "$");
    }
}