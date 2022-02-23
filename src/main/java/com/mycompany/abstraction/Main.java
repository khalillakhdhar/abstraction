/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.abstraction;

/**
 *
 * @author khali
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Animal a=new Animal(); instanciation directe interdite
        Chat c=new Chat();
        c.nom="chaton";
        c.lieu="paris";
        c.poils=true;
        c.animalSound();
    }
    
}
