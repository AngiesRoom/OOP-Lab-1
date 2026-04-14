public abstract class Vehicle {
    public String name;
    public int year;

    public Vehicle(String name, int year){
        this.name = name;
        this.year = year;
    }
    public void getDetails(){
        System.out.println(year + " " + name);
    }



    public abstract void accelerate(int speed);

    public abstract void stop();

    public abstract void gas();
}
