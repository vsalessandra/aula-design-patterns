public class Notification {

    public void planDelivery(Transport transport) {

        System.out.println("Planejando entrega...");

        transport.deliver();
    }

}

public class EmailNotification {

    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}