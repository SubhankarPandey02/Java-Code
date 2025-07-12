public class PersonalComputer extends Product{
    private Motherboard motherboard;
    private ComputerCase computerCase;
    private Monitor monitor;

    public PersonalComputer(String model, String manufacturer, Motherboard motherboard, ComputerCase computerCase, Monitor monitor) {
        super(model, manufacturer);
        this.motherboard = motherboard;
        this.computerCase = computerCase;
        this.monitor = monitor;
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }

//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
//
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
}
