public interface Automobile {


    int    DEFAULT_DOORS= 4;
    double MAX_FUEL    = 100.0;


    void   accelerate(double speed);
    void   brake();
    String getInfo();
}