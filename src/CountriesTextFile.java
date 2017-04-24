import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

/**
 * Created by Megan on 4/24/2017.
 */
public class CountriesTextFile {
    //These methods are the same as we created in class in our demos

    //Create file - same as class example except putting in src folder instead of new folder
    public static void createFile(String fileString) {
        Path filePath = Paths.get(fileString);
        if (Files.notExists(filePath)) {
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                System.out.println("There was an error: " + e);
            }
        }
    }

    public static void writeToFile() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a country: ");
        String countryInput = scan.nextLine();
        CountryName countryName = new CountryName(countryInput);
        Path addCountryPath = Paths.get("countries.txt");
        File testFiles = addCountryPath.toFile();

        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(testFiles, true));
            out.println(countryName);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void readFromFile() {
        //Paths.get() can target a file or a folder
        Path filePath = Paths.get("countries.txt");
        File textFile = filePath.toFile();

        try {
            FileReader r = new FileReader(textFile);
            BufferedReader reader = new BufferedReader(r);
            try {
                String line = reader.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = reader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
