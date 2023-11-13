package n2exercici1;

import n2exercici1.interfaces.Address;
import n2exercici1.interfaces.PhoneNumber;

public class PhonebookEntry {
    private String name;
    private Address address;
    private PhoneNumber phone;

    public PhonebookEntry(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Address getAddress() {
        return address;
    }
    public void setPhoneNumber(PhoneNumber phone) {
        this.phone = phone;
    }
    public PhoneNumber getPhoneNumber() {
        return phone;
    }

}
