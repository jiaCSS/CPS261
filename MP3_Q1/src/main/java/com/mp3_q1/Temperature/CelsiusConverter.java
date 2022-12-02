package com.mp3_q1.Temperature;

import com.mp3_q1.BaseUnitConverter;

import java.math.BigDecimal;

public class CelsiusConverter extends BaseUnitConverter {

    int abc =56;

    public CelsiusConverter(){

        this.MULTIPLIER = new BigDecimal(1);
    }

    @Override
    public String getName() {
        return "Celsius(C)";
    }
}
