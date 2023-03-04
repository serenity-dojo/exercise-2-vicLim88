package com.serenitydojo.datatypes.utils.conversion;

public class ConvertToFarenheit {
    private final double celcius;
    public ConvertToFarenheit(double celcius){
        this.celcius = celcius;
    };
    public double getFahrenheit(){
        return ((this.celcius * 1.8) + 32);
    }
}
