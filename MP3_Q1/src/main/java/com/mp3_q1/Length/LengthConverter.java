package com.mp3_q1.Length;

import com.mp3_q1.BaseUnitConverter;
import com.mp3_q1.UnitTypeConverter;

import java.util.HashMap;

public class LengthConverter extends UnitTypeConverter {

    private static  BaseUnitConverter meterConverter = new MeterConverter();
    private static  BaseUnitConverter footConverter = new FootConverter();

    private static BaseUnitConverter mileConverter = new MileConverter();

    private static BaseUnitConverter kilometerConverter = new KilometerConverter();


    public LengthConverter(){

        super("Meter", new HashMap<String, BaseUnitConverter>(){

            {
                put(meterConverter.getName(), meterConverter);
                put(footConverter.getName(), footConverter);
                put(mileConverter.getName(), mileConverter);
                put(kilometerConverter.getName(), kilometerConverter);
            }
        });


    }
    @Override
    public String getUnitType() {
        return "Length";
    }
}
