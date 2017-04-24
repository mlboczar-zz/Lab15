/**
 * Created by Megan on 4/24/2017.
 */
public class CountryName {
    private String name;

    //Standard String class with Constructor, getter, setter, override
    public CountryName(String name) {
        this.name = name;
    }
    public void countryName() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
