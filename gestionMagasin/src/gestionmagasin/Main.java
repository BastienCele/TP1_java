/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmagasin;

import java.util.Scanner;

/**
 *
 * @author basti
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Création du magasin
        Magasin magasin = new Magasin();

        // Création des produits
        Produit p1 = new Produit(1, "Ordinateur", 800, 10);
        Produit p2 = new Produit(2, "Souris", 25, 20);
        Produit p3 = new Produit(3, "Clavier", 45, 15);
        Produit p4 = new Produit(4, "Ecran", 200, 8);

        // Ajout des produits au magasin
        magasin.ajouterProduit(p1);
        magasin.ajouterProduit(p2);
        magasin.ajouterProduit(p3);
        magasin.ajouterProduit(p4);

        // Création du client
        System.out.println("=== CREATION DU CLIENT ===");

        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();

        System.out.print("Entrez votre email : ");
        String email = scanner.nextLine();

        Client client = new Client(1, nom, email);

        // Création du panier
        Panier panier = new Panier();

        int choix;

        // Menu principal
        do {
            System.out.println("\n===== MENU MAGASIN =====");
            System.out.println("1. Afficher les produits disponibles");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Afficher le panier");
            System.out.println("4. Passer une commande");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine();
            switch (choix) {
                case 1:
                    // Afficher les produits disponibles
                    System.out.println("\n=== PRODUITS DISPONIBLES ===");
                    magasin.afficherProduitsDisponibles();
                    break;
                case 2:
                    // Ajouter un produit au panier
                    System.out.print("Entrez le nom du produit : ");
                    String nomProduit = scanner.nextLine();
                    Produit produit = magasin.trouverProduitParNom(nomProduit);
                    if (produit != null) {
                        if (produit.getQuantite() > 0) {
                            panier.ajouterProduit(produit);
                            produit.setQuantite(produit.getQuantite() - 1);
                            System.out.println("Produit ajouté au panier !");
                            System.out.println("Stock restant : " + produit.getQuantite());
                        } else {
                            System.out.println("Stock insuffisant !");
                        }
                    } else {
                        System.out.println("Produit introuvable !");
                    }
                    break;
                case 3:
                    // Afficher le panier
                    System.out.println("\n=== VOTRE PANIER ===");
                    panier.afficherPanier();
                    System.out.println("Total : "
                            + panier.calculerTotal() + " euros");
                    break;
                case 4:
                    // Passer une commande
                    if (panier.getProduits().isEmpty()) {
                        System.out.println("Votre panier est vide !");
                    } else {
                        Commande commande = new Commande(1, client, panier);
                        System.out.println("\n=== COMMANDE VALIDEE ===");
                        commande.afficherDetailsCommande();
                        panier = new Panier();
                    }

                    break;

                case 0:
                    System.out.println("Merci de votre visite !");
                    break;

                default:
                    System.out.println("Choix invalide !");
                    break;
            }

        } while (choix != 0);

        scanner.close();
    }
}