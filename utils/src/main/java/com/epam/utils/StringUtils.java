package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        double num = Double.parseDouble(str);
        return num >= 0;
    }
}


