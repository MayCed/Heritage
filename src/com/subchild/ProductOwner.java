package com.subchild;

import com.child.Employee;

public class ProductOwner extends Employee {

    String methode;

    public ProductOwner(String nom, String prenom, int age, int salaire, int nombreHeureParSemaine, String methode) {
        super(nom, prenom, age, salaire, nombreHeureParSemaine);
        this.methode = methode;
    }

    public void methodeTravail(){
        System.out.println("Bonjour je suis le Product owner et j'utilise la methode "+ methode+".");
    }
}
