import com.java.playground.ioc.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Service pour la gestion des réservations.
 * Cette classe dépend du service PaymentService pour gérer les paiements associés aux réservations.
 * L'injection de dépendances via Spring permet de découpler la gestion des réservations
 * de la logique de traitement des paiements, ce qui améliore la modularité et la testabilité du code.
 *
 */
@Service
public class BookingService {
    // Injection automatique de l'instance de PaymentService.
    // Spring s'occupe de fournir une instance de cette interface lors de la création de l'objet BookingService.
    // Cette approche est préférable car elle permet d'injecter différentes implémentations de PaymentService
    // sans modifier le code de BookingService.
    // le qualifier est utilisé pour spécifier le bean à injecter

    @Autowired
    //Pour relier des beans entre eux, afin qu'ils puissent collaborer pour former les fonctionnalités et l'intelligence de notre application, l'annotation @Autowired est très utile.
    @Qualifier("paypalPaymentService")
    private PaymentService paymentService;

    /**
     * Utilisez le service de paiement pour traiter tous les paiements nécessaires pour les réservations effectuées.
     * Cette méthode pourrait être appelée, par exemple, lors de la confirmation d'une réservation pour effectuer le paiement.
     *
     * @param amount Montant à payer.
     * @return Confirmation du paiement.
     */
    public String processPayment(double amount) {
        return paymentService.pay(amount);
    }
}
