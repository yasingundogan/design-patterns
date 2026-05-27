package computer.bad_code.good_practice;

public class Main {
    static void main() {
        Computer  hp = new Computer.Builder().
                setCPU("İ5").
                setGPU("4050")
                .setHasBluetooth(true).
                setRAM("16GB").
                setStorage("512").
                setHasWifi(true).
                build();
    }

    Computer mac = new Computer.Builder().
            setCPU("m5").
            setRAM("8gb").
            setStorage("512gb").
            setHasBluetooth(true).
            setHasWifi(true).build();


}
