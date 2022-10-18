class BuildingBlueprint {
    private int floors = 0;
    private int apartments = 0;
    private float occupancy = 0;
    private boolean fullOccupancy = false;

    public void defaultBuilding() {
        floors = 10;
        apartments = 20;
        occupancy = 1;
        fullOccupancy = true;
    }

    public void overloadConstructor(int newFloors, int newApartments, float newOccupancy) {
        floors = newFloors;
        apartments = newApartments;
        occupancy = newOccupancy;
        if (occupancy == 1.0) {
            fullOccupancy = true;
        }
    }

    public int getFloors() {

        return floors;
    }

    public int getApartments() {

        return apartments;
    }

    public float getOccupancy() {
        return occupancy;
    }

    public boolean getFullOccupancy() {
        if (occupancy == (float) (1.0)) {
            fullOccupancy = true;
        }
        if (occupancy < (float) (1.0)) {
            fullOccupancy = false;
        }
        return fullOccupancy;
    }

    public float setOccupancy(float newOccupancy) {
        occupancy = newOccupancy;
        return occupancy;
    }

}


public class Lab13A {
    public static void main(String[] args) {
        BuildingBlueprint buildingOne = new BuildingBlueprint();
        BuildingBlueprint buildingTwo = new BuildingBlueprint();
        buildingOne.defaultBuilding();
        float newOccupancy = (float) (.75);
        buildingTwo.overloadConstructor(30, 30, newOccupancy);
        System.out.println("Year 2020:");
        System.out.println("Building 1 has " + buildingOne.getFloors() + " floors, " + buildingOne.getApartments() + " apartments, and is " + (int)(buildingOne.getOccupancy()*100) + "% occupied. Full? " + buildingOne.getFullOccupancy());
        System.out.println("Building 2 has " + buildingTwo.getFloors() + " floors, " + buildingTwo.getApartments() + " apartments, and is " + (int)(buildingTwo.getOccupancy()*100) + "% occupied. Full? " + buildingTwo.getFullOccupancy());
        System.out.println("\nMany years pass.");
        System.out.println("\nYear 2043");
        buildingOne.setOccupancy((float)(0.0));
        buildingTwo.setOccupancy((float)(1.0));
        System.out.println("Building 1 has " + buildingOne.getFloors() + " floors, " + buildingOne.getApartments() + " apartments, and is " + (int)(buildingOne.getOccupancy()*100) + "% occupied. Full? " + buildingOne.getFullOccupancy());
        System.out.println("Building 2 has " + buildingTwo.getFloors() + " floors, " + buildingTwo.getApartments() + " apartments, and is " + (int)(buildingTwo.getOccupancy()*100) + "% occupied. Full? " + buildingTwo.getFullOccupancy());
        System.out.println("\nLooks like people prefer taller buildings.");
    }

}
