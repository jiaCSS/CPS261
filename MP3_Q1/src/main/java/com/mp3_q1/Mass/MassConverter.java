package com.mp3_q1.Mass;

import com.mp3_q1.BaseUnitConverter;
import com.mp3_q1.UnitTypeConverter;

import java.util.HashMap;

public class MassConverter  extends UnitTypeConverter {

    private static GramConverter gramConverter = new GramConverter();

    private static KilogramConverter kilogramConverter =
            new KilogramConverter();

    private static PoundConverter poundConverter = new PoundConverter();


    public MassConverter(){

        super( "Gram", new HashMap<String, BaseUnitConverter>(){

            {
                put(gramConverter.getName(), gramConverter);
                put(kilogramConverter.getName(), kilogramConverter);
                put(poundConverter.getName(), poundConverter);

            }

                }
        );
    }

    @Override
    public String getUnitType() {
        return "Mass";
    }
}
