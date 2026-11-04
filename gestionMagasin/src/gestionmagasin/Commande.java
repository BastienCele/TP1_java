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
public class Commande {
    private int idCommande;
    private Client client;
    private ArrayList<Produit> produitsCommandes;
    private double total;

    //Constructeur
    public Commande(int idCommande, Client client, Panier panier){
        this.idCommande = idCommande;
        this.client = client;
        this.produitsCommandes = new ArrayList<>(panier.getProduits());
        this.total = panier.calculerTotal();
    }

    // Methodes
    public void afficherDetailsCommande(){
        System.out.println("Id commande : "+this.idCommande);

        System.out.println("Informations du client :");
        this.client.afficherDetails();

        System.out.println("Produits commandés :");
        for(Produit produit : produitsCommandes){
            produit.afficherDetails();
        }

        System.out.println("Total de la commande : "+this.total+" euros");
    }

    // Getters
    public int getIdCommande(){
        return idCommande;
    }

    public Client getClient(){
        return client;
    }

    public ArrayList<Produit> getProduitsCommandes(){
        return produitsCommandes;
    }

    public double getTotal(){
        return total;
    }

    // Setters
    public void setIdCommande(int idCommande){
        this.idCommande = idCommande;
    }

    public void setClient(Client client){
        this.client = client;
    }

    public void setProduitsCommandes(ArrayList<Produit> produitsCommandes){
        this.produitsCommandes = produitsCommandes;
    }

    public void setTotal(double total){
        this.total = total;
    }
}