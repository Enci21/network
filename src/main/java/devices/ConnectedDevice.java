package devices;

import java.util.function.Supplier;

public class ConnectedDevice extends Device {

    private Supplier<Integer> numberOfConnectedDevices;

    public ConnectedDevice(int batteryLife, int age) {
        super(batteryLife, age);
    }

    public void calculatePower() {
        if (numberOfConnectedDevices == null) {
            setPower(getBatteryLife() - getAge() * 7);
        } else {

            setPower(getBatteryLife() - getAge() * 7 + 20 * numberOfConnectedDevices.get());
        }
    }

    public void setNumberOfConnectedDevices(Supplier<Integer> numberOfConnectedDevices) {
        this.numberOfConnectedDevices = numberOfConnectedDevices;
    }
}
