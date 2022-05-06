package org.launchcode.studio7;

import java.util.ArrayList;

public  abstract class BaseDisk {

    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;
    private String diskType;
    private ArrayList<String> contents;


    public abstract String titleScreen();

    private int spaceLeft() {
        return storageCapacity - capacityUsed;
    }

}


// title
// storageCapacity
// capacityUsed
// capacityRemaining
// diskType
// contents

// checkCapacity
// spaceLeft
// writeDisk
// diskInfo