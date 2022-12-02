package com.mp3_q1.Mass;

import com.mp3_q1.BaseUnitConverter;

import java.math.BigDecimal;

public class PoundConverter extends BaseUnitConverter {

    public PoundConverter (){

        this.MULTIPLIER = new BigDecimal(453.59);
    }

    @Override
    public String getName() {
        return "Pound(Ib)";
    }

}
