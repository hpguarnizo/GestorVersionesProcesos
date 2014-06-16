/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Fibonacci;

import java.util.Scanner;

/**
 *
 * @author PRINCIPAL
 */
public class Fibonacci {
    public static void main(String[] args) {
        
        String serie="";
        //La variable n cuántos números de la serie deseamos genera
        Scanner sc=new Scanner(System.in);
        System.out.println("Cuántos números fibonacci desea generar?");  
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            
            //En estas 2 instrucciones obtenemos los términos 1 +/- Raiz(5) dividido para 2
            double termino1 = ( 1 + Math.sqrt(5) ) / 2;
            double termino2 = ( 1 - Math.sqrt(5) ) / 2;
            
            /*En esta instrucción multiplicamos el término 1/Raíz(5) y lo multiplicamos por los términos anteriores y lo 
            elevamos a la potencia*/            
            double fibonacci =Math.floor( Math.pow(termino1, i)*(1/Math.sqrt(5))) - (Math.floor( Math.pow(termino2, i)*(1/Math.sqrt(5))) );                        
            
            //Unimos cada término de la serie para posteriormente presentarlo
            serie=(int)fibonacci+ ",";
            
            //Presentación de la serie fibonacci
            System.out.print(serie);  
             
            }
        
            }  
//cambio implementado para  probar configuración 15/06/2014
    }        
        
        
            
            
            
        
    
    

