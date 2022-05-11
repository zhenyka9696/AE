package com.company;

public class Regular_expressionE30 {
    public static void main(String[] args) {
        String text = "Python Exercises";
        System.out.println("Original string: "+text);
        System.out.println("Insert a dash between an upper case letter and a lower case letter in the said string:\n"+validate(text));
        text = "The quick brown Fox jumps over the lazy Dog.";
        System.out.println("\nOriginal string: "+text);
        System.out.println("Insert a dash between an upper case letter and a lower case letter in the said string:\n"+validate(text));
        text = "java exercises";
        System.out.println("\nOriginal string: "+text);
        System.out.println("Insert a dash between an upper case letter and a lower case letter in the said string:\n"+validate(text));
    }

    public static String validate(String text) {
        String result=text.replaceAll("(?<=[A-Z])(?=[a-z])", "-");
        return result;
    }
}
