package com.mp3_q1.Temperature;

import com.mp3_q1.BaseUnitConverter;
import com.mp3_q1.UnitTypeConverter;

import java.util.HashMap;
import java.util.Map;

public class TemperatureConverter extends UnitTypeConverter {

    private static CelsiusConverter celsiusConverter = new CelsiusConverter();

    private static FahrenheitConverter fahrenheitConverter =
            new FahrenheitConverter();

    private static KelvinConverter kelvinConverter = new KelvinConverter();

    public TemperatureConverter(){

        super( "Celsius(C)", new HashMap<String, BaseUnitConverter>(){

            {
                put(celsiusConverter.getName(), celsiusConverter);
                put(fahrenheitConverter.getName(), fahrenheitConverter);
                put(kelvinConverter.getName(), kelvinConverter);
            }
        });
    }




    @Override
    public String getUnitType() {
        return "Temperature";
    }
}
