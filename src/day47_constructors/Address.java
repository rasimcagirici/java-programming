package day47_constructors;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country = "USA";

    public Address() {
        System.out.println("Address constructor");
        street = "123 unknown st";
        city = "unknown";
        state = "unknown";
        zipCode = "00000";
    }

    public Address(String street, String city, String state, String zipCode) {
        //this.street = street;
        setStreet(street);
        //this.city = city;
        setCity(city);
        //this.state = state;
        setState(state);
        //this.zipCode = zipCode;
        setZipCode(zipCode);
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }
}


