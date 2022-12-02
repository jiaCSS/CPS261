package com.mp3_q1.Temperature;

import com.mp3_q1.BaseUnitConverter;

import java.math.BigDecimal;

public class FahrenheitConverter extends BaseUnitConverter {

    public FahrenheitConverter(){

        this.MULTIPLIER = new BigDecimal(0.5556);
    }


    @Override
    public String getName() {

        return "Fahrenheit(F)";
    }
}
