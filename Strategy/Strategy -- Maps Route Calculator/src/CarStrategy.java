public class CarStrategy implements RouteStrategy {

    @Override
    public double calculateTime(double distance) {

        double carSpeed = 80.0;

        return (distance / carSpeed) * 60;
    }

}