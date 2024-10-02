import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //sauvegarder les réservations dans un fichier

    public static void souvegarder_reservation(ArrayList<Reservation> reservations){
        try{
            String desktopPath = System.getProperty("user.home") + "/Desktop/";
            String sourceFilePath = desktopPath+"reservation.ser";
            FileOutputStream fileout=new FileOutputStream(sourceFilePath);
            ObjectOutput out=new ObjectOutputStream(fileout);
            out.writeObject(reservations);
            System.out.println("Les reservations ont été sauvegardées avec succès.");
            out.close();
            fileout.close();
        }catch (IOException e){
            System.err.println("Erreur lors de la sauvegarde des réservations : "+e);

        }
    }

    //charger les reservations
    public static List<Reservation> chargerReservations(){
        ArrayList<Reservation> reservations=new ArrayList<>();

        try {
            String desktopPath = System.getProperty("user.home") + "/Desktop/";
            String distanFilePath = desktopPath+"reservation.ser";
            FileInputStream fileInput=new FileInputStream(distanFilePath);
            ObjectInputStream Input=new ObjectInputStream(fileInput);
            reservations= (ArrayList<Reservation>) Input.readObject();
            System.out.println("chargement des réservations avec succes : ");
            for (Reservation reservation : reservations) {
                System.out.println(reservation);
            }

        }catch (IOException | ClassNotFoundException e){
            System.err.println("Erreur lors du chargement des réservations : "+e);
        }
        return reservations;
    }



    public static void main(String[] args) {
        //reserver pour un film
        Realisateur realisateur=new Realisateur("Makoto Shinkai",2002);//le realisateur du film
        Film film1=new Film("your name",realisateur,2020,"action");
        SalleCinema salleCinema1=new SalleCinema(10,30);
        Reservation reservation1=new Reservation(film1,salleCinema1,"11/11/2023",4);
        GestionReservation gestionReservation1=new GestionReservation(reservation1);
        Thread thread1=new Thread(gestionReservation1);

        //deux reservations pour le meme film
        Film film2=new Film("hope",realisateur,2018,"drama");
        SalleCinema salleCinema2=new SalleCinema(5,40);
        Reservation reservation2=new Reservation(film2,salleCinema2,"23/12/2023",8);
        Reservation reservation3=new Reservation(film2,salleCinema2,"23/12/2023",8);
        GestionReservation gestionReservation2=new GestionReservation(reservation2);
        GestionReservation gestionReservation3=new GestionReservation(reservation3);
        Thread thread2=new Thread(gestionReservation2);
        Thread thread3=new Thread(gestionReservation3);

        //reserver un nombre des places superieure a la capacite de la salle
        Film film3=new Film("call me",realisateur,2019,"action");
        SalleCinema salleCinema4=new SalleCinema(1,20);
        Reservation reservation4=new Reservation(film3,salleCinema4,"11/01/2023",22);
        GestionReservation gestionReservation4=new GestionReservation(reservation4);
        Thread thread4=new Thread(gestionReservation4);


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        ArrayList<Reservation> toutesLesReservations = new ArrayList<>();
        // Sauvegarde des réservations dans un fichier et les charger dans le console
        toutesLesReservations.add(reservation1);
        toutesLesReservations.add(reservation2);
        toutesLesReservations.add(reservation3);
        Main.souvegarder_reservation(toutesLesReservations);
        Main.chargerReservations();



    }
}
