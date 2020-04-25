package devices;

public class ConnectedDevice extends Device {

    public int numberOfConnectedDevices;

    public ConnectedDevice(int batteryLife) {
        super(batteryLife);
    }

    public void calculatePower() {
        setPower(-getAge() * 7 + 20 * numberOfConnectedDevices);
    }

    public void setNumberOfConnectedDevices(int numberOfConnectedDevices) {
        this.numberOfConnectedDevices = numberOfConnectedDevices;
    }

    public int getNumberOfConnectedDevices() {
        return numberOfConnectedDevices;
    }
}
