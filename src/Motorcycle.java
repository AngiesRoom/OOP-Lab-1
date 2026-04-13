public class Motorcycle extends Vehicle {
    public Motorcycle(String make, int year) {
        super(make, year);
    }

    @Override
    public void accelerate(double speed) {
        System.out.println(make + " accelerates to " + speed + " km/h");
    }

    @Override
    public void stop() {
        System.out.println(make + " has stopped.");
    }

    @Override
    public double gas() {
        return 100.0;
    }
}

