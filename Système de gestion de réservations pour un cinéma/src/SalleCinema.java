
import java.io.Serializable;

public class SalleCinema implements Serializable {

    private int numero;
    public int capacite;


    public SalleCinema(int numero, int nombre_places) {
        this.numero = numero;
        this.capacite = nombre_places;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacite() {
        return capacite;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCapacite(int nombre_places) {
        this.capacite = nombre_places;
    }

    @Override
    public String toString() {
        return "SalleCinema{" +
                "numero=" + numero +
                ", nombre_places=" + capacite +
                '}';
    }
}
