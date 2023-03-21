public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27 inch", "Acer", 27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6,
                "v2.44");
        PersonalComputer thePersonalComputer = new PersonalComputer("2208", "Dell", theCase,
                theMonitor, theMotherboard);
        thePersonalComputer.powerUp();


    }
}