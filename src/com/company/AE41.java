package com.company;
import java.lang.*;

public class AE41 {
    public static void main(String[] args) {
        int arr[]=new int[]{5,7,-8,5,14,1};
        int first_element, second_element,arr_size= arr.length;;
        first_element=second_element=Integer.MAX_VALUE;
        for(int i=0; i<arr_size;i++)
        {
            if(arr[i]<first_element)
        {
            second_element=first_element;
            first_element=arr[i];
        }
            else if (arr[i]<second_element&&arr[i]!=first_element)
                second_element=arr[i];
        }
        if(second_element==Integer.MAX_VALUE)
            System.out.println("No second smallest element");
        else
System.out.println
        ("The smallest number is "+first_element +
                " and the second smallest number is " + second_element+".");
       // FE(first_element);
       // SE(second_element);
    }
    public static int[] FE(int [] first_element)
    {
        /*System.out.println( first_element);
        return new int[]{first_element};*/
        return first_element;
    }

    public static int [] SE(int [] second_element)
    {
        /*System.out.println(second_element);
        return new int[]{second_element};*/
        return second_element;
    }
}
