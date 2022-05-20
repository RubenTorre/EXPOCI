/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.expoci;

/**
 *
 * @author LENOVO
 */
   import java.util.Scanner;
public class EXPOCI {

    public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un radio");
        double radio=sc.nextDouble();
  
        //Formula area circulo, usamos algunos de los metodos de Math
        double area=Math.PI*Math.pow(radio, 2);
  
        System.out.println("El area del circulo es "+area);
 
    }
}
