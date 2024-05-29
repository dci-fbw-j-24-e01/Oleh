import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

public class Ex1 {


    public static void main(String[] args) throws IOException {

        PrintWriter printWriter = new PrintWriter("example.txt").printf(String.valueOf(Locale.GERMANY));

        printWriter.println();
        printWriter.println("Hello");
        printWriter.println("I have");
        printWriter.println(22);
        printWriter.println("Euro!!!");

        printWriter.close();


        List<String> message = List.of("Hello", "I have", "22", "Euro!!!");
        String stringOutPut = String.join("\n", message);
        Files.writeString(Path.of("example2.txt"), stringOutPut);


    }
}