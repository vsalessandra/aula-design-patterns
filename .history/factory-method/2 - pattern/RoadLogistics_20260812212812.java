public class RoadLogistics extends EmailNotification {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}