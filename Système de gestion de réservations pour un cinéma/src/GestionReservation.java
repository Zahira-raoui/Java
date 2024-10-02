import java.io.Serializable;

public class GestionReservation implements Serializable,Runnable {

    private Reservation reservation;

    public GestionReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public synchronized void reserver(Reservation reservation) {
        if (reservation.placesDisponible()) {
            System.out.println("Réservation effectuée avec succes  : " + reservation);
            reservation.decrementerCapacite();
            //System.out.println("le nombre des places restantantes pour le film " + reservation.getFilm().getNom_film() + " est " + reservation.getSalle().getCapacite());
        } else {
            System.out.println("Desole, il n'y a pas assez de places disponibles pour cette reservation du film " + reservation.getFilm().getNom_film());

        }
    }

    @Override
    public void run() {

        synchronized (reservation) {

            reserver(reservation);

        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

