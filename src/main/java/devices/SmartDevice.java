package devices;

public class SmartDevice extends Device {

    private String name;
    private int numberOfNormalDevices;
    private ScreenSize screenSize;
    private int id = 1;

    public SmartDevice(String name, ScreenSize screenSize, int batteryLife) {
        super(batteryLife);
        this.name = name;
        this.screenSize = screenSize;
    }

    public SmartDevice(int batteryLife, ScreenSize screenSize) {
        super(batteryLife);
        this.screenSize = screenSize;
        idGenerator();
        this.name = setName();
    }

    private void countNormalDevicesInARange(int range) {

    }

    public void calculatePower() {
        setPower(-getAge() * 15 - screenSize.battery);
    }

    private void idGenerator() {
        id++;
    }

    public String setName() {
        return this.name = getClass().getName() + id;
    }
}


