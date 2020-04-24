package devices;

public class ConnectedDevice extends Device {

    private int numberOfConnectedDevices;

    public ConnectedDevice(int batteryLife) {
        super(batteryLife);
        numberOfConnectedDevices++;
        System.out.println(numberOfConnectedDevices);
    }


    public void calculatePower() {
        setPower(-getAge() * 7 + 20 * numberOfConnectedDevices);
    }


}
