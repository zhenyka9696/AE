package com.company;

import java.util.Arrays;
public class AE3 {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        int[][] arr = new int[a][b];
        arr[0][0] = 5;//записали значение 5 в ячейку на пересечении нулевой строки и нулевого столбца
        arr[0][1] = 7; //записали значение 7 в ячейку на пересечении нулевой строки и первого столбца
        arr[0][2]  = 3;
        arr[0][3] = 17;
        arr[0][4] = 17;
        arr[0][5] = 17;
        arr[0][6] = 17;
        arr[0][7] = 17;
        arr[0][8] = 17;
        arr[0][9] = 17;
        arr[1][0] = 7;
        arr[1][1] = 0;
        arr[1][2] = 1;
        arr[1][3] = 12;
        arr[1][4] = 12;
        arr[1][5] = 12;
        arr[1][6] = 12;
        arr[1][7] = 12;
        arr[1][8] = 12;
        arr[1][9] = 12;
        arr[2][0] = 8;
        arr[2][1] = 1;
        arr[2][2] = 2;
        arr[2][3] = 3;
        arr[2][4] = 3;
        arr[2][5] = 3;
        arr[2][6] = 3;
        arr[2][7] = 3;
        arr[2][8] = 3;
        arr[2][9] = 3;
        arr[3][0] = 3;
        arr[3][1] = 3;
        arr[3][2] = 3;
        arr[3][3] = 3;
        arr[3][4] = 3;
        arr[3][5] = 3;
        arr[3][6] = 3;
        arr[3][7] = 3;
        arr[3][8] = 3;
        arr[3][9] = 3;
        arr[4][0] = 3;
        arr[4][1] = 3;
        arr[4][2] = 3;
        arr[4][3] = 3;
        arr[4][4] = 3;
        arr[4][5] = 3;
        arr[4][6] = 3;
        arr[4][7] = 3;
        arr[4][8] = 3;
        arr[4][9] = 3;
        arr[5][0] = 3;
        arr[5][1] = 3;
        arr[5][2] = 3;
        arr[5][3] = 3;
        arr[5][4] = 3;
        arr[5][5] = 3;
        arr[5][6] = 3;
        arr[5][7] = 3;
        arr[5][8] = 3;
        arr[5][9] = 3;
        arr[6][0] = 3;
        arr[6][1] = 3;
        arr[6][2] = 3;
        arr[6][3] = 3;
        arr[6][4] = 3;
        arr[6][5] = 3;
        arr[6][6] = 3;
        arr[6][7] = 3;
        arr[6][8] = 3;
        arr[6][9] = 3;
        arr[7][0] = 3;
        arr[7][1] = 3;
        arr[7][2] = 3;
        arr[7][3] = 3;
        arr[7][4] = 3;
        arr[7][5] = 3;
        arr[7][6] = 3;
        arr[7][7] = 3;
        arr[7][8] = 3;
        arr[7][9] = 3;
        arr[8][0] = 3;
        arr[8][1] = 3;
        arr[8][2] = 3;
        arr[8][3] = 3;
        arr[8][4] = 3;
        arr[8][5] = 3;
        arr[8][6] = 3;
        arr[8][7] = 3;
        arr[8][8] = 3;
        arr[8][9] = 3;
        arr[9][0] = 3;
        arr[9][1] = 3;
        arr[9][2] = 3;
        arr[9][3] = 3;
        arr[9][4] = 3;
        arr[9][5] = 3;
        arr[9][6] = 3;
        arr[9][7] = 3;
        arr[9][8] = 3;
        arr[9][9] = 3;
       // System.out.println(Arrays.deepToString(arr));
        for (a=0;a<10;++a){
            arr[a][b]=arr[a][b]-1;
            for (b=0;b<10;++b){
                arr[a][b]=arr[a][b]-1;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

}
