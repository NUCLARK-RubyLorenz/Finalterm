/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activitymd01;

/**
 *
 * @author User
 */
public class ActivityMD01 {

    public static void main(String[] args) {
        char[][] ask = new char[3][4];

        
        for (int i = 0; i < ask.length; i++) {
            for (int j = 0; j < ask[i].length; j++) {
                ask[i][j] = '*';
            }
        }

        
        for (int i = 0; i < ask.length; i++) {
            for (int j = 0; j < ask[i].length; j++) {
                System.out.print(ask[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}

