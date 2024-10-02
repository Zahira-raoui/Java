import java.io.Serializable;

public class Reservation implements Serializable {

    private Film film;
    private SalleCinema salle;
    private String date;
    private int nombrePlaces_souhaite;



    public Reservation(Film film, SalleCinema salle, String date,int nombrePlaces_souhaite) {
        this.film = film;
        this.salle = salle;
        this.date = String.valueOf(date);
        this.nombrePlaces_souhaite=nombrePlaces_souhaite;

    }

    //verifier si reste des places disponibles ou pas apres la reservation
    public boolean placesDisponible(){
        return this.salle.getCapacite() - this.nombrePlaces_souhaite >=0;

    }

     //pour decrementer la capacite des salles selon le nombre reservees
    public  void decrementerCapacite() {
        salle.setCapacite(salle.getCapacite() - nombrePlaces_souhaite);
        if (salle.getCapacite() < 0) {
            salle.setCapacite(0);//pour assurer que la capacite ne devient pas negative
        }
    }

    public Film getFilm() {
        return film;
    }

    public SalleCinema getSalle() {
        return salle;
    }

    public String getDate() {
        return date;
    }

    public int getNombrePlaces_souhaite() {
        return nombrePlaces_souhaite;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public void setSalle(SalleCinema salle) {
        this.salle = salle;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setNombrePlaces_souhaite(int nombrePlaces_souhaite) {
        this.nombrePlaces_souhaite = nombrePlaces_souhaite;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "film=" + film +
                ", salle=" + salle +
                ", date='" + date + '\'' +
                '}';
    }

}
