class Engine {
    private String modelNumber;
    public Engine(){
        
    }
    public Engine(String modelNumber){
       this.modelNumber= modelNumber; 
    }
    public void start(){
        System.out.println("Start");
    }

    public void stop(){
        System.out.println("Stop");
    }
}
class Car{
    private int year;
    private String model;
    private float price;
    private String color;
    private Engine engine;
   public Car(){}
    public Car(int year,String model,float price,String color){
        this.year=year;
        this.model=model;
        this.price=price;
        this.color=color;
    }
    void displayInfo(){
        System.out.printf("Year :%d \nModel :%s \nPrice :%f \nColor:%s\n",year,model,price,color);
       }
    public void start(){
        System.out.println("Start");
    }
    public void stop(){
        System.out.println("Stop");
    }


}
class Screen{
    public static void main(String[] args){
        Car carObj = new Car(2021,"Euro3",32000000,"Black");
        carObj.start();
        carObj.displayInfo();
        carObj.stop();
        System.out.println("Engine");
        Engine engObj = new Engine("FX-20140-PX-2021");
        engObj.start();
        System.out.printf("Engine\n");
        engObj.stop();

    }
}