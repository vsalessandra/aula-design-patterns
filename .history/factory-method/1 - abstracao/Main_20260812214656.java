public class Main {

    public static void main(String[] args) {

        sendExample("Email", new NotificationService() {
            @Override
            public Notification createNotification() {
                return new EmailNotification();
            }
        }, "Your order has been shipped!");

        System.out.println();

        sendExample("SMS", new NotificationService() {
            @Override
            public Notification createNotification() {
                return new SmsNotification();
            }
        }, "Your package will arrive today.");

        System.out.println();

        sendExample("Push", new NotificationService() {
            @Override
            public Notification createNotification() {
                return new PushNotification();
            }
        }, "Voce tem uma nova mensagem.");
    }

    private static void sendExample(String label, NotificationService service, String message) {
        System.out.println(label + ":");
        service.sendNotification(message);
    }

}