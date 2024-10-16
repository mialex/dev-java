package org.example.o3_NumbersAndStrings;

import java.text.DecimalFormat;
import static java.lang.Math.random;

public class Numbers {

    static public void customFormat(String pattern, double value ) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);

        System.out.println(value + "  " + pattern + "  " + myFormatter.format(value));
    }

    public void printFormated() {
        /*
         * @see https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Formatter.html
         */
        int intVar = 500;
        float floatVar = 3.65f;
        String stringVar = "Custom string";

        // %n - platform-independent newline character
        System.out.format("Float = %f;  integer = %d; %n string = %s %n%n", floatVar, intVar, stringVar);

        customFormat("###,###.###", 123456.789);
        customFormat("###.##", 123456.789);
        customFormat("000000.000", 123.78);
        customFormat("$###,###.###", 12345.67);


        System.out.format("Random: %d%n", (int)(random() * 10));
    }
}
