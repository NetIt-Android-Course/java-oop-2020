package highway.vehicle;

public class Motorbike implements Vehicle {

    private String registrationNumber;
    private int speed;
    private int horsepower;
    private boolean isHelmetOn;

    public Motorbike(String registrationNumber, int horsepower) {
        this.registrationNumber = registrationNumber;
        this.speed = 0;
        this.horsepower = horsepower;
        this.isHelmetOn = false;
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
        this.isHelmetOn = true;
        this.speed = 20;
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
    }

    @Override
    public boolean doesItMove() {
        return this.speed > 0;
    }
}