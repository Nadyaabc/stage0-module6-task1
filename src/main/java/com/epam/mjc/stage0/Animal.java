package com.epam.mjc.stage0;
public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Animal()
    {
        this.color = "red";
        this.numberOfPaws = 4;
        this.hasFur = true;
    }
    public Animal(String color, int numberOfPaws, boolean hasFur)
    {
        this.color = color;
        this.numberOfPaws =numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription()
    {
        String description = "This animal is mostly " + this.color + ". It has " + this.numberOfPaws + " paw";
        if (this.numberOfPaws != 1) description += "s";
        description += " and ";
        if (this.hasFur) description += "a fur.";
        else description += "no fur.";
        return description;
    }


}

