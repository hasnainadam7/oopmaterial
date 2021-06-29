/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10Expection;

/**
 *
 * @author Hasnain
 */   
import java.io.*;
import java.util.Scanner;
//throwsIOException is missing so i add it and this is compilation error
public class Ex4 {


  public static void main(String[] args) throws IOException {
    int n=10;
    int[] v = new int[n];
    FileReader f = new FileReader("dati.txt");
    BufferedReader in = new BufferedReader(f);
    int i=0;
    String linea = in.readLine();
    while (linea!=null) {
      v[i] = Integer.parseInt(linea);
      linea = in.readLine();
      i++;
    }
    f.close();
  }
}

