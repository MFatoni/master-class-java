public class CompositionPersonalComputer extends CompositionProduct{
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public CompositionPersonalComputer(String model, String manufacturer,
                            ComputerCase computerCase, Monitor monitor,
                            Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }

//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }
}
