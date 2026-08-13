public class RoadLogistics extends Notification {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}