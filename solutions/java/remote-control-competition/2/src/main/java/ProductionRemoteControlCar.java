import java.util.Comparator;

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>, Cloneable{
    public int units;
    public int numberOfVictories = 0;
    public void drive() {
        this.units += 10;
    }

    public int getDistanceTravelled() {
        return this.units;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }
    public int compareTo(ProductionRemoteControlCar other)
    {
        return Integer.compare(other.getNumberOfVictories(), this.getNumberOfVictories());
    }
}
