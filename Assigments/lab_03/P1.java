import java.util.*;

public class P1 {
    String acNo;
     String holder;
     String balance;
     String person;

    P1(String a, String b, String c, String d) {
        acNo = a;
        holder = b;
        balance = c;
        person = d;
    }

   
    
    
    
    

    void Credit() {
        System.out.println("\n \n Person name : " + person);       
        System.out.println("Your Bank account Number is :" +acNo);
        System.out.println("Account Holder name is :" + holder);
        System.out.println("Your current Balance is  : " + balance);
    }
    public static void main(String[] args) {
        P1 person1 = new P1("Habib Bank Limited account 1","M.Hasnain","700,322.00","1");
        P1 person2 = new P1("Habib Bank Limited account 2","M.Haseeb","400,322.00","2");
        P1 person3 = new P1("Habib Bank Limited account 3","M.Hammad","1200,322.00","3");
    person1.Credit();
    person2.Credit();
    person3.Credit();
}}