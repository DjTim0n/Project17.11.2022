package tiktak;


public class Motocicle extends Vehicle {


    public Motocicle(String model, int speed, Boolean isDieselFuel, int fuel) {
        super(model, speed, isDieselFuel, fuel);
        this.setFlying(false);
    }

    @Override
    public void drive(int speed) {
        this.setSpeed(100);
        this.setFuel(this.getFuel()-30);
        this.checkFuel(this.getFuel());
        System.out.println("я мотоцикл поехал...");
    }

    @Override
    public void stop() {
        System.out.println("я  мотоцикл остановился...");
    }

    @Override
    public String toString() {

        return super.toString() +" мотоцикл " +this.getModel();
    }
}
