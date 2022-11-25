class BuildingBlueprint {
    int stories;
    int apartments;
    float occupancy;
    boolean full = false;
    BuildingBlueprint() {
        stories = 10;
        apartments = 20;
        occupancy = (float)(1.0);
        full = true;
    }
    BuildingBlueprint(int st, int ap, float occ) {
        stories = st;
        apartments = ap;
        occupancy = occ;
        if (occupancy == 1.0) {
            full = true;
        }
    }
    float occupancyGetter() {
        return occupancy;
    }
    void occupancySetter(float occ) {
        occupancy = occ;
        if (occupancy == 1.0) {
            full = true;
        }
        if (occupancy < 1.0) {
            full = false;
        }
    }
    int storiesGetter() {
        return stories;
    }
    int apartmentsGetter() {
        return apartments;
    }
    boolean isFull() {
        return full;
    }

}
public class Lab13A {
    public static void main(String[] args) {
        BuildingBlueprint buildingOne = new BuildingBlueprint();
        BuildingBlueprint buildingTwo = new BuildingBlueprint(30, 30, (float)(0.75));

        System.out.println("Year 2020:");
        System.out.println("Building 1 has " + buildingOne.storiesGetter() + " floors, " + ((int)(buildingOne.apartmentsGetter())) + " apartments, and is " + String.format("%.0f", (buildingOne.occupancyGetter() * 100)) + "% occupied. Full? " + buildingOne.isFull());
        System.out.println("Building 2 has " + buildingTwo.storiesGetter() + " floors, " + ((int)(buildingTwo.apartmentsGetter())) + " apartments, and is " + String.format("%.0f", (buildingTwo.occupancyGetter() * 100)) + "% occupied. Full? " + buildingTwo.isFull());
        System.out.println("\nMany years pass.\n");
        buildingOne.occupancySetter((float)(0.0));
        buildingTwo.occupancySetter((float)(1.0));
        System.out.println("Year 2043:");
        System.out.println("Building 1 has " + buildingOne.storiesGetter() + " floors, " + ((int)(buildingOne.apartmentsGetter()) + " apartments, and is " + String.format("%.0f", (buildingOne.occupancyGetter() * 100)) + "% occupied. Full? " + buildingOne.isFull()));
        System.out.println("Building 2 has " + buildingTwo.storiesGetter() + " floors, " + ((int)(buildingTwo.apartmentsGetter()) + " apartments, and is " + String.format("%.0f", (buildingTwo.occupancyGetter() * 100)) + "% occupied. Full? " + buildingTwo.isFull()));
        System.out.println("\nLooks like people prefer taller buildings.");
    }
}
