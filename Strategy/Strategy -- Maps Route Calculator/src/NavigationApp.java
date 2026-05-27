public class NavigationApp {

    private RouteStrategy strategy;

    public NavigationApp(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void showRemainingTime(double distance) {

        double time = strategy.calculateTime(distance);

        System.out.println(
                "Remaining travel time: "
                        + Math.round(time)
                        + " minutes"
        );
    }
}