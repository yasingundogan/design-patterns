public class Alarm {

    private boolean active;

    public void activate()
    {
        active = true;
        System.out.println("Alarm ACTIVATED.");
    }

    public void deactivate()
    {
        active = false;
        System.out.println("Alarm DEACTIVATED.");
    }

    public boolean isActive()
    {
        return active;
    }


}
