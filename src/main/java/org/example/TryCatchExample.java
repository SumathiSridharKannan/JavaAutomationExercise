package org.example;

public class TryCatchExample {
    //Method 1 String noTryCatch(Strings[]  strings,int index)
    String noTryCatch(String[] strings,int index) {
        return strings[index];
    }
    //Method 1 String withTryCatch(Strings[]  strings,int index)
    String withTryCatch(String[] strings, int index){
        try {
           return strings[index];
        }catch (ArrayIndexOutOfBoundsException e) {

        return "An exception was caught";
    }
}
}
