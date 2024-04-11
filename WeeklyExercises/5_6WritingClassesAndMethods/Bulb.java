public class Bulb {
    private boolean isOn;

    public Bulb() {
        isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Bulb has been turned on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Bulb has been turned off.");
    }

    public boolean isOn() {
        return isOn;
    }
}
