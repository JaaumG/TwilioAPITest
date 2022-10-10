import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

import java.util.Scanner;

public class Main {
    // Find your Account Sid and Token at twilio.com/console
    public static final String ACCOUNT_SID = "acount_sid";
    public static final String AUTH_TOKEN = "token";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua mensagem para enviar o SMS");
        String mensagem = sc.nextLine();
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("TO"),new com.twilio.type.PhoneNumber("FROM"),
                        mensagem)
                .create();
        sc.close();
        System.out.println(message.getSid());
    }
}