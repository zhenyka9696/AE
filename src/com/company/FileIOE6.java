package com.company;

public class FileIOE6 {
    public static int Var1 (String str1){
        String str2="Java exercieses";
        int var1 = str1.compareTo( str2 );
        System.out.println("str1&str2 comparison: "+var1);
        return var1;
    }
    public static int Var2 (String str1){
        String str3="Java examples";
        int var2=str1.compareTo(str3);
        System.out.println("str1&str3 comparison: "+var2);
        return var2;
    }
    public static void main(String[] args) {
        String str1="Java exercieses";
        Var1(str1);
        Var2(str1);
       }
}
