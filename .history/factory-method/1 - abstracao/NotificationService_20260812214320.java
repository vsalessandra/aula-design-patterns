public abstract class NotificationService {

    public abstract Notification createNotification();

    public void sendNotification(String message) {
        System.out.println("Preparando notificação...");

        Notification notification = createNotification();
        notification.send(message);

        System.out.println("Notificação enviada.");
    }
}