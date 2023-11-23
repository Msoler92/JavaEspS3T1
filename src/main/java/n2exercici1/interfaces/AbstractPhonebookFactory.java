package n2exercici1.interfaces;

public interface AbstractPhonebookFactory {
    PhoneNumber getPhoneNumber(String location);
    Address getAddress(String location);
}
