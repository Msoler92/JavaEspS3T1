package n2exercici1.interfaces;

import n2exercici1.interfaces.Address;
import n2exercici1.interfaces.PhoneNumber;

public interface AbstractPhonebookFactory {
    PhoneNumber getPhoneNumber(String location);
    Address getAddress(String location);
}
