/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraction;

/**
 *
 * @author khali
 */
public abstract class Animal { // access (public,protected) abstract class {Nomdeclass}
    String nom;
    String lieu;
    boolean poils;
    
    public void sleep() {
System.out.println("Zzz");
}
    public abstract void animalSound();
    //public abstract void animalSound(){}; déclaration incorrecte
public abstract void manger();

public abstract void courir(int vitesse);
    
    
}
