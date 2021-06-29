/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11ArrayList;

/**
 *
 * @author 
 */
    import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Problem03 {
    




 public static void main(String[] args) {
    LinkedList<String> linkedlist = new LinkedList<String>();
    linkedlist.add("Harry");
    linkedlist.add("Jack");
    linkedlist.add("Tim");
    linkedlist.add("Rick");
    linkedlist.add("Rock");

    List<String> list = new ArrayList<String>(linkedlist);

    for (String str : list){
      System.out.println(str);
    }
 
 }

 
}
