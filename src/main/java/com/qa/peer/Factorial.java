package com.qa.peer;

public class Factorial {


    public static String reverse(int num) {
        float f = num;
        int n = 1;

        while (f > 1) {
            f /= ++n;
        }

        return f == 1 ? n + "!" : "NONE";
    }

}
