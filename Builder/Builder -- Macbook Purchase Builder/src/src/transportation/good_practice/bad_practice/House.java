package transportation.good_practice.bad_practice;

public  class House {
    private int walls;
    private boolean hasGarage;
    private boolean hasGarden;
    private int windows;
    private String roofType;


    // Enormous Constructor
    public House(int walls, boolean hasGarage, boolean hasGarden, int windows, String roofType) {
        this.walls = walls;
        this.hasGarage = hasGarage;
        this.hasGarden = hasGarden;
        this.windows = windows;
        this.roofType = roofType;
    }

    /* Telescoping Constructor Hell!
    public House(int walls) { ... }
    public House(int walls, boolean hasGarage) { ... }
    public House(int walls, boolean hasGarage, boolean hasSwimmingPool) { ... }


     */

}



