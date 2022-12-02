package com.mp3_q1.Length;

import com.mp3_q1.BaseUnitConverter;

import java.math.BigDecimal;

public class FootConverter extends BaseUnitConverter {

    public FootConverter(){

        this.MULTIPLIER = new BigDecimal(0.3048);
    }


    @Override
    public String getName() {
        return "Foot";
    }
}
