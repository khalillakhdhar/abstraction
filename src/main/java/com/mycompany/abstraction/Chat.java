/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraction;

/**
 *
 * @author khali
 */
public class Chat extends Animal{
// implementation des méthodes abstraites obligation
    @Override
    public void animalSound() {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         System.out.println("miaou miaou");
    }

    @Override
    public void manger() {
         System.out.println("Je suis carnivore");
    }

    @Override
    public void courir(int vitesse) {
         System.out.println("Je cours à "+vitesse);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
