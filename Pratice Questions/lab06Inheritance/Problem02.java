/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06Inheritance;

/**
 *
 * @author Hasnain
 */

  
class I{
  int i;
  public void printNum(){
    System.out.println(i);
  }
}

class J extends I{
  int j;
  public void printNum(){
    System.out.println(j);
  }
}

class Problem02{
  public static void main(String[] args){
    J a = new J();
    a.i = 5;
    a.j = 7;
    a.j = a.i;
    a.printNum();
  }
}


