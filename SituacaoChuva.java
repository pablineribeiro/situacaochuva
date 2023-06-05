/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author senai
 */
public class SituacaoChuva {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     
        System.out.println("Está Chovendo? s/n");
        String resposta;
        Scanner scanner= new Scanner (System.in);
        resposta= scanner.next();
        
    
    
    if(resposta.equals("s")){
                System.out.println("Voce Disse que está chovendo");
           
       
    }else if(resposta.equals("n")){
                System.out.println("Voce Disse que Não está chovendo");
            }
    else {
                System.out.println("Não entendi!");
            }
    }
    
}

