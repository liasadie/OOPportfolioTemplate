public class Lights {
    public static void main(String[] args) {
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();
        Bulb bulb3 = new Bulb();

        bulb2.turnOn();
        bulb3.turnOn();

        System.out.println("Bulb 1 is " + (bulb1.isOn() ? "on" : "off"));
        System.out.println("Bulb 2 is " + (bulb2.isOn() ? "on" : "off"));
        System.out.println("Bulb 3 is " + (bulb3.isOn() ? "on" : "off"));
    }
}
