package arrays;

import java.util.*;


public class tdinput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();

        int[][] numbers = new int[row][col];

        for(int i=0; i<row; i++){

            for(int j=0; j<col; j++){
                numbers[i][j]= scn.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

    }
}
