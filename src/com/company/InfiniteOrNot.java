package com.company;

public class InfiniteOrNot {
public static double d1f_ToDouble (boolean d1f){
  //  System.out.println(dn1+1);
    if (d1f) {
        return 1;
    }
    return 0;
}
public static double d1f_ToDouble0(double d1f){
    return d1f;
}

    public static double d2f_ToDouble (boolean d2f){
        //  System.out.println(dn1+1);
        if (d2f) {
            return 1;
        }
        return 0;
    }
    public static double d2f_ToDouble0(double d2f){
        return d2f;
    }
    public static double d3f_ToDouble (boolean d3f){
        //  System.out.println(dn1+1);
        if (d3f) {
            return 1;
        }
        return 0;
    }
    public static double d3f_ToDouble0(double d3f){
        return d3f;
    }

    public static double f1f_ToDouble (boolean f1f){
        //  System.out.println(dn1+1);
        if (f1f) {
            return 1;
        }
        return 0;
    }
    public static double f1f_ToDouble0(double f1f){
        return f1f;
    }
    public static double f2f_ToDouble (boolean f2f){
        //  System.out.println(dn1+1);
        if (f2f) {
            return 1;
        }
        return 0;
    }
    public static double f2f_ToDouble0(double f2f){
        return f2f;
    }
    public static double f3f_ToDouble (boolean f3f){
        //  System.out.println(dn1+1);
        if (f3f) {
            return 1;
        }
        return 0;
    }
    public static double f3f_ToDouble0(double f3f){
        return f3f;
    }



    public static void main(String[] args) {
        double dn1=0.000213456321d;
        boolean d1f= Double.isFinite(dn1);
        //getd1f();
        Double dn2=dn1/0;
        boolean  d2f=Double.isFinite(dn2);
        Double dn3=Double.POSITIVE_INFINITY*0;
        boolean d3f=Double.isFinite(dn3);
        System.out.println("\nFinite doubles\n--------------");
        System.out.println("Is "+dn1+ "is finite? "+d1f);
        System.out.println("Is "+dn2+" (dn1/0) is finite ?"+d2f);
        System.out.println("Is "+dn3+"is finite? "+d3f);
        Float fn1=5.3f;
        boolean f1f=Float.isFinite(fn1);
        Float fn2=fn1/0;
        boolean f2f=Float.isFinite(fn2);
        Float fn3=0f/0f;
        boolean f3f=Float.isFinite(fn3);
        System.out.println("\n\nFinite floats\n--------------");
        System.out.println("Is "+fn1+ "is finite? "+f1f);
        System.out.println("Is "+fn2+"(fn1/0) is finite? "+f2f);
        System.out.println("Is "+fn3+"is finite? "+f3f);
    }
}
