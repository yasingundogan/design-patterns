public class BusStrategy implements RouteStrategy {

    @Override
    public double calculateTime(double distance) {

        double busSpeed = 40.0;

        return (distance / busSpeed) * 60;
    }
}