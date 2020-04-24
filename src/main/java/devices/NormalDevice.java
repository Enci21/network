package devices;

public class NormalDevice extends Device {

    private int manufacturedYear;
    private ScreenSize screenSize;

    public NormalDevice(int manufacturedYear, ScreenSize screenSize) {
        this.manufacturedYear = manufacturedYear;
        this.screenSize = screenSize;
    }

    public void calculatePower() {
        if( manufacturedYear >= 2000){
            setPower(getPower()*2);
        }
        else{
            setPower(getPower()/2);
        }
        setPower(- getAge()*3 );
    }
}
