class Parent{
    public void parentMethod(){
      System.out.println("This is parent class");
    }
  }
  
  class Child extends Parent{
    public void childMethod(){
      System.out.println("This is child class");
    }
  }
  
  class Screen{
    public static void main(String[] args){
      Parent m = new Child();
      Child n = new Child();
      m.parentMethod();
      n.childMethod();
      n.parentMethod();
    }
  }