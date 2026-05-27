public class WalkStrategy implements RouteStrategy {


    // WalkStrategy Algorithm , notice that walking speed will be diffrent in each concrete strategy classes.
    // It means algorithm are different.

    @Override
    public double calculateTime(double distance) {
        double walkingSpeed = 5.0;

        return (distance / walkingSpeed) *60 ;

    }


}
