package com.parent;

public abstract class Personne {


    private String nom;
    private String prenom;
    private int age;


    protected Personne(String nom, String prenom, int age) {
        setNom(nom);
        setPrenom(prenom);
        setAge(age);

    }
    protected void presentation(){
            System.out.println("Bonjour je suis "+this.prenom+" "+this.nom+" et j'ai "+this.age+" ans.");
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
