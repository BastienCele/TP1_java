/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmagasin;

/**
 *
 * @author basti
 */
public class Produit {
    private int id;
    private String nom;
    private float prix;
    private int quantite;
    
    // Constructeur
    public Produit(int id, String nom, float prix, int quantite){
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }
    
    //Methodes
    
    public void afficherDetails(){
        System.out.println("Id : "+this.id);
        System.out.println("Nom : "+this.nom);
        System.out.println("Prix : "+this.prix);
        System.out.println("Quantite : "+this.quantite);
    }
    
    // Getters
    public int getId(){
        return id;
    }
    
    public String getNom(){
        return nom;
    }
    
    public float getPrix(){
        return prix;
    }
    
    public int getQuantite(){
        return quantite;
    }
    
    // Setters
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public void setPrix(float prix){
        this.prix = prix;
    }
    
    public void setQuantite(int quantite){
        this.quantite = quantite;
    }
   
}
