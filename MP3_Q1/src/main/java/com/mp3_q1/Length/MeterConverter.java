package com.mp3_q1.Length;

import com.mp3_q1.BaseUnitConverter;

import java.math.BigDecimal;

public class MeterConverter extends BaseUnitConverter {

    public MeterConverter(){

        this.MULTIPLIER = new BigDecimal(1);
    }

    @Override
    public String getName() {
        return "Meter";
    }
}
