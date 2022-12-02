package com.mp3_q1.Mass;

import com.mp3_q1.BaseUnitConverter;

import java.math.BigDecimal;

public class KilogramConverter extends BaseUnitConverter {

    public KilogramConverter(){

        this.MULTIPLIER = new BigDecimal(1000);
    }


    @Override
    public String getName() {
        return "Kilogram(Kg)";
    }
}
