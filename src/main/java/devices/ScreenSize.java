package devices;

public enum ScreenSize {
    EDTV(5),
    HD(10),
    FULLHD(15),
    UHD(20);

    public final int battery;

    ScreenSize(int battery) {
        this.battery = battery;
    }
}
