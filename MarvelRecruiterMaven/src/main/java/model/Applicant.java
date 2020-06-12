package model;

import java.util.ArrayList;

public class Applicant {

  private String name = "";
  private String email = "";
  private String iq = "";
  private String beverage = "";
  private ArrayList<String> superPower = null;

  public Applicant() {
  }

  public Applicant(String name, String email, String iq, String beverage, ArrayList<String> superPower) {
    this.name = name;
    this.email = email;
    this.iq = iq;
    this.beverage = beverage;
    this.superPower = superPower;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getIq() {
    return iq;
  }

  public String getBeverage() {
    return beverage;
  }

  public ArrayList<String> getSuperPower() {
    return superPower;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setIq(String iq) {
    this.iq = iq;
  }

  public void setBeverage(String beverage) {
    this.beverage = beverage;
  }

  public void setSuperPower(ArrayList<String> superPower) {
    this.superPower = superPower;
  }

  public final int getScore() {
    int score = 0;
    if (iq.equals("Less Than 120")) {
      score += 15;
    } else if (iq.equals("121 to 150")) {
      score += 30;
    } else if (iq.equals("151 to 180")) {
      score += 45;
    } else if (iq.equals("Greater than 180")) {
      score += 60;
    }
    switch (beverage) {
      case "Water":
        score += 5;
      case "Juice":
        score += 5;
      case "Cola":
        score += 5;
      case "Beer":
        score += 5;
      case "Wine":
        score += 5;
    }
    score += (superPower == null ? 0 : superPower.size() * 5);
    return score;
  }

  @Override
  public String toString() {
    return "Applicant Name: " + name + "\nEmail: " + email + "\nIQ: " + iq
      + "\nFavorite Beverage: " + beverage + "\nSuper Power: " + superPower + "\nScore: " + getScore() + "\n\n";
  }

}
