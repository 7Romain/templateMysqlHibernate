package org.example;
import javax.persistence.*;

@Entity
@NamedQuery(name="trouverVille", query="SELECT immeu FROM Immeuble immeu where immeu.ville = :ville AND immeu.noimm = :numImm ")
public class Immeuble {

    @Id

    private String noimm;
    private String adresse;
    private  String ville;


    public String getNoimm() {
        return noimm;
    }

    public void setNoimm(String noimm) {
        this.noimm = noimm;
    }

    public  String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Immeuble+++{" +
                "noimm='" + noimm + '\'' +
                ", adresse='" + adresse + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
