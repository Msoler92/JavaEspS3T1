package n2exercici1.factories;

import n2exercici1.classes.PhoneNumberUK;
import n2exercici1.interfaces.AbstractPhonebookFactory;
import n2exercici1.interfaces.Address;
import n2exercici1.interfaces.PhoneNumber;
import n2exercici1.classes.PhoneNumberSpain;

public class PhoneNumberFactory implements AbstractPhonebookFactory {
    public PhoneNumber getPhoneNumber(String location) {
        return switch (location) {
            case "Spain" -> new PhoneNumberSpain();
            case "United Kingdom" -> new PhoneNumberUK();
            default -> null;
        };
    }

    public Address getAddress(String location) {
        return null;
    }
}
