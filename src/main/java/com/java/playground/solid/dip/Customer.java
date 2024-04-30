package com.java.playground.solid.dip;

import java.util.List;


// Ce code respecte bien le principe d'injection de dépendances, Customer ne référence que des abstractions et non des implémentations (comme Hotel et Spa).
// Un des avantages de ce code est qu'il sera facile d'ajouter d'autres types de réservations.
// donc on utilise l'abstraction
public class Customer {
    private final List<Booking> bookings;

    public Customer(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public void getBookingDetails() {
        bookings.forEach(booking -> {
            booking.price();
        });
    }
}
