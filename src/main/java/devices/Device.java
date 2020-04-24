package devices;

public abstract class Device {

    private int age;
    private int batteryLife;
    private int power;


    public Device(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public abstract void calculatePower();

    public int getAge() {
        return age;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
