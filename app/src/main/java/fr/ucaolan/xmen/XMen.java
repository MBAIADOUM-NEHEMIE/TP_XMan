package fr.ucaolan.xmen;

import androidx.annotation.DrawableRes;

import fr.ucaolan.xmentp6.R;

public class XMen {
    // variables représentant les informations
    private String nom;
    private String alias;
    private String description;
    private String pouvoirs ;
    // TODO ajouter les champs maquants : alias ....
    private @DrawableRes int idImage;

    // constructeur sans paramètre
    public XMen(){
        nom = "inconnu";
        alias  = "inconnu";
        description = "inconnu";
        pouvoirs = "inconnu";
        this.idImage= R.drawable.undef;
    }

    public XMen(String nom, String alias, String description, String pouvoirs, @DrawableRes int idImage) {
        this.nom = nom;
        this.alias = alias;
        this.description = description;
        this.pouvoirs = pouvoirs;
        this.idImage = idImage;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPouvoirs() {
        return pouvoirs;
    }

    public void setPouvoirs(String pouvoirs) {
        this.pouvoirs = pouvoirs;
    }

    public @DrawableRes int getIdImage() {
         return  idImage;
    }

    public void setIdImage( @DrawableRes int idImage) {
        this.idImage = idImage;
    }
}
