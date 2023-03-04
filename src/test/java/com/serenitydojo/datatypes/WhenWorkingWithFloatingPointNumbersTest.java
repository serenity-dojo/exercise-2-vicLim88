package com.serenitydojo.datatypes;

import com.serenitydojo.datatypes.utils.conversion.ConvertKiloToPound;
import com.serenitydojo.datatypes.utils.conversion.ConvertToFarenheit;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithFloatingPointNumbersTest {

    //
    // Exercise 1: Convert 27 degrees Celcius to Farenheit
    // The equation is: farenheit = (9 / 5) * celcius + 32
    //
    @Test
    public void convertToFarenheit() {
        double celcius = 27.0d;
        double farenheit = new ConvertToFarenheit(celcius).getFahrenheit();
        assertThat(farenheit, equalTo(80.6));
    }

    //
    // Exercise 2: Convert kilograms to pounds
    // There are 2.20462 pounds in a kilogram
    //
    @Test
    public void convertMetersToFeet() {
        int weightInKilograms = 50;
        double weightInPounds = new ConvertKiloToPound(weightInKilograms).getPound();
        assertThat(weightInPounds, equalTo(110.231));
    }
}
