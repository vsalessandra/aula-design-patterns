public class Main {

    public static void main(String[] args) {

        NotificationService emailService = new EmailNotificationService();
        emailService.sendNotification("Your order has been shipped!");

        System.out.println();

        NotificationService smsService = new SmsNotificationService();
        smsService.sendNotification("Your package will arrive today.");

        System.out.println();

        NotificationService pushService = new PushNotificationService();
        pushService.sendNotification("You have a new message.");
    }

}