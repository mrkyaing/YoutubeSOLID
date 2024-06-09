package DIPractice;

public class ElectricPowerSwitch implements ISwitch{
    //Aggregation with abstraction level (DI Principle) depend on abstraction
    public ISwitchable client;
    public boolean on;

    public ElectricPowerSwitch(ISwitchable client) {
        this.client = client;
        this.on = false;
    }
    @Override
    public boolean isOn() {
        return this.on;
    }
    @Override
    public void press() {
        boolean checkOn = isOn();
        if (checkOn) {
            client.turnOff();
            this.on = false;
        } else {
            client.turnOn();
            this.on = true;
        }
    }
}
