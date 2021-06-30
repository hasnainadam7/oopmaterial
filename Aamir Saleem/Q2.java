class Accessor_Mutators_Examples {
    int x;
    int y;
    int z;
    
    Accessor_Mutators_Examples(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    public void setx(int a){
       x = a;
    }
    public void sety(int b){
       y = b;
    }
    int calculate(){
        z = x+y;
        return z; 
    }
}
class Test1{
    public static void main(String[] args) {
        Accessor_Mutators_Examples obj = new Accessor_Mutators_Examples(4,6);
        System.out.println(obj.calculate());
                
    }


}