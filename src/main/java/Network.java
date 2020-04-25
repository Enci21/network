import devices.ConnectedDevice;
import devices.Device;
import devices.NormalDevice;
import devices.SmartDevice;

import java.util.ArrayList;
import java.util.List;

public class Network {

    private List<Device> devices = new ArrayList();

    private int connectedDeviceCounter;

    public void addSmartDevice(SmartDevice device) {
        devices.add(device);
    }

    public void addConnectedDevice(ConnectedDevice device) {
        connectedDeviceCounter++;
        device.setNumberOfConnectedDevices(connectedDeviceCounter);
        devices.add(device);
    }

    public void addNormalDevice(NormalDevice device) {
        devices.add(device);
    }

    public List<Device> getDevices() {
        return devices;
    }

    public int getConnectedDeviceCounter() {
        return connectedDeviceCounter;
    }
}
