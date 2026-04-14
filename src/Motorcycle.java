public class Motorcycle extends Vehicle{
    public Motorcycle(String name, int year){
        super(name, year);
    }

    @Override
    public void accelerate(int speed){
        System.out.println("The bike has accelerated by: " + speed + " km/hr");
    }
    @Override
    public void stop(){
        System.out.println("The bike has stopped");
    }
    @Override
    public void gas(){
        System.out.println("Gas has been applied");
    }



}
