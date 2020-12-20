package academy.learnprogramming;

public class PC {
    private Case theCase;
    // PC has a Case so there is a case here
    private Monitor monitor;
    // PC has a Monitor so there is a monitor here
    private Motherboard motherboard;
    // PC has a Motherboard so there is a motherboard

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
//        getMonitor().drawPixelAt(1200, 50 "green");
        // OR
        monitor.drawPixelAt(1200, 50, "green");
    }
//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
