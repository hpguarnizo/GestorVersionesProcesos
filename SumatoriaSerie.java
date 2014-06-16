/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sumatoriaserie;

import java.util.Scanner;

/**
 *
 * @author PRINCIPAL
 */
public class SumatoriaSerie {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
          
    
        int contSigno=1,cont=1;
        
        
        Scanner sc=new Scanner(System.in);
        
        //Para calcular numeros fibonacci que se intercalan entre numerador y denominador
        System.out.println("ingrese el límite de la serie");  
        int num=sc.nextInt();
        int []fibo= new int[num];   
        int []primos= new int[num];   
        int a=0;
        int b=1;
        int serie=0;        
        fibo[0]=a+b;
        for (int i=1;i<num;i++)
        {
            serie=a+b;
            fibo[i]=serie;
            a=b;
            b=serie;
            
        }
        //Calcular los n primos que se intercalan entre numerador y denominador
        int posicion=0;
        int c = 1;
        int p = 3;
        int d = 2;
        primos[0]=p;
        while (c <= num) {
           if (p % d == 0) {
              if (p == d) {
                 primos[posicion]=p;
                 posicion++;
                 c++;
              }
              d = 2;
              p++;
           }
           else
              d++;
        } 
        int pos=0;
        int numerador,denominador,raiz,exp;
        double termino;
        double Sumatoria=0;
        for(int k=1;k<=num;k++){
            if (k%2==0){
                numerador=fibo[pos];
                denominador= primos[pos];
                raiz= numerador+denominador;
                termino= -(Math.pow((numerador/denominador),1/raiz));              
                pos++;
                Sumatoria+=termino;                
                
            }else
                {
                numerador=primos[pos];
                denominador= fibo[pos];
                exp= numerador-denominador;
                termino= +Math.pow((numerador/denominador),exp); 
                pos++;
                Sumatoria+=termino;
                   
                }                
            }
        System.out.println("El resultado de la sumatoria es "+Sumatoria);
        
       
        }
}

    

