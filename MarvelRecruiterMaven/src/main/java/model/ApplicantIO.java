package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApplicantIO {

  public static void writeToFile(Applicant applicant, String path) {
    File file = new File(path);
    try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file, true)))) {
      writer.println(applicant.toString());
    } catch (IOException ex) {
      Logger.getLogger(ApplicantIO.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
