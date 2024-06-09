package DIPractice;

public class Fun  implements ISwitchable{
    @Override
    public void turnOn() {
        System.out.println("Fun: fun turned on...");
    }
    @Override
    public void turnOff() {
        System.out.println("Fun: fun turned off...");
    }
}
