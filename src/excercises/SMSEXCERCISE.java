package excercises;

public class SMSEXCERCISE {
    public static void main(String[] args) {
        String message = "Sender [Rasim Cagirici] Phone number <(917)755-3314> Message {What's popping man}";
        System.out.println("Sender: " + message.substring(message.indexOf("[")+1,message.indexOf("]")) +
                           "\nPhone Number: " + message.substring(message.indexOf("<")+1, message.indexOf(">")) +
                           "\nMessage: " + message.substring(message.indexOf("{")+1,message.indexOf("}")));

    }
}
