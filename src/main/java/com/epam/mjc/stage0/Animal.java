package com.epam.mjc.stage0;
public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Animal(String color, int numberOfPaws, boolean hasFur)
    {}
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
/*Add a methods getDescription(),

witch would use class fields and return a string with such pattern
"This animal is mostly (color). It has (numberOfPaws) paws and ('a'/'no' ->
depends on value of hasFur) fur."
 */