package arrays;

import java.util.Scanner;

public class tdinput_search {
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

        int x = scn.nextInt();

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(numbers[i][j]==x){
                    System.out.println("x found at ("+i+","+j+")");
                }
            }
        }

    }
}
