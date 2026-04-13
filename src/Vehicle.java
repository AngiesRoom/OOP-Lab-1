public abstract class Vehicle {
    public String make;
    public int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public abstract void accelerate(double speed);
    public abstract void stop();
    public abstract double gas();

    public void displayInfo() {
        System.out.println("Vehicle: " + year + " " + make);
    }
}