package com.company;
import java.util.*;

public  class MathE18 {
   public static int count_nums_not_7(int num)
    {int result=0;
        if (num < 7)
            return num;
        if (num >= 7 && num < 10)
            return num-1;

        int r = 1;
        while (num/r > 9)
            r = r*10;

        int m = num/r;

        if (m != 7)
            result=  count_nums_not_7(m)*count_nums_not_7(r - 1) + count_nums_not_7(m) + count_nums_not_7(num%r);
        else
            result= count_nums_not_7(m*r - 1);
        return result;
    }

    public static void main(String[] args) {
        int num = 1;
        if (num>0)
            System.out.println("Count the numbers without digit 7, from 1 to "+num+": "+count_nums_not_7(num));
    }
}
