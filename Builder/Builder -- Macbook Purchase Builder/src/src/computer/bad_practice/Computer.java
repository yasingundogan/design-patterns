package computer.bad_code;

public class Computer {

    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private boolean hasBluetooth;
    private boolean hasWifi;



    // Devasa bir constructor --> anti-pattern
    public Computer(String CPU,
                    String RAM,
                    String storage,
                    String GPU,
                    boolean hasBluetooth,
                    boolean hasWifi) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.storage = storage;
        this.GPU = GPU;
        this.hasBluetooth = false;
        this.hasWifi = false;
    }

    //Boş null pointerların yerini doldurmak yerine, O zaman alternatif constructorlar yazsam ?  ---> Constructor patlasması... ÖLÇEKLENEMEZ
    /*
    public badcode.computer.bad_code.good_practice.Computer(String CPU, String RAM) { ... }
public badcode.computer.bad_code.good_practice.Computer(String CPU, String RAM, String storage) { ... }
public badcode.computer.bad_code.good_practice.Computer(String CPU, String RAM, String storage, String GPU) { ... }
     */




    }


