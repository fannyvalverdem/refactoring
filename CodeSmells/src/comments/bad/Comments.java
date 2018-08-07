/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comments.bad;

/**
 *
 * @author Fanny
 */
public class Comments {
     public static void main(String[] args) {
    int array_a[]={1,2,3,4};
    int array_b[]={5,6,7,8};;
    int sum_a = 0;
    for (int i = 0; i < 5; i++) {
        sum_a += array_a[i];
    }
    int average_a = sum_a / 4;
    int sum_b = 0;
    for (int j = 0; j < 4; j++){
        sum_b += array_b[j];
    }
    int average_b = sum_b / 4;
    }
}

