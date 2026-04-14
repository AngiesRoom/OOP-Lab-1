public class Bus extends Vehicle{
    public Bus(String name, int year){
        super(name, year);
    }

    @Override
    public void accelerate(int speed){
        System.out.println("The bus has accelerated by: " + speed + " km/hr");
    }
    @Override
    public void stop(){
        System.out.println("The bus has stopped");
    }
    @Override
    public void gas(){
        System.out.println("Gas has been applied");
    }



}
