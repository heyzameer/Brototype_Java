package Design_Pattern.Singleton;

public class VillageWell {
    private static VillageWell instance;
    private VillageWell() {
        System.out.println("A new well has been dug!");
    }
    public static VillageWell getInstance() {
        if (instance == null) {
            instance = new VillageWell();
        }
        return instance;
    }
    public void drawWater() {
        System.out.println("Drawing water from the village well.");
    }
}

