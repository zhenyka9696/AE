package com.company;
import java.util.Arrays;

public class Arrays10 {
    static int max;
    static int min;

    public static int mini(int my_array[]) {
min = my_array[0];
        int len = my_array.length;

        for (int i = 1; i < len - 1; i = i + 2) {
            if (i + 1 > len) {
if (my_array[i + 1] < min) min = my_array[i];
            }
            if (my_array[i] > my_array[i + 1]) {
if (my_array[i + 1] < min) min = my_array[i + 1];
            }
            if (my_array[i] < my_array[i + 1]) {
                if (my_array[i] < min) min = my_array[i];
            }
        }
return min;
    }

    public static int maxi(int my_array[]) {
        max = my_array[0];
int len = my_array.length;

        for (int i = 1; i < len - 1; i = i + 2) {
            if (i + 1 > len) {
                if (my_array[i] > max) max = my_array[i];
            }
            if (my_array[i] > my_array[i + 1]) {
                if (my_array[i] > max) max = my_array[i];
            }
            if (my_array[i] < my_array[i + 1]) {
if (my_array[i + 1] > max) max = my_array[i + 1];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] my_array=new int[] {25,12,56,15,36,56,79,18,29,49};
        mini(my_array);
        maxi(my_array);
        System.out.println("Original Array: " + Arrays.toString(my_array));
        System.out.println("Maximum value for the above array= "+max);
        System.out.println("Minimum value for the above array= "+min);
    }
}