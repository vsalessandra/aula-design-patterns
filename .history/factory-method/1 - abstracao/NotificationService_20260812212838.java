public class NotificationService {

    public void sendNotification(String message) {
        EmailNotification notification = new EmailNotification();
        notification.send(message);
    }
}