public class Hangar {
    public static void main(String[] args) {

        Car clio = new Car("Clio", 200);
        Boat boat = new Boat("Queen Elizabeth 2", 300);

        System.out.println(clio.doStuff());
        System.out.println(boat.doStuff());
    }
}
