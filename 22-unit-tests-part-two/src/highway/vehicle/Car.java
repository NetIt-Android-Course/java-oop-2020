package highway.vehicle;

public class Car implements Vehicle {

    protected String registrationNumber;
    protected int horsepower;
    protected int speed;
    protected boolean isProtectionOn;

    public Car(String registrationNumber, int horsepower) {
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getHorsepower() {
        return horsepower;
    }

    @Override
    public void start() {
        this.isProtectionOn = true;
    }

    @Override
    public int increaseSpeed(int kph) {
        return this.speed += kph;
    }

    @Override
    public int decreaseSpeed(int kph) {
        return this.speed -= kph;
    }

    @Override
    public void stop() {
        this.speed = 0;
        this.isProtectionOn = false;
    }

    @Override
    public boolean doesItMove() {
        return this.speed > 0;
    }

}