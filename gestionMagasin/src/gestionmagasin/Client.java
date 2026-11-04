/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmagasin;

/**
 *
 * @author basti
 */
public class Client {
    private int id;
    private String nom;
    private String email;
    
    //Constructeur
    public Client(int id, String nom, String email){
        this.id = id;
        this.nom = nom;
        this.email = email;
    }
    
    // Methodes
    public void afficherDetails(){
        System.out.println("Id : "+this.id);
        System.out.println("Nom : "+this.nom);
        System.out.println("Email : "+this.email);
    }
    
    // Getters
    public int getId(){
        return id;
    }
    
    public String getNom(){
        return nom;
    }
    
    public String getEmail(){
        return email;
    }
    
    // Setters
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
}
