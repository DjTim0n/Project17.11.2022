package tiktak;


public abstract class Vehicle {
    private String model;
    private int speed=0;
    private Boolean isDieselFuel;
    private int fuel;

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    private boolean isFlying=false;

    public Vehicle(String model,int speed,Boolean isDieselFuel,int fuel){
        this.model=model;
        this.speed=speed;
        this.isDieselFuel=isDieselFuel;
        this.fuel=fuel;
        checkFuel(this.fuel);
    }

    public abstract void drive(int speed);

    public abstract void stop();

    public void flyLan(){

    }

    public void refuel(){
        this.fuel=100;

    }
    public void checkFuel(int fuel){
        if(fuel<0){
            this.fuel=0;
        }else if(fuel>100){
            this.fuel=100;
        }

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Boolean getDieselFuel() {
        return isDieselFuel;
    }

    public void setDieselFuel(Boolean dieselFuel) {
        isDieselFuel = dieselFuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "это вид транспортного средства";
    }
}
