public class Main {
    public static void main(String[] args) {

        Sedan sedan = new Sedan("Toyota", 2022);

        System.out.println("========== Vehicle Info ==========");
        sedan.displayInfo();

        System.out.println("\n========== Method Overriding ==========");
        // Calls Sedan's version of accelerate() — OVERRIDES Vehicle's abstract method
        sedan.accelerate(100);

        System.out.println("\n========== Method Overloading ==========");

        sedan.accelerate(120);
        sedan.accelerate(80);
        sedan.accelerate(60);
    }
}