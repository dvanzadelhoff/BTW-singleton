public class Country {

    private String name;
    private String countryCode;

    public Country (String name, String countryCode) {
        this.name = name;
        this.countryCode = countryCode;
    }

    public String getCountryCode () {
        return countryCode;
    }
}