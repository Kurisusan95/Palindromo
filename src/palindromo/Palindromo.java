/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindromo;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int num=0,pali=0;
        String dec;
        char arreglo[];
        do{
            System.out.print("Cuantos caracteres desea ingresar?");
            num = rd.nextInt();
            arreglo = new char[num];
            for(int i =0;i<arreglo.length;i++){
                arreglo[i]=rd.next().charAt(0);
            }
            for(int i =0;i<arreglo.length;i++){
                if(arreglo[i]==arreglo[arreglo.length-1-i]){
                    pali++;
                }
            }
            if(pali == arreglo.length){
                System.out.print("Es plindromo");
            }else{
                System.out.print("No es plindromo");
            }
            
            
            System.out.print("Desea repetir el proceso?");
            dec=rd.next();
        }while(dec.equalsIgnoreCase("si"));
    }
    
}
