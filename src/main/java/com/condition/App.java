package com.condition;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

            Scanner clavier = new Scanner (System.in);
            int  salaireHeure = 15;
            
            System.out.println(" Votre nombre d'heures travaillées dans la semaine ");
            int  HeuresTravaillees= clavier.nextInt();

            while (HeuresTravaillees < 0 || HeuresTravaillees > 42) {
                 System.out.println(" Votre nombre d'heures travaillées dans la semaine ");
                 HeuresTravaillees= clavier.nextInt();
            }

            if (HeuresTravaillees >= 0 && HeuresTravaillees <= 42) {
                int SalaireSemaine = HeuresTravaillees*15;
                System.out.println("Votre salaire de la semaine est de " + SalaireSemaine );
            }
    }
    
}
