public class Main {

    public static void main(String[] args) {

        Notification roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        System.out.println();

        Notification seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();
    }
}