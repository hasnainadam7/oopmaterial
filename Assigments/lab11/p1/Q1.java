/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hasnain
 */

   import java.util.LinkedList;
import java.util.Iterator;
  public class Q1 {
  public static void main(String[] args) {
   //NULL LINK LIST
     LinkedList<String> LINKLIST = new LinkedList<String>();
   //Add method for filling linklist
          LINKLIST.add("Tometo");
          LINKLIST.add("Ketch-up");
          LINKLIST.add("Poteto");
          LINKLIST.add("Mioniese");
          LINKLIST.add("Oil");
          LINKLIST.add("GreenSauce");
          System.out.println("Original linked list:" + LINKLIST);  
 
    Iterator it = LINKLIST.descendingIterator();
     System.out.println("Elements in Reverse Order:");
     while (it.hasNext()) {
        System.out.println(it.next());
     }
  }
} 

