package org.example;
import java.sql.*;
import java.util.*;

public class InsertData {
    public static void main(String[] args) {

        ArrayList<String> searchHotel = new ArrayList<>();
        ArrayList<String> searchVilla = new ArrayList<>();
        ArrayList<String> searchAppart = new ArrayList<>();
        ArrayList<String> searchChalet = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Ou souhaitez-vous aller ?");
        String ville = sc.nextLine();

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/proyecto", "root", "root");

            //lire un élément de la bdd
            Statement stHotel = con.createStatement();
            ResultSet resHotel = stHotel.executeQuery("select * from Hotel");

            Statement stVilla = con.createStatement();
            ResultSet resVilla = stVilla.executeQuery("select * from Villa");

            Statement stAppart = con.createStatement();
            ResultSet resAppart = stAppart.executeQuery("select * from Appartement");

            Statement stChalet = con.createStatement();
            ResultSet resChalet = stChalet.executeQuery("select * from Chalet");

            //ajouter un élément dans la bdd
            //String query = "INSERT INTO Hotel (pays, ville, nom_hotel, nb_etoile) values ('usa','nyc','manhattan','5')";
            //PreparedStatement statement = con.prepareStatement(query);
            //statement.executeUpdate();


            //lire un élément de la bdd
            while(resHotel.next()){
                //System.out.println("Pays : " + resHotel.getString("pays"));
                if (resHotel.getString("Lieu").compareTo(ville)==0){
                    searchHotel.add(resHotel.getString("Nom"));
                }
                /*if (resHotel.getString("Nom").compareTo("...")==0){
                    searchHotel.add(resHotel.getString("Nom"));
                }
                if (resHotel.getString("NB_Etoile") == ...){
                    searchHotel.add(resHotel.getString("Nom"));
                }
                if (resHotel.getString("Petit-Dej") == ...){
                    searchHotel.add(resHotel.getString("Nom"));
                }
                if (resHotel.getString("Restaurant") == ...){
                    searchHotel.add(resHotel.getString("Nom"));
                }
                if (resHotel.getString("Type_Lit") == ...){
                    searchHotel.add(resHotel.getString("Nom"));
                }
                if (resHotel.getString("Marque").compareTo("...")==0){
                    searchHotel.add(resHotel.getString("Nom"));
                }
                if (resHotel.getString("NB_Pers") == ...){
                    searchHotel.add(resHotel.getString("Nom"));
                }
                if (resHotel.getString("Note_Client") == ...){
                    searchHotel.add(resHotel.getString("Nom"));
                }*/
            }

            while(resVilla.next()){
                //System.out.println("Pays : " + resHotel.getString("pays"));
                if (resVilla.getString("Lieu").compareTo(ville)==0){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                /*if (resVilla.getString("Nom").compareTo(...)==0){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("Prix") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("Piscine") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("NB_Chambre") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("NB_SDB") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("NB_Personne") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("Note_Client") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("Wifi") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("Climatisation") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("Fumeur") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("Animaux") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }
                if (resVilla.getString("Parking") == ...){
                    searchVilla.add(resVilla.getString("Nom"));
                }*/
            }

            while(resAppart.next()){
                //System.out.println("Pays : " + resHotel.getString("pays"));
                if (resAppart.getString("Lieu").compareTo(ville)==0){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                /*if (resAppart.getString("Nom").compareTo(...)==0){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                if (resAppart.getString("Prix") == ...){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                if (resAppart.getString("NB_Chambre") == ...){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                if (resAppart.getString("NB_SDB") == ...){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                if (resAppart.getString("NB_Personne") == ...){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                if (resAppart.getString("Note_Client") == ...){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                if (resAppart.getString("Wifi") == ...){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                if (resAppart.getString("Climatisation") == ...){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                if (resAppart.getString("Fumeur") == ...){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                if (resAppart.getString("Animaux") == ...){
                    searchAppart.add(resAppart.getString("Nom"));
                }
                if (resAppart.getString("Parking") == ...){
                    searchAppart.add(resAppart.getString("Nom"));
                }*/
            }

            while(resChalet.next()){
                //System.out.println("Pays : " + resHotel.getString("pays"));
                if (resChalet.getString("Lieu").compareTo(ville)==0){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                /*if (resChalet.getString("Nom").compareTo(ville)==0){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("Prix") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("Local_Ski") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("Cheminer") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("D_Chalet-Piste") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("NB_Chambre") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("NB_SDB") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("NB_Personne") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("Note_Client") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("Wifi") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("Climatisation") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("Fumeur") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("Animaux") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }
                if (resChalet.getString("Parking") == ...){
                    searchChalet.add(resChalet.getString("Nom"));
                }*/
            }

            con.close();

        } catch (Exception e){
            System.out.println("Error :" + e.getMessage());
        }

        System.out.println("Voici les hotels présents à "+ville+ " : ");
        for (String s : searchHotel) {
            System.out.println(s);
        }

        System.out.println("Voici les villas présentes à "+ville+ " : ");
        for (String s : searchVilla) {
            System.out.println(s);
        }

        System.out.println("Voici les appartements présents à "+ville+ " : ");
        for (String s : searchAppart) {
            System.out.println(s);
        }

        System.out.println("Voici les chalets présents à "+ville+ " : ");
        for (String s : searchChalet) {
            System.out.println(s);
        }

    }
}