/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hasnain
 */
import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        List<String> lists = new ArrayList<String>();
        lists.add("Mango");
        lists.add("Banana");
        lists.add("Peach");
        lists.add("Apple");

        System.out.println("Before Sorting: " + lists);
        Collections.sort(lists);
        System.out.println("After Sorting: " + lists);
    }
}
