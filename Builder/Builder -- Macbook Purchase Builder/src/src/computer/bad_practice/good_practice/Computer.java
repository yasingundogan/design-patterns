package computer.bad_code.good_practice;

public class Computer {

    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private boolean hasBluetooth;
    private boolean hasWifi;



    // STEP - 1  AMAÇ: dışarıdan direkt oluşturmayı engellemek
    Computer() {

    }

    // Object creation kontrolü bizde.
    // Her kafasına göre new lemeyecek


    // STEP 2 - Ana class ın içine bir stane STATİC BUİLDER method ekle.
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String GPU;
        private boolean hasBluetooth;
        private boolean hasWifi;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setHasBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Builder setHasWifi(boolean hasWifi) {
            this.hasWifi = hasWifi;
            return this;
        }


        // STEP 5
        public Computer build() {
            Computer c = new Computer();

            c.CPU = this.CPU;
            c.GPU = this.GPU;
            c.RAM = this.RAM;
            c.storage = this.storage;
            c.hasBluetooth = this.hasBluetooth;
            c.hasWifi = this.hasWifi;

            return c;
        }


    }
    }




