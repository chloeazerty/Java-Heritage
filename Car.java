public class Car extends Vehicle {

    //constructor with super because extends
    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    //implementation of the abstract method
    public String doStuff(){
        return "I am " + this.getBrand() + " and I go zoom zoom zoom!";
    }
}
