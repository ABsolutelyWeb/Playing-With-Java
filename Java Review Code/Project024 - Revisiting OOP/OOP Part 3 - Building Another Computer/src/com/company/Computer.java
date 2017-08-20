package com.company;

public class Computer {
    private Case theCase;
    private Mobo theMobo;
    private Monitor theMonitor;

    public Computer(Case theCase, Mobo theMobo, Monitor theMonitor) {
        this.theCase = theCase;
        this.theMobo = theMobo;
        this.theMonitor = theMonitor;
    }

    public void powerUp() {
        theCase.pressPowerBtn();
        drawLogo();
    }

    private void drawLogo() {
        theMonitor.drawPixelAt(1000, 30, "purple");
    }
}
