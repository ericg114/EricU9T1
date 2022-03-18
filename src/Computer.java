public class Computer {

    private int screenSize;
    private int memory;

    public computer(int screenSize, int memory)
    {
        this.memory = memory;
        this.screenSize = screenSize;
    }

    public void installOperatingSystem()
    {
        System.out.println("installing OS...");
    }
}
