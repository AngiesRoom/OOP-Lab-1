public class SportsCar extends Vehicle implements Automobile {

    public int    doors;
    public double fuelLevel;


    public SportsCar(String make, int year) {
        super(make, year);
        this.doors       = 2;
        this.fuelLevel   = MAX_FUEL;

    }


    @Override
    public void accelerate(double speed) {
        fuelLevel -= speed * 0.08;
        System.out.println(make + " (" +   speed + " km/h  ⛽ " + fuelLevel + "%");
    }

    @Override
    public void stop() {
        System.out.println(make + " has stopped.");
    }

    @Override
    public double gas() {
        return fuelLevel;
    }


    @Override
    public void brake() {
        System.out.println(make + " brakes aggressively.");
    }

    @Override
    public String getInfo() {
        return "SportsCar: " + year + " " + make +
                " | Doors: " + doors +
                " | Fuel: " + fuelLevel + "%";
    }
}