package AbstractionAndInterferance;
abstract class Bank{

   public abstract void getBalance();

}

class BankA extends Bank{

   public void getBalance(){ System.out.println("Deposited Balance is = $100"); }

}

//Written and logic by Avtar Singh (Singha2k2)

class BankB extends Bank{

   public void getBalance(){ System.out.println("Deposited Balance is = $150"); }

}

class BankC extends Bank{

    public void getBalance(){ System.out.println("Deposited Balance is = $200"); }

}

class Problem03{

public static void main(String[] args){

   BankA Balance1 = new BankA();

   Balance1.getBalance();

   BankB Balance2 = new BankB();

   Balance2.getBalance();

   BankC Balance3 = new BankC();

   Balance3.getBalance();

   }

}