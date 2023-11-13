package n2exercici1.classes;

import n2exercici1.interfaces.Address;

public class AddressUK implements Address {
    final String COUNTRY;
    String street;
    String num;
    String postCode;
    String city;

    public AddressUK() {
        COUNTRY = "United Kingdom";
    }

    @Override
    public void setAddress (String street, String num, String postCode, String city) {
        this.street = street;
        this.num = num;
        this.postCode = postCode;
        this.city = city;
    }
    @Override
    public String getAddress() {
        return num + " " + street + ", " + postCode + " " + city + ", " + COUNTRY;
    }
}
