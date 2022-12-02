package com.mp3_q1.Mass;

import com.mp3_q1.BaseUnitConverter;

import java.math.BigDecimal;

public class GramConverter extends BaseUnitConverter {

    public GramConverter(){

        this.MULTIPLIER = new BigDecimal(1);
    }
    @Override
    public String getName() {
        return "Gram";
    }
}
