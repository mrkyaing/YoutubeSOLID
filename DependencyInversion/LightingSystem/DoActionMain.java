package LightingSystem;

public class DoActionMain {
    public static void main(String[] args) {
        LightBulb lightBulb=new LightBulb();
        Fun fun=new Fun();
        ElectricPowerSwitch electricPowerSwitch=new ElectricPowerSwitch(lightBulb);
        electricPowerSwitch.press();
        electricPowerSwitch.press();

        //electricPowerSwitch=new ElectricPowerSwitch(fun);
        electricPowerSwitch.press();
        //electricPowerSwitch.press();
        //electricPowerSwitch.press();
    }
}
