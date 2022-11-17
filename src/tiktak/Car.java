package tiktak;
public class Car extends Vehicle {
    public Car(String model, int speed, Boolean isDieselFuel, int fuel) {
        super(model, speed, isDieselFuel, fuel);
        this.setFlying(false);
    }

    @Override
    public void drive(int speed)
    {
        this.setSpeed(100);
        this.setFuel(this.getFuel()-30);
        this.checkFuel(this.getFuel());
        System.out.println("я машина поехала...");

    }

    @Override
    public void stop() {
        System.out.println("я машина, остановилась");
    }

    @Override
    public String toString() {

        return super.toString()+" это машина "+this.getModel();
    }
}
