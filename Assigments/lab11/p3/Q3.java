/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hasnain
 */

 import java.util.ArrayList;
import java.util.Collections;
  public class Q3 {
  public static void main(String[] args) {
      //first array list name as arr1
   ArrayList<String> arr1= new ArrayList<String>();
          arr1.add("Fish");
          arr1.add("Birds");
          arr1.add("Animals");
          System.out.println("Array One " + arr1);
      //second array  list name as arr2
          ArrayList<String> arr2= new ArrayList<String>();
          arr2.add("Trees");
          arr2.add("Humans");
          arr2.add("Insects");

          System.out.println("Array two " + arr2);
         
     
        ArrayList<String> joinedArray = new ArrayList<String>();
        joinedArray.addAll(arr1);
        joinedArray.addAll(arr2);
        System.out.println("Joined Array " + joinedArray);
        

     }
}

