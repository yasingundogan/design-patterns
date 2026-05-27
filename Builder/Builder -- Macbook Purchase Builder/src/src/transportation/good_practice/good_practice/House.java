package transportation.good_practice.good_practice;

public class House {
    private int walls;
    private boolean hasGarage;
    private boolean hasGarden;
    private int windows;
    private String roofType;

    private House() {

    }

    public static class Builder
    {
        private int walls;
        private boolean hasGarage;
        private boolean hasGarden;
        private int windows;
        private String roofType;
    }



    public Builder setWalls(int walls) {
        this.walls = walls;
        return this;
    }


    public  Builder setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }


    public Builder setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    public Builder setWindows(int windows) {
        this.windows = windows;
        return this;
    }

    public Builder setRoofType(String roofType) {
        this.roofType = roofType;
        return this;
    }

    public House build() {}


}
