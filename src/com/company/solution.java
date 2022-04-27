package com.company;

import java.util.*;
public class solution
{
    public static int find_max_product(int[] nums)
    {
        int max_pair_product = Integer.MIN_VALUE;
        int max_i = -1, max_j = -1;

        for (int i = 0; i < nums.length - 1; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (max_pair_product < nums[i] * nums[j])
                {
                    max_pair_product = nums[i] * nums[j];
                    max_i = i;
                    max_j = j;
                }
            }
        }

        int ar1=nums[max_i];
        int ar2=nums[max_j];

       String numSt1= Integer.toString(ar1);

       String numSt2=Integer.toString(ar2);

    String arrProd=Integer.toString(max_pair_product);
        String numSt=numSt1+","+numSt2;
        System.out.println("Pair is "+arrProd);
return max_pair_product;
    }

    public static void main (String[] args)
    {
        int[] nums =new int[] { 2, 3, 5, 9, -7, 5, 8, -5 };
        String numStr = Arrays.toString(nums);
       System.out.println("\nOriginal array: "+numStr);
        find_max_product(nums);
    }
}