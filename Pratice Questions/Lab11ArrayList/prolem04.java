/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author
 */
public class prolem04 {

    public void removeEvenLength(ArrayList<String> stringList) {
        for (int i = 0; i < stringList.size(); i++) {
            String word = stringList.get(i);
            if (word.length() % 2 == 0) {//even
                stringList.remove(word);//if it is even,test from the first word  then continue looping

            }
            System.out.println(stringList);

        }
    }

    public static void main(String args[]) {
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("AA");
        arraylist.add("ZZ");
        arraylist.add("CC");
        arraylist.add("FF");
        arraylist.add("AA");
        arraylist.add("ZZ");
        arraylist.add("CC");
        arraylist.add("FF");
        arraylist.add("AA");
        arraylist.add("ZZ");
        arraylist.add("CC");
        arraylist.add("FF");

        /*Unsorted List: ArrayList content before sorting*/
        System.out.println("Before Sorting:");
        for (String str : arraylist) {
            System.out.println(str);
        }

        /* Sorting in decreasing order*/
        Collections.sort(arraylist, Collections.reverseOrder());

        /* Sorted List in reverse order*/
        System.out.println("ArrayList in descending order:");
        for (String str : arraylist) {
            System.out.println(str);
        }
        prolem04 obj = new prolem04();

        obj.removeEvenLength(arraylist);
    }
}
