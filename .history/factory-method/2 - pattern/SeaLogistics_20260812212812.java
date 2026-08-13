public class SeaLogistics extends EmailNotification {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}