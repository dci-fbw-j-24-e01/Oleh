import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex2 {
    public static void main(String[] args) throws IOException {

        Path start = Paths.get("/home/bryl/Стільниця");
        List<File> files = Files.list(start)
                .map(Path::toFile)
                .filter(File::isFile)
                .toList();


//        files.forEach(System.out::println);

//String direcrory = "/home/bryl/Стільниця";
        List<Path> pathList = new ArrayList<>();
        try (Stream<Path> pathStream = Files.walk(start)){
            pathList = pathStream.map(Path::normalize)
                    .toList();

            pathList.forEach(System.out::println);

        }

    }
}
