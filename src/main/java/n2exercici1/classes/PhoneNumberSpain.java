package n2exercici1.classes;

import n2exercici1.interfaces.PhoneNumber;

public class PhoneNumberSpain implements PhoneNumber {
    final String INTERNATIONAL;
    String body;

    public PhoneNumberSpain() {
        INTERNATIONAL = "+34";
    }

    @Override
    public void setPhoneNumber(String body) {
        this.body = body;
    }
    @Override
    public String getPhoneNumber() {
        return INTERNATIONAL+body;
    }

}
