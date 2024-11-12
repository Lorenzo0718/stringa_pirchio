/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minuscolo;

/**
 *Pirchio Lorenzo 4.inf.D 12/11/2024
 *
 *
 */

import java.util.Scanner;
public class Minuscolo {

    static final int TANTI = 30;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String parola;                                                          // stringa come oggetto
        char[] minuscolo = new char[TANTI];                                     // stringa coma array
        System.out.print("\nInserisci una parola : ");
        parola = in.next();                                                     // legge una stringa
        // trasforma la stringa letta in un array di caratteri
        for(int x = 0; x < parola.length(); x++){
            minuscolo[x] = parola.charAt(x);                               //primo carattere letto
        }
        //trasforma la parola in minuscolo
        for(int x = 0; x < parola.length(); x++){
        minuscolo[x] = Character.toLowerCase(minuscolo[x]);                     // in minuscolo
    }   
        System.out.print("la parola in minuscolo (array) : ");
        // visualizza la parola carattere per carattere
        for (int x = 0; x < minuscolo.length; x++){
             System.out.print(minuscolo[x]);
        }
        
        // trasformo da array di caratterI a stringa
        String parolaMinu = new String(minuscolo);
        System.out.print("\nLa parola in minuscolo (oggetto): ");
        System.out.print(parolaMinu);
    }   
}
