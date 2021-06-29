/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time1;

/**
 *
 * @author 
 */
public class Time1 {
private int hour=0;
    private int minute=0;
    private int second=0;
    
   Time1(int h, int m , int s) {
       hour=h;
       minute=m;
       second=s;
   }
   public int getHour() {
       return hour;
   }
   public int getMinute() {
       return minute;
   }
   public int  getSecond() {
       return second;
   }
   public void setHour(int newHour){
       hour=newHour;
   }
   public void setMinute(int newMinute){
       minute=newMinute;
   }
   public void setSecond(int newSecond){
       second=newSecond;
   }
   public static void main(String[] args) {
       Time1 o1 = new Time1(7,01,17);
       o1.setHour(7);
       o1.setMinute(01);
       o1.setSecond(17);
       System.out.print("Time:"+o1.getHour());
       System.out.print(":0"+o1.getMinute());
       System.out.print(":"+o1.getSecond());
       
   }
}

   
   