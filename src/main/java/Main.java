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

        network.addConnectedDevice(connectedDevice);
        network.addConnectedDevice(connectedDevice2);
        network.addConnectedDevice(connectedDevice3);
        network.addConnectedDevice(connectedDevice4);
        network.addConnectedDevice(connectedDevice5);
        network.addConnectedDevice(connectedDevice6);

        network.addSmartDevice(smartDevice);
        network.addSmartDevice(smartDevice2);
        network.addSmartDevice(smartDevice3);
        network.addSmartDevice(smartDevice4);
        network.addSmartDevice(smartDevice5);

        network.addNormalDevice(normalDevice);
        network.addNormalDevice(normalDevice2);
        network.addNormalDevice(normalDevice3);
        network.addNormalDevice(normalDevice4);

    }
}
