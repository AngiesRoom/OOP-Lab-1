public class SportsCar extends Vehicle implements Automobile{
    public int doors;
    public int maxSpeed ;
    public double engineSize;

    public SportsCar(String name, int year, int doors, int maxSpeed, double engineSize){
        super(name, year);
        this.doors = doors;
        this.maxSpeed = maxSpeed;
        this.engineSize = engineSize;
    }

    @Override
    public void accelerate(int speed){
        System.out.println("The " + name + " has accelerated by: " + speed + " km/hr");
    }
    public void accelerate(){
        System.out.println("The vehicle has not accelerated");
    }
    @Override
    public void stop(){
        System.out.println("The " + name + " has stopped");
    }
    @Override
    public void gas(){
        System.out.println("Gas has been applied");
    }
    @Override
    public void displayMaxSpeed(){
        System.out.println("The max speed of the " + name + " is " + maxSpeed);
    }
    @Override
    public void displayDoors(){
        System.out.println("The number of doors is " + doors);
    }
    @Override
    public void displayEngineSize(){
        System.out.println("The engine size is " + engineSize);
    }





}
