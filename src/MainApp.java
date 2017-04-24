
/**
 * Created by Megan on 4/24/2017.
 */
public class MainApp {

    public static void main(String[] args) {

        String fileString = "countries.txt";
        CountriesTextFile.createFile(fileString);
        while (CountriesApp.continueProgram());
    }
}
