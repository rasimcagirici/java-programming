package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [Rasim] From Number<(917)755-3314> Message:{Seni cok seviyorum, bu aksam fan fini fin fon yapalim mi?}";
        System.out.println("Sender: " + message.substring(message.indexOf("[")+1,message.indexOf("]")));
        System.out.println("Phone number: " + message.substring(message.indexOf("<")+1,message.indexOf(">")));
        System.out.println("Message: " + message.substring(message.indexOf("{")+1,message.indexOf("}")));
        String message1 = "Sender: [Nurseda] From Number <(201)695-4934> Message: {Sen KIMSIN SAPIKKKKK}";
        System.out.println("Sender: " + message1.substring(message1.indexOf("[")+1,message1.indexOf("]")));
        System.out.println("Phone number: " + message1.substring(message1.indexOf("<")+1,message1.indexOf(">")));
        System.out.println("Message: " + message1.substring(message1.indexOf("{")+1,message1.indexOf("}")));
        String message2 = "Sender: [Rasim] From Number <(917)755-3314> Message: {Ya benim olacaksin, Ya KARA TOPRAGIN}";
        System.out.println("Sender: " + message2.substring(message2.indexOf("[")+1,message2.indexOf("]")));
        System.out.println("Phone number: " + message2.substring(message2.indexOf("<")+1,message2.indexOf(">")));
        System.out.println("Message: " + message2.substring(message2.indexOf("{")+1,message2.indexOf("}")));
        String message3 = "Sender: [Nurseda] From Number <(201)695-4934> Message: {POLISI ARAYACAM!!!!!!}";
        System.out.println("Sender: " + message3.substring(message3.indexOf("[")+1,message3.indexOf("]")));
        System.out.println("Phone number: " + message3.substring(message3.indexOf("<")+1,message3.indexOf(">")));
        System.out.println("Message: " + message3.substring(message3.indexOf("{")+1,message3.indexOf("}")));
        String message4 = "Sender: [Rasim] From Number<(917)755-3314> Message:{Beni asla korkutamazsin}";
        System.out.println("Sender: " + message4.substring(message4.indexOf("[")+1,message4.indexOf("]")));
        System.out.println("Phone number: " + message4.substring(message4.indexOf("<")+1,message4.indexOf(">")));
        System.out.println("Message: " + message4.substring(message4.indexOf("{")+1,message4.indexOf("}")));
        String message5 = "Sender: [Nurseda] From Number <(201)695-4934> Message: {Peki Peki bulusalim yakisikli cocuk}";
        System.out.println("Sender: " + message5.substring(message5.indexOf("[")+1,message5.indexOf("]")));
        System.out.println("Phone number: " + message5.substring(message5.indexOf("<")+1,message5.indexOf(">")));
        System.out.println("Message: " + message5.substring(message5.indexOf("{")+1,message5.indexOf("}")));
        String message6 = "Sender: [Rasim] From Number<(917)755-3314> Message:{Sana UNUTAMAYACAGIN BIR GECE YASATACAGIM HANIM EFENDI}";
        System.out.println("Sender: " + message6.substring(message6.indexOf("[")+1,message6.indexOf("]")));
        System.out.println("Phone number: " + message6.substring(message6.indexOf("<")+1,message6.indexOf(">")));
        System.out.println("Message: " + message6.substring(message6.indexOf("{")+1,message6.indexOf("}")));

        String word1 = " Hello ";
        System.out.println(word1);
        System.out.println(word1.trim());



    }
}
