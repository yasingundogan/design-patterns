public class Main {

    public static void main(String[] args) {

        Light light = new Light();

        Alarm alarm = new Alarm();

        DoorLock doorLock = new DoorLock();

        Camera camera = new Camera();

        SmartTV smartTV = new SmartTV();

        AirConditioner airConditioner =
                new AirConditioner();

        NotificationService notificationService =
                new NotificationService();

        MotionSensor sensor =
                new MotionSensor(
                        light,
                        alarm,
                        doorLock,
                        camera,
                        smartTV,
                        airConditioner,
                        notificationService
                );

        sensor.detectMotion();
    }
}