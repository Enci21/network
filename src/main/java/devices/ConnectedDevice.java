package devices;

import java.util.function.Supplier;

public class ConnectedDevice extends Device {

    private Supplier<Integer> numberOfConnectedDevices;

    public ConnectedDevice(int batteryLife) {
        super(batteryLife);
    }

    public void calculatePower() {
        setPower(-getAge() * 7 + 20 * numberOfConnectedDevices.get());
    }

    public Supplier<Integer> getNumberOfConnectedDevices() {
        return numberOfConnectedDevices;
    }

    public void setNumberOfConnectedDevices(Supplier<Integer> numberOfConnectedDevices) {
        this.numberOfConnectedDevices = numberOfConnectedDevices;
    }
}
