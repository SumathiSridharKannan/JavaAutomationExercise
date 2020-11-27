package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TryCatchExample {
    public static final Logger LOGGER =Logger.getAnonymousLogger();
    //Method 1 String noTryCatch(Strings[]  strings,int index)
    String noTryCatch(String[] strings,int index) {
        return strings[index];
    }
    //Method 1 String withTryCatch(Strings[]  strings,int index)
    String withTryCatch(String[] strings, int index){
        try {
           return strings[index];
        }catch (ArrayIndexOutOfBoundsException e) {
            LOGGER.log(Level.WARNING,"ArrayIndexOutBoundException with Index : " + index);

        return "An exception was caught";
    }
}
}
