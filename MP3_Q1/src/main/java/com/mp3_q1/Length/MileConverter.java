package com.mp3_q1.Length;

import com.mp3_q1.BaseUnitConverter;

import java.math.BigDecimal;

public class MileConverter extends BaseUnitConverter {

    public MileConverter(){

        this.MULTIPLIER = new BigDecimal(1609.34);
    }


    @Override
    public String getName() {
        return "Mile";
    }
}
