package com.serenitydojo.datatypes.utils.conversion;

public class ConvertKiloToPound {
    private final double kilo;
    public ConvertKiloToPound(int kilo){
        this.kilo = kilo;
    }
    public double getPound(){
        return this.kilo * 2.20462;
    }
}
