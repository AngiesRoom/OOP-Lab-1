public class Sedan extends Vehicle implements Automobile {

        public int    doors;
        public double fuelLevel;
        public boolean hasTrunk;

        public Sedan(String make, int year) {
            super(make, year);
            this.doors     = DEFAULT_DOORS;
            this.fuelLevel = MAX_FUEL;
            this.hasTrunk  = true;
        }


        @Override
        public void accelerate(double speed) {
            fuelLevel -= speed * 0.05;
            System.out.println(make + " accelerates to " + speed + " km/h   " + fuelLevel + "%");
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
            System.out.println(make + " is braking smoothly.");
        }

        @Override
        public String getInfo() {
            return "Sedan: " + year + " " + make +
                    " | Doors: " + doors +
                    " | Trunk: " + hasTrunk +
                    " | Fuel: " + fuelLevel + "%";
        }
    }

