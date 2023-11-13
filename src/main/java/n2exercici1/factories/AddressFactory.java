package n2exercici1.factories;

import n2exercici1.classes.AddressSpain;
import n2exercici1.classes.AddressUK;
import n2exercici1.interfaces.AbstractPhonebookFactory;
import n2exercici1.interfaces.Address;
import n2exercici1.interfaces.PhoneNumber;

public class AddressFactory implements AbstractPhonebookFactory {
    public Address getAddress(String location) {
        return switch (location) {
            case "Spain" -> new AddressSpain();
            case "United Kingdom" -> new AddressUK();
            default -> null;
        };
    }

    public PhoneNumber getPhoneNumber(String location) {
        return null;
    }
}
