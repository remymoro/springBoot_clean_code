package com.java.playground.cleancode.yagni;

// YAGNI (You Ain't Gonna Need It) est un principe qui consiste à éviter d'ajouter du code pour des fonctionnalités futures potentielles,
// surtout celles basées uniquement sur des suppositions.
// L'idée est de ne pas anticiper mais de se concentrer sur ce dont on a besoin maintenant.
// Par exemple, pour les fonctionnalités de base d'un site e-commerce, on peut avoir cette classe pour représenter les produits :

public class Product {
    private String name;            // Nom du produit, essentiel pour identifier chaque article.
    private double price;           // Prix du produit, nécessaire pour effectuer des transactions commerciales.
    private int quantity;           // Quantité en stock, important pour la gestion des inventaires.

    // Nouveaux attributs pour l'information du fournisseur
    private String supplierName;    // Nom du fournisseur, actuellement initialisé mais non utilisé.
    private String supplierContact; // Contact du fournisseur, également initialisé mais non utilisé pour l'instant.

    /**
     * Constructeur pour initialiser le produit avec les informations essentielles.
     * Les informations sur le fournisseur sont initialisées à des valeurs par défaut, ce qui anticipe une possible
     * extension future sans ajouter de complexité immédiate.
     */
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

        // Initialize supplier information to default values
        // Cette initialisation est faite pour maintenir une structure flexible, mais elle pourrait
        // enfreindre le principe YAGNI puisque ces informations ne sont pas actuellement nécessaires.
        this.supplierName = "";
        this.supplierContact = "";
    }
}

// Ici, on suppose que le développeur a voulu anticiper la suite des évolutions en donnant la possibilité de fournir les informations sur le fournisseur.
// Cependant, selon le principe YAGNI, cette fonctionnalité est pour le moment totalement inutile pour les besoins actuels du site.
// Cela pourrait même conduire à une complexité inutile et à des coûts de maintenance accrus sans avantage immédiat pour le produit ou les utilisateurs.
