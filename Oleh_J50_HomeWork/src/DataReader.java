import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class DataReader {

    public static ArrayList<Customer> readData(String fileName) {
        ArrayList<Customer> dataList = new ArrayList<Customer>();
        File dataFile = new File(fileName);
        try (Scanner scanner = new Scanner(dataFile)) {
            ArrayList<String> list = new ArrayList<>();
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
            for (int i = 1; i < list.size(); i++) {
                Customer model = getCustomer(list, i);
                dataList.add(model);
            }

        } catch (FileNotFoundException error) {
            handleError(error);
        }
        return dataList;
    }

    private static Customer getCustomer(ArrayList<String> list, int i) {
        String line = list.get(i);
        String [] data = line.split(",(?!\\s)");
        int index = Integer.parseInt(data[0]);
        String customerId = data[1];
        String firstName = data[2];
        String lastName = data[3];
        String company = data[4];
        String cityString = data[5];
        String country = data[6];
        String phone1 = data[7];
        String phone2 = data[8];
        String email =  data[9];
        LocalDate subscriptionDate = LocalDate.parse(data[10]);
        String website = data[11];

        return new Customer(index,
                customerId,
                firstName,
                lastName,
                company,
                cityString,
                country,
                phone1,
                phone2,
                email,
                subscriptionDate,
                website);
    }

    public static void handleError(Exception error) {

        System.out.println("The following error was caught:");
        System.out.println(error.getMessage());
    }
}