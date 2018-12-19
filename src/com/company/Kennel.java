package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Kennel {
    private ArrayList petList;

    public void allSpeak() {
        for (Pet p : petList)
            System.out.println(p.getName() + ": " + p.speak());
    }
}
