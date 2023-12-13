/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.Arrays;

/**
 *
 * @author dadab
 */
public class Test {

    /**
     * @param args the command line argumentss
     */
    public static void main(String[] args) {
        int[][] matrix = {
  {1, 2, 3},
  {4, 5, 6},
  {7, 8, 9}
};
//System.out.println(Arrays.toString(matrix));
        //int element = matrix[0][1];

       for (int i = 0; i < matrix.length; i++) {
  for (int j = 0; j < matrix[i].length; j++) {
    System.out.println(matrix[i][j]);
  }
}

    }
    
}
