/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10Expection;

/**
 *
 * @author 
 */
//no error it will genrate x's value 101
public class Excercise2 {

  private int x = 101;

  private void f(int x) {
    x++;
    g();
  }

  private void g() {
    System.out.println(x);
  }

  public static void main(String[] args) {
    Excercise2 e = new Excercise2();
    int x = 200;
    e.f(x);
  }
}