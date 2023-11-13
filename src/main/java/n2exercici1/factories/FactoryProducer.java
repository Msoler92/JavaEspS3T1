package n2exercici1.factories;

import n2exercici1.interfaces.AbstractPhonebookFactory;

public class FactoryProducer {
    public static AbstractPhonebookFactory getFactory(String type) {
        return switch (type) {
            case "address" -> new AddressFactory();
            case "phone" -> new PhoneNumberFactory();
            default -> null;
        };
    }
}
