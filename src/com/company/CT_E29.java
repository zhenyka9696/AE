package com.company;

public class CT_E29 {
    public static void main(String[] args) {
        long n=123456l;
        if (n<0)
        {
            n*=-1;
        }
        if(n>=1000000l)
        {
            System.out.println("You want to much from me!");
        }
        else {
            CalculateDigits(n);
            /*int digits=1;
            if(n>=10&&n<100)
            {digits=2;}
            else if(n>=100&&n<1000)
            {digits=3;}
            else if(n>=1000&&n<10000)
            {digits=4;}
            else if(n>=10000&&n<100000)
            {digits=5;}
            else if(n>=100000&&n<1000000)
            {digits=6;}*/

        }
      }
      public static int Digits(int digits){
        return digits;
      }
      public static int CalculateDigits(long n){
          int digits=1;
          if(n>=10&&n<100)
          {digits=2;}
          else if(n>=100&&n<1000)
          {digits=3;}
          else if(n>=1000&&n<10000)
          {digits=4;}
          else if(n>=10000&&n<100000)
          {digits=5;}
          else if(n>=100000&&n<1000000)
          {digits=6;}
          System.out.println("Number of digits in the number = "+digits);
          return digits;

      }
}
