package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
         double num = Double.valueOf(str);
         if(num >= 0){
             return true;
         }
         else {
             return false
         }
    }
}


