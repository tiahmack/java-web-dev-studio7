package org.launchcode.studio7;

public class DVD extends BaseDisk implements Spinnable {
    private String studio;

    @Override
    public void spinDisk() {

    }

    @Override
    public void readDisc() {

    }

    @Override
    public String titleScreen() {
        return "This DVD is called...";
    }
}
