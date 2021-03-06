package agenor.houessou.projetcovoiture_houessou_monvoisin.objets.metier;
import android.content.Context;
import android.util.Log;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ville implements Serializable {
  private int id;
  private String nom;
  private int cp;

  public Ville(int id, String nom, Integer cp) {
    Log.d("ronan","new ville :"+id+nom);
    setId(id);
    setNom(nom);
    setCP(cp);
  }

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }

  public String getNom() {
    return nom;
  }
  public void setNom(String nom) {
    this.nom = nom;
  }


  public int getCP(){ return cp; }
  public void setCP(int cp) {
    this.cp = cp;
  }

}
