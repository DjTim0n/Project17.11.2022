package Package;


public class FlyingCar extends Car implements Flyable {


    public FlyingCar(String model, int speed, Boolean isDieselFuel, int fuel) {
        super(model, speed, isDieselFuel, fuel);
        this.setFlying(true);
    }

    @Override
    public String toString() {
        return "Летающая машина, о ужас "+this.getModel();
    }

    @Override
    public boolean fly() {
        System.out.println("машина летит ");
        return false;
    }

    @Override
    public boolean landing() {
        System.out.println("машина садится ");
        return false;
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void drive(int speed) {
        super.drive(speed);
    }
}
