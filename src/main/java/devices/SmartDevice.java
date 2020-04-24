package devices;

public class SmartDevice extends Device{

    private String name;
    private int numberOfNormalDevices;
    private ScreenSize screenSize;

    public SmartDevice(String name, ScreenSize screenSize) {
        this.name = name;
        this.screenSize = screenSize;
    }

    public void calculatePower() {
        setPower(- getAge()*15 - screenSize.battery);
    }
}
