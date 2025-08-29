package InterfaceOOP.serviceInterface.Impl;

public interface Notification {
    public String sendEmail(String subject, String to, String from, String message);
    public String sendOTP_Phone(String to , String message);

    //they may ask go and implement inApp_Notification
    //what you will do it come to your interface and create a method
    public String inApp_Notification();
}
