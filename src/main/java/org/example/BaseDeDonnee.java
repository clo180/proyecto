package org.example;
import java.sql.*;
import java.util.*;
public class BaseDeDonnee {
    String type_Logement;

    public void ajouterTable() {
        String url = "jdbc:mysql://localhost:3306/projet";
        String user = "root";
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            Statement stmt = conn.createStatement();
            Scanner sc = new Scanner(System.in);

            System.out.println("Saisissez le nom de la nouvelle table : ");
            String titre = sc.nextLine();

            System.out.print("Saisissez le nombre de colonnes de la nouvelle table : ");
            int nbColonnes = sc.nextInt();
            sc.nextLine();

            String sql = "CREATE TABLE " + titre + " (";
            for (int i = 0; i < nbColonnes; i++) {
                System.out.print("Saisissez le titre de la colonne " + (i + 1) + " : ");

                if (i != 0)
                    sc.nextLine();

                String titreColonne = sc.nextLine();
                System.out.println("Quel est le type de donnée que vous allez stocker ? ");
                System.out.println("1. Booléen");
                System.out.println("2. Entier");
                System.out.println("3. Réel");
                System.out.println("4. Chaine de caractères");
                int choix = sc.nextInt();

                switch (choix) {
                    case 1:
                        sql += titreColonne + " " + "BOOLEAN" + ",";
                        break;

                    case 2:
                        sql += titreColonne + " " + "INT" + ",";
                        break;

                    case 3:
                        sql += titreColonne + " " + "FLOAT" + ",";
                        break;

                    case 4:
                        sql += titreColonne + " " + "VARCHAR(50)" + ",";
                        break;
                }
            }
            sql = sql.substring(0, sql.length() - 1) + ")";

            stmt.executeUpdate(sql);

            System.out.println("Table créée !");

            conn.close();
        } catch (Exception e) {
            System.err.println("Exception relevée... ");
            System.err.println(e.getMessage());
        }
    }

    public void supprimerTable() {
        String url = "jdbc:mysql://localhost:3306/projet";
        String user = "root";
        String password = "root";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            Scanner sc = new Scanner(System.in);

            System.out.println("Saisissez le nom de la table à supprimer : ");
            String titre = sc.nextLine();

            String sql = "DROP TABLE " + titre + " ";
            stmt.executeUpdate(sql);

            System.out.println("Table supprimée.");

            conn.close();
        } catch (Exception e) {
            System.err.println("Exception relevée...");
            System.err.println(e.getMessage());
        }
    }
    public void ajouterLigne() {
        String url = "jdbc:mysql://localhost:3306/projet ";
        String user = "root";
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            Scanner sc = new Scanner(System.in);
            String query = "INSERT INTO villa (piscine, distanceMer, prix) VALUES (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(query);

            System.out.println("Quel est le type de logement que vous allez creer ? ");
            System.out.println("1. Hotel");
            System.out.println("2. Appartement");
            System.out.println("3. Chalet");
            System.out.println("4. Villa");
            System.out.println("5. Maison");
            int choix = sc.nextInt();

            switch (choix) {
                case 1:

                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    System.out.println("Vous avez choisi d'ajouter une Villa");
                    System.out.println("Saisir true si il y a une piscine / false si il n'y en a pas");
                    boolean piscine = sc.nextBoolean();
                    System.out.println("Saisir la distance de la mer (int)");
                    int distanceMer = sc.nextInt();
                    System.out.println("Saisir le prix (float)");
                    float prix = sc.nextFloat();
                    statement.setBoolean(1, piscine);
                    statement.setInt(2, distanceMer);
                    statement.setFloat(3, prix);
                    statement.executeUpdate();
                    break;
            }
            System.out.println("ligne ajouter.");
            conn.close();
        } catch (Exception e) {
            System.err.println("Exception relevée...");
            System.err.println(e.getMessage());
        }
    }
}

