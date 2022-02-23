/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfacage;

/**
 *
 * @author khali
 */
public class Employee {
    private String nom,prenom,grade;
    private int recrutement;
    private int id;
    private double salaire;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getRecrutement() {
        return recrutement;
    }

    public void setRecrutement(int recrutement) {
        this.recrutement = recrutement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Employee() {
    }

    public Employee(String nom, String prenom, String grade, int recrutement, int id, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.grade = grade;
        this.recrutement = recrutement;
        this.id = id;
        this.salaire = salaire;
    }
    
    
    
    
}
