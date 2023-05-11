package yeray.priede.proyecto_nevera;

public class Producte {
    String nom;
    String descripcio;
    double preu;

    public Producte(String nom, String descripcio, double preu) {
        this.nom = nom;
        this.descripcio = descripcio;
        this.preu = preu;
    }

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

    public Producte() {
    }


//    public String afegirProducte(String nom,String descripcio, double preu){
//
//
//            Producte producte = new Producte(nom,descripcio,preu);
//
//        }

    }
