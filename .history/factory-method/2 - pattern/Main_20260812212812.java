public class Main {

    public static void main(String[] args) {

        EmailNotification roadLogistics = new RoadLogistics();
        roadLogistics.planDelivery();

        System.out.println();

        EmailNotification seaLogistics = new SeaLogistics();
        seaLogistics.planDelivery();
    }
}