package tiktak;



public class TransportSorter extends Vehicle  {
    public TransportSorter(String model, int speed, Boolean isDieselFuel, int fuel) {
        super(model, speed, isDieselFuel, fuel);
    }

    public void sort(){

        if(this.isFlying()){
            System.out.println("это отдел полетов ");
            this.drive(this.getSpeed());
            this.stop();
            this.toString();
            this.flyLan();

        }
    }

    @Override
    public void drive(int speed) {
        System.out.println("я взлетел");
    }

    @Override
    public void stop() {
        System.out.println("я остоновился");
    }



}
