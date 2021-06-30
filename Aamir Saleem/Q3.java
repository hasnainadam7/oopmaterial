import java.util.*;

class Student{

    // link for help of this problem : https://www.javatpoint.com/how-to-create-array-of-objects-in-java
    
    private String name;
    private int age;
    private String address;
    
    public Student() {

        this.name = "unknown";
        this.age = 0;
        this.address = "not available";
    }

    public void setInfo(String name, int age) {

        this.name = name;
        this.age = age;
    }
    
    public void setInfo(String name, int age, String address){      // this is called method overloading 

        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display(){

        System.out.println("Name of student = " + name + "\nage = " + age + "\naddress of student = " + address);
    }
    
}
 class PQ01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       //ClassName obj[] = new ClassName[array_length];     // declare and instantiate an array of objects

        Student std[] = new Student[10];    // 10 object made for 10 students in the form of arrays

        int i;
        for(i = 0; i < 10; i++){

            std[i] = new Student();     // creating 10 constructors of 10 objects which we created w.r.t Array
        }

        for(i = 0; i < 10; i++){        // Inputing Info for 10 students 

            System.out.println();
            System.out.println("Enter Info for Student \"" + (i+1) + "\"");
            System.out.print("Name >> ");
            String name = sc.nextLine();
            System.out.print("Age >> ");
            int age = sc.nextInt();
            sc.nextLine();      // consuming the leftover \n input 
            System.out.print("Address >> ");
            String address = sc.nextLine();

            std[i].setInfo(name, age, address);

        }

        System.out.println("\n");
        for(i = 0; i < std.length; i++){        // showing Info of students

            System.out.println("\n==== Info of Student \"" + (i+1) + "\" is ====");
            std[i].display();
        }

    }
}