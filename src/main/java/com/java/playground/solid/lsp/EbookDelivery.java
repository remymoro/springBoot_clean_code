package com.java.playground.solid.lsp;

/**
 * Classe EbookDelivery qui étend BookDelivery.
 *
 * Problème de conception:
 * Cette classe viole le principe de substitution de Liskov, qui stipule que les objets de la classe de base (BookDelivery)
 * doivent pouvoir être remplacés par des objets des sous-classes (EbookDelivery) sans affecter l'exactitude du programme.
 * Or, dans le cas d'EbookDelivery, la méthode getDeliveryLocation() de la classe BookDelivery n'est pas applicable
 * puisque les ebooks, étant des produits numériques, ne nécessitent pas de localisation physique pour la livraison.
 *
 * Impact de cette violation:
 * Implémenter cette méthode ici force la sous-classe à adopter des comportements qui ne lui sont pas naturels,
 * menant à des implémentations problématiques comme lever une exception ou retourner des valeurs non pertinentes.
 * Cela peut induire en erreur d'autres parties du programme qui s'attendraient à une implémentation fonctionnelle de cette méthode.
 *
 * Solution proposée pour respecter Liskov:
 * 1. Ne pas hériter EbookDelivery de BookDelivery si la hiérarchie requiert l'implémentation de getDeliveryLocation().
 * 2. Créer une interface DeliveryLocation spécifique pour les produits nécessitant une localisation physique.
 * 3. Faire hériter BookDelivery et d'autres livraisons physiques de cette interface.
 * 4. Utiliser une classe de base différente ou une interface spécifique pour les livraisons numériques, comme OnlineDelivery, qui ne nécessiterait pas cette méthode.
 *
 * Implémentation alternative suggérée:
 * Au lieu de lever une exception, la méthode pourrait être omise ou EbookDelivery ne devrait pas étendre BookDelivery.
 */
//public class EbookDelivery extends BookDelivery {

  //  @Override
    //public void getDeliveryLocation() {
        // Problème: les ebooks n'ont pas de location physique pour la livraison.
        // Lever une exception souligne que cette méthode ne devrait pas être appelée ou implémentée dans ce contexte.
  //      throw new UnsupportedOperationException("Ebook delivery does not have a physical location.");
   // }
//}


/**
 * Classe EbookDelivery adaptée pour gérer les livraisons de livres électroniques.
 *
 * Changements par rapport à la version précédente:
 * Au lieu d'étendre BookDelivery, qui impliquait une incompatibilité avec le principe de substitution de Liskov,
 * cette version hérite de OnlineDelivery. Ce changement résout le problème précédent où EbookDelivery était obligée
 * d'implémenter getDeliveryLocation(), une méthode inapplicable aux ebooks qui n'ont pas de localisation physique de livraison.
 *
 * Avantages de cette approche:
 * - Respect du principe de substitution de Liskov: EbookDelivery peut maintenant servir de remplacement valide
 *   sans implémenter des comportements inadéquats pour sa nature numérique.
 * - Meilleure séparation des préoccupations: en héritant de OnlineDelivery, EbookDelivery est correctement alignée
 *   avec d'autres types de livraisons numériques, ce qui simplifie la gestion des fonctionnalités spécifiques aux produits numériques.
 *
 * Fonctionnalité actuelle:
 * - La méthode getWebsiteOptions() permet à EbookDelivery de gérer des options spécifiques à la livraison de contenus numériques,
 *   telles que les configurations de téléchargement ou les options spécifiques aux plateformes de distribution en ligne.
 *
 * Cette restructuration assure que la classe EbookDelivery est mieux adaptée à son rôle et évite les problèmes de conception
 * inhérents à l'ancienne hiérarchie de classe, améliorant ainsi la cohérence et la maintenabilité du code.
 */
public class EbookDelivery extends OnlineDelivery {

    @Override
    public void getWebsiteOptions() {
        // Méthode spécifique à la gestion des options de sites web pour les ebooks.
        // Cette fonction pourrait inclure la configuration des formats de téléchargement, les restrictions d'accès,
        // ou d'autres paramètres pertinents pour les ebooks.
        System.out.println("Getting website options");
    }
}