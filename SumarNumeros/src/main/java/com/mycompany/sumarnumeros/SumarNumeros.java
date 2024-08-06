/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumarnumeros;
import java.util.Scanner;

public class SumarNumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diseño;
        int diseño2;
        int resultado;
        diseño = sc.nextInt();
        diseño2 = sc.nextInt();
        resultado = (diseño * diseño2)/2;
        System.out.println("el resutado es: "+ resultado);
        
        
    }
}
