class Bank {
    int getBalance(){
        return 0;
    }
}    
    class BankA extends Bank{
       @Override
       int getBalance(){
           return 1000;
       }
    }
    class BankB extends Bank{
       @Override
       int getBalance(){
           return 1500;
       }
    }
    class BankC extends Bank{
        @Override
        int getBalance(){
            return 2500;
        }
    }
class Display{        
    public static void main(String[] args){
       BankA b1 = new BankA();
       BankB b2 = new BankB();
       BankC b3 = new BankC();
       System.out.println("BankA:\nYour Balance=$"+b1.getBalance());
       System.out.println("BankB:\nYour Balance=$"+b2.getBalance());
       System.out.println("BankC:\nYour Balance=$"+b3.getBalance());
       
    }
}