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
public class Panier {
    private ArrayList<Produit> produits;

    //Constructeur
    public Panier(){
        this.produits = new ArrayList<>();
    }

    // Methodes
    public void ajouterProduit(Produit produit){
        produits.add(produit);
    }

    public void supprimerProduit(Produit produit){
        produits.remove(produit);
    }

    public void afficherPanier(){
        for(Produit produit : produits){
            produit.afficherDetails();
        }
    }

    public double calculerTotal(){
        double total = 0;

        for(Produit produit : produits){
            total += produit.getPrix();
        }

        return total;
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