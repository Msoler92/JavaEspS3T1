package n2exercici1.classes;

import n2exercici1.interfaces.Address;

public class AddressSpain implements Address {
    private final String COUNTRY;
    private String street;
    private String num;
    private String postCode;
    private String city;

    public AddressSpain () {
        COUNTRY = "Spain";
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
        return street + " " + num + ", " + postCode + " " + city + ", " + COUNTRY;
    }

}
