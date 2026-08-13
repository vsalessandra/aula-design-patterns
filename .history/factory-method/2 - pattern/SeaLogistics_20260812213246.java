public class SeaLogistics extends Notification {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}