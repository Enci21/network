import devices.ConnectedDevice;
import devices.NormalDevice;
import devices.ScreenSize;
import devices.SmartDevice;

public class Main {


    public static void main(String[] args) {
        Network network = new Network();

        ConnectedDevice connectedDevice = new ConnectedDevice(50);
        ConnectedDevice connectedDevice2 = new ConnectedDevice(50);
        ConnectedDevice connectedDevice3 = new ConnectedDevice(50);
        ConnectedDevice connectedDevice4 = new ConnectedDevice(50);
        ConnectedDevice connectedDevice5 = new ConnectedDevice(50);
        ConnectedDevice connectedDevice6 = new ConnectedDevice(50);
        SmartDevice smartDevice = new SmartDevice("SmartDevice kézi névvel", ScreenSize.FULLHD, 30);
        SmartDevice smartDevice2 = new SmartDevice(40, ScreenSize.UHD);
        SmartDevice smartDevice3 = new SmartDevice(40, ScreenSize.UHD);
        SmartDevice smartDevice4 = new SmartDevice(40, ScreenSize.UHD);
        SmartDevice smartDevice5 = new SmartDevice(40, ScreenSize.UHD);
        NormalDevice normalDevice = new NormalDevice(1999, ScreenSize.EDTV, 60);
        NormalDevice normalDevice2 = new NormalDevice(2001, ScreenSize.EDTV, 60);
        NormalDevice normalDevice3 = new NormalDevice(2010, ScreenSize.EDTV, 60);
        NormalDevice normalDevice4 = new NormalDevice(1988, ScreenSize.EDTV, 60);

        network.addDevice(connectedDevice);
        network.addDevice(connectedDevice2);
        network.addDevice(connectedDevice3);
        network.addDevice(connectedDevice4);
        network.addDevice(connectedDevice5);
        network.addDevice(connectedDevice6);
        network.addDevice(smartDevice);
        network.addDevice(smartDevice2);
        network.addDevice(smartDevice3);
        network.addDevice(smartDevice4);
        network.addDevice(smartDevice5);
        network.addDevice(normalDevice);
        network.addDevice(normalDevice2);
        network.addDevice(normalDevice3);
        network.addDevice(normalDevice4);

        network.getDevices().stream().forEach(d -> System.out.println(d.getClass().getSimpleName()));

    }
}
