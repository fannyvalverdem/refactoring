/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comments.good;

import java.lang.reflect.Array;


/**
 *
 * @author Fanny
 */
public class Comments {
    public static void main(String[] args) {
        int array1[] = null;
        int array2[] = null;
        int average1 = calc_average_of_four(array1);
        int average2 = calc_average_of_four(array2);
    }
    public static int calc_average_of_four(int[] array) {
        int sum = 0;
        for (int i = 0; i < 4; i++)
            sum += array[i];

        return sum / 4;
    }
}

