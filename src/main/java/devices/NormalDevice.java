package devices;

public class NormalDevice extends Device {

    private int manufacturedYear;
    private ScreenSize screenSize;

    public NormalDevice(int manufacturedYear, ScreenSize screenSize, int batteryLife, int age) {
        super(batteryLife, age);
        this.manufacturedYear = manufacturedYear;
        this.screenSize = screenSize;
        calculatePower();
    }

    public void calculatePower() {
        setPower(getBatteryLife() - getAge() * 3);
        if (manufacturedYear >= 2000) {
            setPower(getPower() * 2);
        } else {
            setPower(getPower() / 2);
        }

    }
}
