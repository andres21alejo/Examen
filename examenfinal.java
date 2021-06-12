
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Luis
 */
public class examenfinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner RMT = new Scanner(System.in);
        int [] digito = new int [10];
        int aux, mayor,menor;
        System.out.println("Ingrese 10 números");
        for (int a = 0; a < 10; a++) {
            digito [a] = RMT.nextInt();
        }
         mayor = menor = digito [0];
            for (int a = 0; a < 10; a++){
                if (digito [a] > mayor){
                    mayor = digito[a];
                }
                if (digito [a] < menor){
                    menor = digito[a];
            } 
        }
        for (int a = 0; a < 10 - 1; a++) {
            for (int c = 0; c < 10 - 1; c++) {
                if (digito [c] > digito[c+1]) {
                    aux = digito[c];
                    digito[c] = digito[c+1];
                    digito [c+1] = aux;
                }
            }
        }
        System.out.println("Arreglo creciente");
        for (int a = 0; a < 10; a++) {
            System.out.println(digito[a]);
        }
        System.out.println("Arreglo decreciente");
        for (int a = 10 -1; a >= 0; a--) {
            System.out.println(digito[a]);
        }
        System.out.println("Número Mayor\t"+mayor+"\nNúmero Menor\t"+menor);
    }
}
    
    

