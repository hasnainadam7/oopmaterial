 class Info {
    private String name;
    private int age;
    
//        Info(String Name,int age){
//            this.name = name;
//            this.age = age;
//        }
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name; 
    }
    public void setAge(int age){
        this.age = age;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class TestClass{    
 public static void main(String[] args) {
//         Info obj = new Info("Ali",22);
//         obj.display();
     //obj.display();
     Info obj = new Info();
     obj.setName("ALI");
     obj.setAge(22);
     
     System.out.println("Name: "+obj.getName());
     System.out.println("Name: "+obj.getAge());
     
     

     
 }

}