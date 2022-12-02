package com.mp3_q1.Length;

import com.mp3_q1.BaseUnitConverter;

import java.math.BigDecimal;

public class KilometerConverter extends BaseUnitConverter {

    public KilometerConverter(){

        this.MULTIPLIER = new BigDecimal(1000);
    }
    @Override
    public String getName() {
        return "Kilometer";
    }
}
