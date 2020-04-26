import devices.ConnectedDevice;
import devices.Device;
import devices.NormalDevice;
import devices.SmartDevice;

import java.util.ArrayList;
import java.util.List;

public class Network {

    private List<Device> devices = new ArrayList();

    private List<NormalDevice> normalDevices = new ArrayList();

    private int connectedDeviceCounter;

    public void addSmartDevice(SmartDevice device) {
        devices.add(device);
        countNormalDevicesInRange(device);
    }

    public void addConnectedDevice(ConnectedDevice device) {
        connectedDeviceCounter++;
        device.setNumberOfConnectedDevices(this::getConnectedDeviceCounter);
        devices.add(device);
        device.calculatePower();
    }

    public void addNormalDevice(NormalDevice device) {          //NormalDevicePower
        devices.add(device);
        normalDevices.add(device);
    }

    public void countNormalDevicesInRange(SmartDevice smartDevice) {
        List<Device> normalDevicesInRange = new ArrayList<>();

        for (Device d : normalDevices) {
            if (smartDevice.getPower() + smartDevice.getRange() >= d.getPower() && smartDevice.getPower() - smartDevice.getRange() <= d.getPower()) {
                normalDevicesInRange.add(d);
                smartDevice.setNumberOfNormalDevices(getConnectedDeviceCounter());
            }
        }
        smartDevice.setNumberOfNormalDevices(normalDevicesInRange.size());
    }

    public List<NormalDevice> getNormalDevices() {
        return normalDevices;
    }

    public int getConnectedDeviceCounter() {
        return connectedDeviceCounter;
    }
}
