package org.example.o3_NumbersAndStrings;

public class Strings {

    public void chars() {
        char ch = 'a';
        char uniChar = '\u03A9';
        char[] charArray = { 'a', 'b', 'c', 'd', 'e' };

        Character chObj = Character.valueOf('a');
    }

    public void string() {
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);
        System.out.println(helloString);

        int len = helloString.length();
    }

    public void concatenate() {
        var string1 = "One";
        var string2 = "World";

        string1.concat(string2);
        "My name is ".concat("Rumplestiltskin");
        var string3 = "Hello," + string1 + "!";
    }

    public void multiline() {
        String quote = "Now is the time for all good "
                + "men to come to the aid of their country.";

        String html = """
            <html>
                <body>
                    <p>Hello, world</p>
                </body>
            </html>
        """;
    }

    public void formating() {
        int intVar = 500;
        float floatVar = 3.65f;
        String stringVar = "Custom string";

        System.out.printf("Float = %f;  integer = %d; %n string = %s %n%n", floatVar, intVar, stringVar);

        String fs;
        fs = String.format("Float = %f;  integer = %d; %n string = %s %n%n", floatVar, intVar, stringVar);
        System.out.println(fs);
    }

    public void convert() {
        var floatString = "32.2";

        Float floatObj = Float.valueOf(floatString);
        float floatVar = floatObj.floatValue();

        int i = 10;
        String s1 = "" + i;
        String s2 = String.valueOf(i);
        String s3 = Integer.toString(i);

    }
}
