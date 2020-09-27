package com.child;

import com.parent.Personne;

import java.util.ArrayList;

public class Employee extends Personne {

    private int salaire;
    private int nombreHeureParSemaine;
    public static int instanceCount = 0;
    private static ArrayList<Employee> listeEmploye = new ArrayList<>();

    protected Employee(String nom, String prenom, int age, int salaire, int nombreHeureParSemaine) {
        super(nom, prenom, age);
        setSalaire(salaire);
        setNombreHeureParSemaine(nombreHeureParSemaine);
        instanceCount++;
        ajoutEmploye(this);
    }

    @Override
    public void presentation(){
        System.out.println("Bonjour je suis "+getNom()+" "+getPrenom()+" et j'ai "+getAge()+" ans.");
        System.out.println("Je gagne "+getSalaire()+" et je travail "+getNombreHeureParSemaine()+" heures par semaines");
    }

    public static ArrayList getArrayList()
    {
        return Employee.listeEmploye;
    }

    public static void ajoutEmploye(Employee e){
        Employee.listeEmploye.add(e);
    }
    public static void afficheListe()
    {
        for (int i = 0 ; i < Employee.getArrayList().size();i++){
            System.out.println(Employee.getArrayList().get(i).toString());
        }
    }
    public int getSalaire() {
        return salaire;
    }

    public int getNombreHeureParSemaine() {
        return nombreHeureParSemaine;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public void setNombreHeureParSemaine(int nombreHeureParSemaine) {
        this.nombreHeureParSemaine = nombreHeureParSemaine;
    }

    @Override
    public String toString()
    {
        return this.getNom() ;
    }

}
