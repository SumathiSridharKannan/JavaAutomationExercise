package org.example;

public class SwimmingPool {

    public static final String ICE = "Ice!";
    public static final String COLD = "It's a cold water!";
    public static final String OPTIMAL = "It's optimal to swim";
    public static final String TOO_HOT = "It's too hot!";

    public static String getMessageForWaterTemperature (int waterTemp) {

        if (waterTemp <= 0){
            return(ICE);
        }
        else if (waterTemp <20){
               return(COLD);
        }
        else if (waterTemp <28){
                return(OPTIMAL);
        }
        else
            return(TOO_HOT);

    }


}
