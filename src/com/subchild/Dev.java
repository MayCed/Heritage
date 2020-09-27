package com.subchild;

import com.child.Employee;

public class Dev extends Employee {

    private String competence;

    public Dev(String nom, String prenom, int age, int salaire, int nombreHeureParSemaine, String competence) {
        super(nom, prenom, age, salaire, nombreHeureParSemaine);
        setCompetence(competence);
    }

    public void comp(){

        System.out.println("Je suis un dev et j'utilise "+competence);

    }

    public String getCompetence() {
        return competence;
    }

    public void setCompetence(String competence) {
        this.competence = competence;
    }

}
