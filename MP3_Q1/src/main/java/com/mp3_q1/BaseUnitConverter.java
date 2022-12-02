package com.mp3_q1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class BaseUnitConverter {

    protected BigDecimal MULTIPLIER;
    public abstract  String getName();

    public BigDecimal converterToBase(BigDecimal value){

        return value.multiply(MULTIPLIER).setScale(4, RoundingMode.HALF_UP);
    }

    public BigDecimal converterFromBase(BigDecimal value){

        return value.divide(MULTIPLIER,4, RoundingMode.HALF_UP);
    }


}
