package n2exercici1;

import n2exercici1.interfaces.AbstractPhonebookFactory;
import n2exercici1.factories.FactoryProducer;
import n2exercici1.interfaces.Address;
import n2exercici1.interfaces.PhoneNumber;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AbstractPhonebookFactory addressFactory = FactoryProducer.getFactory("address");
        AbstractPhonebookFactory phoneFactory = FactoryProducer.getFactory("phone");
        Address address;
        PhoneNumber phone;

        //Simple demo phonebook without dedicated class
        ArrayList<PhoneNumber> phones = new ArrayList<>();
        ArrayList<Address> addresses = new ArrayList<>();

        address = addressFactory.getAddress("Spain");
        address.setAddress("Calle Lasuya", "1", "08032", "Barcelona");
        addresses.add(address);

        phone = phoneFactory.getPhoneNumber("United Kingdom");
        phone.setPhoneNumber("3333-4444");
        phones.add(phone);

        System.out.println(addresses.get(0).getAddress());
        System.out.println(phones.get(0).getPhoneNumber());

    }


}
