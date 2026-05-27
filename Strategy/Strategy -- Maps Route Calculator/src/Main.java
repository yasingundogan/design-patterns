public class Main {

    public static void main(String[] args) {

        double distance = 20;

        NavigationApp app =
                new NavigationApp(new WalkStrategy());

        System.out.println("Walking Mode:");
        app.showRemainingTime(distance);

        app.setStrategy(new BusStrategy());

        System.out.println("\nBus Mode:");
        app.showRemainingTime(distance);

        app.setStrategy(new CarStrategy());

        System.out.println("\nCar Mode:");
        app.showRemainingTime(distance);
    }
}