/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmagasin;

import java.util.ArrayList;

/**
 *
 * @author basti
 */
public class Magasin {
    private ArrayList<Produit> produits;

    //Constructeur
    public Magasin(){
        this.produits = new ArrayList<>();
    }

    // Methodes
    public void ajouterProduit(Produit produit){
        produits.add(produit);
    }

    public void afficherProduitsDisponibles(){
        for(Produit produit : produits){
            produit.afficherDetails();
        }
    }

    public Produit trouverProduitParNom(String nom){
        for(Produit produit : produits){
            if(produit.getNom().equalsIgnoreCase(nom)){
                return produit;
            }
        }

        return null;
    }

    // Getters
    public ArrayList<Produit> getProduits(){
        return produits;
    }

    // Setters
    public void setProduits(ArrayList<Produit> produits){
        this.produits = produits;
    }
}