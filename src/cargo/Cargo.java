package cargo;

public class Cargo {
    String cargoName;
    String weight;
    String pointOfDeparture;
    String pointOfDestination;

    public Cargo(String cargoName, String weight, String pointOfDeparture, String pointOfDestination) {
        this.cargoName = cargoName;
        this.weight = weight;
        this.pointOfDeparture = pointOfDeparture;
        this.pointOfDestination = pointOfDestination;
    }

    public void printInformation() {
        System.out.println (this.cargoName + " - " + this.weight + " - " + this.pointOfDeparture + " - " + this.pointOfDestination + " - ");
    }
}


