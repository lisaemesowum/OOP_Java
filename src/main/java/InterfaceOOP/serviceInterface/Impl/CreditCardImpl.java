package InterfaceOOP.serviceInterface.impl;

import InterfaceOOP.serviceInterface.Payment;

public class CreditCardImpl implements Payment , Notification {

    @Override
    public void pay(long amount) {
        System.out.println("The amount you paid bt card is" + amount);
    }

    @Override
    public void refund(long amount) {
        System.out.println("The refund process for this amount =N=" + amount);
    }

    @Override
    public String sendEmail(String subject, String to, String from, String message) {
        return "";
    }

    @Override
    public String sendOTP_Phone(String to, String message) {
        return "";
    }

    @Override
    public String inApp_Notification() {
        return "";
    }

    //this an interface
}