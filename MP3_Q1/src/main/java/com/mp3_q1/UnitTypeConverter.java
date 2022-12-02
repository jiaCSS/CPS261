package com.mp3_q1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class UnitTypeConverter {

    public abstract String getUnitType();
    private String standardBaseUnit;
    private Map<String, BaseUnitConverter> baseUnitConverterMap =
            new HashMap<>();


    //Constructor
    protected UnitTypeConverter(String standardBaseUnit, Map<String,
            BaseUnitConverter> baseUnitConverterMap){

        this.standardBaseUnit = standardBaseUnit;
        this.baseUnitConverterMap = baseUnitConverterMap;

    }

    //get base unit Map
    public Map<String, BaseUnitConverter> getBaseUnitConverterMap(){

        return baseUnitConverterMap;
    }


    //getBase Unit converter Map list;
    public List<BaseUnitConverter> getBaseUnitConverterList(){

        return new ArrayList<>(baseUnitConverterMap.values());
    }


   //converter function
    public BigDecimal converter(BigDecimal value, BaseUnitConverter from,
                                BaseUnitConverter to){

        if(to.getName().equals(from.getName())){

            return value.setScale(4, RoundingMode.HALF_UP);
        }
        else{

            if(this.getUnitType() == "Temperature"){

                if(to.getName().equals(standardBaseUnit)){

                    value = value.subtract(new BigDecimal(32));

                    BigDecimal base =
                            baseUnitConverterMap.get(from.getName()).converterToBase(value);

                    return base.setScale(4, RoundingMode.HALF_UP);

                }
                else{

                    BigDecimal fromBase =
                            baseUnitConverterMap.get(to.getName()).converterFromBase(value);

                    fromBase = fromBase.add(new BigDecimal(32));

                    return fromBase.setScale(4,
                            RoundingMode.HALF_UP);
                }
            }
            else{

                BigDecimal base =
                        baseUnitConverterMap.get(from.getName()).converterToBase(value);
                if(to.getName().equals(standardBaseUnit)){

                    return base.setScale(4, RoundingMode.HALF_UP);
                }
                else{

                    BigDecimal fromBase =
                            baseUnitConverterMap.get(to.getName()).converterFromBase(base);

                    return fromBase.setScale(4, RoundingMode.HALF_UP);
                }

            }

        }

    }




}
