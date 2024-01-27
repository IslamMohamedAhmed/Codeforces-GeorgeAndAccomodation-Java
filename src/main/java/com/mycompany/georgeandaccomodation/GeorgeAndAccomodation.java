/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.georgeandaccomodation;

/**
 *
 * @author Islam Mohamed
 */
import java.util.*;

public class GeorgeAndAccomodation {

    public static void main(String[] args) {
        int n, sum = 0;
        int[] p = new int[105];
        int[] q = new int[105];
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
           p[i] = scan.nextInt();
           q[i] = scan.nextInt();
           if(q[i]-p[i]>=2){
               sum++;
           }
        }
        System.out.println(sum);
    }
}
