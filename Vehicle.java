public abstract class Vehicle {

    //attributes
    String brand;
    int kilometers;

    //constructor
    public Vehicle(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    //the abstract method
    public abstract  String doStuff();

    //getters & setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }
}
