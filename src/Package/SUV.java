package Package;

public abstract class SUV {
    int fuel=0;
    Boolean isDiesel;
public SUV(int fuel,Boolean isDiesel){
    this.fuel=fuel;
    this.isDiesel=isDiesel;
}
    public void Vodiladrive(){
        fuel-=10;
        System.out.println("Я еду с нормальным колво бензина "+fuel);
        checkFuel(fuel);

    }
    public void Vodilastop(){
        System.out.println("Я остоновился");
    }
    private void checkFuel(int fuel){
        if(fuel<0){
            this.fuel=0;
        }else if(fuel>100){
            this.fuel=58;
        }

    }

    public abstract void Vodiadrive();
}
