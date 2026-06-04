public class ls12 {
    public static void main(String[] args) {

        Computer apple = new Computer(1000, 1500, "MacBook26");

        apple.getMemory();
        apple.getCpu();
        apple.getName();

        apple.setMemory(2000);
        apple.getMemory();

        Computer asus = new Computer();
        asus.setName("Asus S4");
        asus.getName();

    }
}
