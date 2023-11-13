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

        //Simple demo phonebook
        ArrayList<Object> phonebook = new ArrayList<>();

        address = addressFactory.getAddress("Spain");
        address.setAddress("Calle Lasuya", "1", "08032", "Barcelona");
        phonebook.add(address);

        phone = phoneFactory.getPhoneNumber("United Kingdom");

    }


}
