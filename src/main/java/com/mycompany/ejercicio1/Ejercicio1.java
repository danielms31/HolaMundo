/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Distancia
 */
public class Ejercicio1 {
    // Inicializamos nuestras variables
    public float aforo;
    public float entradas;
    public float precio;
    public float recaudado;
    public float porcentaje;

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Solicitamos al usuário la información
        System.out.println("Da el número del aforo");
        float aforo = scanner.nextFloat();
        System.out.println("Da las entradas vendidas");
        float entradas = scanner.nextFloat();
        System.out.println("Dame el precio de la entrada");
        float precio = scanner.nextFloat();
        
        // Calculamos el porcentaje del aforo vendido
        float porcentaje = (entradas *100)/ aforo;
        
        //Con un if comprobamos el porcentaje y mostramos los pposibles resultados por pantalla
        if (porcentaje<=20){
            System.out.println("CONCIERTO CANCELADO"); 
        }
        else if(porcentaje<=50){
            System.out.println("Entradas rebajadas un 25%");
        }else{
            //Calculamos la recaudación quetenemos y la mostramos
            float recaudado = entradas * precio;
            System.out.println("Dinero recaudado: "+recaudado);   
        }
        
    }
}
