/* -----------------------------------------
Light class amacı : sadece ışığı yönetmek
başka hiçbir cihazı bilmez.
  -----------------------------------------*/
public class Light {

    // flag for light condition
    private boolean on;

    public void turnOn()
    {
        on = true;
        System.out.println("Light is on...");
    }



    public void turnOff()
    {
        on = false;
        System.out.println("Light is off...");
    }

    public boolean isOn()
    {
        return on;
    }



}
