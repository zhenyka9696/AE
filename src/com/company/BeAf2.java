package com.company;

public class BeAf2 {
    public static String firstInLast(String str){
String Y="Yes!";
String N="No!";
       if (str.length()<2) str= N;
       else if (str.substring(0,2).equals(str.substring(str.length()-2, str.length())))
          str= Y;
       else
           str=N;
     return str;
    }

    public static void main(String[] args) {
            String str1="educated";
            String str2="educating";
            System.out.println("The given string is: " +str1);
        System.out.println("The given string is: " +str2);
            System.out.println("The first two characters appear in the last is: "+ firstInLast(str1));
        System.out.println("The first two characters appear in the last is: "+ firstInLast(str2));
    }
}
