package com.mp3_q1.Temperature;

import com.mp3_q1.BaseUnitConverter;

import java.math.BigDecimal;

public class KelvinConverter extends BaseUnitConverter {

    public KelvinConverter(){

        this.MULTIPLIER = new BigDecimal(-273.15);
    }
    @Override
    public String getName() {

        return "Kelvin(K)";
    }
}
