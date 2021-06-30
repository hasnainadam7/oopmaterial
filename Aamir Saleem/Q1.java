public class Test {
    int i;
    
    void printNum(){
        System.out.println("Value of i "+i);    
    }
}
class B extends Test{
    int j;
    void printNum(){
        System.out.println("Value of j "+j);    
    }
}
class Derive{
    public static void main(String[] args) {
        B obj = new B();
        
        obj.i = 4;
        obj.j = 5;
        
        obj.printNum();
    }
}