package yeray.priede.proyecto_nevera;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

public class Producte {
    String nom;
    String descripcio;
    double preu;
    Date data;

    //<editor-fold desc="Constructor">
    public Producte(String nom, String descripcio, double preu, Date data) {
        this.nom = nom;
        this.descripcio = descripcio;
        this.preu = preu;
        this.data = data;
    }
    public Producte() {
    }
    //</editor-fold>

    //constructors getter i setter
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public double getPreu() {
        return preu;
    }

    public void setData() {
        this.data = data;
    }

    public Date getData() {
        return data;
    }



    //retorna un string separat per ;
    public String toString() {

        return nom + ";" + descripcio + ";" + preu + ";" + data;
    }

    public String afegirProducte(String nom, String descripcio, double preu, Date data) {
        Producte producte = new Producte();

    }
    public void guardarProducteEnFitxer() throws IOException {
        file.escriuFitxerText(fitxer, this.toString(), true);


    }


}
