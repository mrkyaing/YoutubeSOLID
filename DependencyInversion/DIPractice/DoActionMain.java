package DIPractice;

public class DoActionMain {
    public static void main(String[] args) {
        //create a lightbulb object by using DI
        ISwitchable lightbulb = new LightBulb();
        ISwitch powerSwitch = new ElectricPowerSwitch(lightbulb);
        powerSwitch.press();//ON for lightbulb
        powerSwitch.press();//Off lightbulb
        //create a fun object by using DI
        ISwitchable fun = new Fun();
        powerSwitch = new ElectricPowerSwitch(fun);
        powerSwitch.press();//ON for fun bulb
        powerSwitch.press();//Off fun bulb
    }
}
