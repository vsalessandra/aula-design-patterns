public class Main {

    public static void main(String[] args) {

        sendExample("Email", new EmailNotificationService(), "Your order has been shipped!");

        System.out.println();

        sendExample("SMS", new SmsNotificationService(), "Your package will arrive today.");

        System.out.println();

        sendExample("Push", new PushNotificationService(), "Voce tem uma nova mensagem.");
    }

    private static void sendExample(String label, NotificationService service, String message) {
        System.out.println(label + ":");
        service.sendNotification(message);
    }

}