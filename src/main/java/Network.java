import devices.Device;

import java.util.ArrayList;
import java.util.List;

public class Network {

    private List<Device> devices = new ArrayList();


    public void addDevice(Device device) {
        devices.add(device);
    }

    public List<Device> getDevices() {
        return devices;
    }
}
