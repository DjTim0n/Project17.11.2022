import tiktak.*;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        Plain plain = new Plain("jet",100,false,100);
        plain.toString();
        plain.drive(200);
        plain.fly();
        plain.landing();
        plain.stop();

        Car car =new Car("x5",60,true,80);
        car.drive(100);
        car.stop();
        car.toString()
        ;
        Motocicle motocicle=new Motocicle("ava",180,false,20);
        motocicle.drive(180);
        motocicle.stop();
        motocicle.toString();
        FlyingCar flyingCar=new FlyingCar("x5",180,false,100);
        flyingCar.drive(100);
        flyingCar.stop();
        flyingCar.landing();
        flyingCar.fly();
        flyingCar.toString();


    }
}
