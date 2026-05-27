public class MotionSensor {

    private Light light;
    private Alarm alarm;
    private DoorLock doorLock;
    private Camera camera;
    private SmartTV smartTV;
    private AirConditioner airConditioner;
    private NotificationService notificationService;

    public MotionSensor(
            Light light,
            Alarm alarm,
            DoorLock doorLock,
            Camera camera,
            SmartTV smartTV,
            AirConditioner airConditioner,
            NotificationService notificationService) {

        this.light = light;
        this.alarm = alarm;
        this.doorLock = doorLock;
        this.camera = camera;
        this.smartTV = smartTV;
        this.airConditioner = airConditioner;
        this.notificationService = notificationService;
    }

    public void detectMotion() {

        System.out.println("\nMotion detected!");

        light.turnOn();

        alarm.activate();

        doorLock.lock();

        camera.startRecording();

        smartTV.pause();

        airConditioner.enablePowerSavingMode();

        notificationService.sendAlert(
                "Motion detected inside the house!"
        );
    }
}