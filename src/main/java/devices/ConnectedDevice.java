package devices;

public class ConnectedDevice extends Device {

    private int numberOfConnectedDevices;

    public ConnectedDevice() {
        numberOfConnectedDevices++;
    }

    public void calculatePower() {
        setPower(- getAge() * 7 + 20*numberOfConnectedDevices);
    }

}
