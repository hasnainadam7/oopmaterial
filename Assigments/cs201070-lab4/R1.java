/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r1;

/**
 *
 * @author
 */
public class R1 {

    private int leng; 
   private int breadth;
   static int v=0; 
    
    R1() {
        leng=0;
        breadth=0;
    }
    
    R1(int leng , int breadth) {
        this.leng=leng;
        this.breadth=breadth;
    } 
    
    public int getbength() {
        return leng;
    }
    
    public int getbreadth() {
        return breadth;
    }
    
    public void setlength(int newLength) {
        leng= newLength;
    }
    public void setbreadth(int newBreadth) {
        breadth= newBreadth;
    }
    
    static void heading() {
        System.out.println("-----------------------------");
        System.out.println("\tRectangle\t");
        System.out.println("-----------------------------"); 
    }
    public void display() {
        System.out.println("The length of the Rectangle is:"+leng);
        System.out.println("The breadth of the Rectangle is:"+breadth);
    }
    public static void main(String[] args) {
        heading();
        R1 obj1 = new R1(20,10);
        obj1.setlength(20);
        obj1.setbreadth(10);
        obj1.display();
        
    }
}
    
