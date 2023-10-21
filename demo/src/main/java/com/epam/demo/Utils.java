package com.epam.demo;

import java.util.List;
import java.*

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        boolean result = true;
        for (String strNum: args) {
            int num = Integer.valueOf(strNum);
            if(num >= 0){
                result = result && true;
            }
            else {
                result = result && false;
            }
        }
        return result;
    }
}