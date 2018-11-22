/*
 * This Java source file was generated by the Gradle 'init' task.

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
 */
class App {
    public static void main(String[] args) {
        Vehicle vehicleA = new Vehicle("vehicleA", "apple");
        Vehicle vehicleB = new Vehicle("vehicleB", "orange");
        vehicleA.speedup(30);
        vehicleB.speedup(40);

    }
}

class Vehicle {

    private String name;
    private String brand;

    public Vehicle(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }


    public void speedup(int speed) {
        System.out.println("name: " + this.name + " Brand: " + this.brand + " Speedup: " + speed);
    }

}