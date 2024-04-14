package com.epam.mjc.stage0;
public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Animal(String color, int numberOfPaws, boolean hasFur)
    {
        this.color = "red";
        this.numberOfPaws = 4;
        this.hasFur = true;
    }
    public String getDescription()
    {
        String description = "This animal is mostly " + color + ". It has " + numberOfPaws + " paw";
        if (numberOfPaws != 1) description += "s ";
        description += "and ";
        if (hasFur) description += "a fur.";
        else description += "no fur.";
        return description;
    }


}
