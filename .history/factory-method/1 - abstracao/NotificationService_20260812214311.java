public abstract class NotificationService {

    public abstract Notification createNotification();

    public void sendNotification(String message) {
        System.out.println("Preparando non...");

        Notification notification = createNotification();
        notification.send(message);

        System.out.println("Notification sent.");
    }
}