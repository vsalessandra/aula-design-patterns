public class Notification {

    public void planDelivery(Transport transport) {

        System.out.println("Planejando entrega...");

        transport.deliver();
    }

}