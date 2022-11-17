package Package;

public class Plain extends  Vehicle implements  Flyable {
    @Override
    public void flyLan() {
        super.flyLan();
        System.out.println("я лечу я самолет ");
        System.out.println("я сажусь  я самолет");
    }

    public Plain(String model, int speed, Boolean isDieselFuel, int fuel) {
        super(model, speed, isDieselFuel, fuel);
        this.setFlying(true);
    }

    @Override
    public boolean fly() {

        this.setFuel(this.getFuel()-10);
        System.out.println("я самолет я лечу ");
        return true;
    }

    @Override
    public boolean landing() {

        System.out.println("я самолет я снижаюсь(спуск с высоты на землу)");
        return true;
    }

    @Override
    public void drive(int speed) {
        this.setSpeed(speed);
        this.setFuel(this.getFuel()-5);
        System.out.println("я самолет начал взлет по полосе");

    }

    @Override
    public void stop() {
        this.setSpeed(0);
        this.setFuel(this.getFuel()-10);
        System.out.println("я самолет, я полностью остановился");

    }

    @Override
    public String toString() {
        return super.toString()+" я самолет, моя модель " +this.getModel();
    }
}
