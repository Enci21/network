package devices;

public class SmartDevice extends Device {

    private String name;
    private int numberOfNormalDevices;
    private int range;
    private ScreenSize screenSize;
    private int id = 1;

    public SmartDevice(String name, ScreenSize screenSize, int range, int batteryLife, int age) {
        super(batteryLife, age);
        this.name = name;
        this.range = range;
        this.screenSize = screenSize;
        calculatePower();
    }

    public SmartDevice(int batteryLife, ScreenSize screenSize, int range, int age) {
        super(batteryLife, age);
        this.range = range;
        this.screenSize = screenSize;
        idGenerator();
        this.name = setName();
        calculatePower();
    }

    public void calculatePower() {
        setPower(getBatteryLife() - getAge() * 15 - screenSize.battery);
    }

    private void idGenerator() {
        id++;
    }

    public String setName() {
        return this.name = getClass().getName() + id;
    }

    public int getRange() {
        return range;
    }

    public void setNumberOfNormalDevices(int numberOfNormalDevices) {
        this.numberOfNormalDevices = numberOfNormalDevices;
    }
}


