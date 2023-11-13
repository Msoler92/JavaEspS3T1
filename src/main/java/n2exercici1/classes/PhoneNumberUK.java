package n2exercici1.classes;

import n2exercici1.interfaces.PhoneNumber;

public class PhoneNumberUK implements PhoneNumber {
    final String INTERNATIONAL;
    String body;

    public PhoneNumberUK() {
        INTERNATIONAL = "+44";
    }

    @Override
    public void setPhoneNumber(String body) {
        this.body = body;
    }
    @Override
    public String getPhoneNumber() {
        return INTERNATIONAL+ " " + body;
    }

}
