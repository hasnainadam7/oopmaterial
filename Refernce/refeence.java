package com.mycompany.exampractice;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
//abstract class
abstract class School {
   abstract void Attendance();
    abstract void Study();
        
    abstract void Exam();
        
}
//inheritance and Overidding Method
class Student1 extends School{
    private String name;
    private String RollNo;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public String getRollNo(){
        return RollNo;
    }
    public void setRollNo(String roll){
        RollNo = roll;
    }
   
    @Override
    void Attendance(){
         System.out.println("Name of Student1:"+name+"\nRollNo:"+RollNo);
       System.out.println("Im present"); 
    }
    
    @Override
    void Study(){
        System.out.println("We are studying"); 
    }
    @Override
    void Exam(){
        System.out.println("Giving exams"); 
    }
}
class Student2 extends School{
    private String name;
    private String RollNo;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public String getRollNo(){
        return RollNo;
    }
    public void setRollNo(String roll){
        RollNo = roll;
    }
   
    @Override
    void Attendance(){
         System.out.println("Name of Student2:"+name+"\nRollNo:"+RollNo);
       System.out.println("Im present"); 
    }
    
    @Override
    void Study(){
        System.out.println("We are studying"); 
    }
    @Override
    void Exam(){
        System.out.println("Giving exams"); 
    }
}
class Student3 extends School{
    //Encapsulation
    private String name;
    private String RollNo;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public String getRollNo(){
        return RollNo;
    }
    public void setRollNo(String roll){
        RollNo = roll;
    }
   
    @Override
    void Attendance(){
         System.out.println("Name of Student3:"+name+"\nRollNo:"+RollNo);
       System.out.println("Im present"); 
    }
    
    @Override
    void Study(){
        System.out.println("We are studying"); 
    }
    @Override
    void Exam(){
        System.out.println("Giving exams"); 
    }
}
class Student4 extends School{
    private String name;
    private String RollNo;
    public String getName(){
        return name;
    }
   public void setName(String n){
       name = n;
    }
    public String getRollNo(){
        return RollNo;
    }
    public void setRollNo(String roll){
        RollNo = roll;
    }
   
    @Override
    void Attendance(){
         System.out.println("Name of Student4:"+name+"\nRollNo:"+RollNo);
       System.out.println("Im present"); 
    }
    
    @Override
    void Study(){
        System.out.println("We are studying"); 
    }
    @Override
    void Exam(){
        System.out.println("Giving exams"); 
    }
}
class Principal{
    void Details() throws IOException{
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Institute Name:");
        String name1 = s1.nextLine();
        System.out.println("Enter Principal's name:");
        String name2 = s1.nextLine();
        System.out.println("Name of Institue:"+name1);
        System.out.println("Name of Principal:"+name2);
        //Filling
         FileWriter f2 = new FileWriter("InstituteRecords.txt");
         f2.write("Institute Name:"+name1);
         f2.write("\nPrincipal's Name:"+name2);
         f2.close();
         
         FileReader f1 = new FileReader("InstituteRecords.txt");
        int data;
        while((data=f1.read())!=-1){
            System.out.print((char)data);
        }
        f1.close();
        System.out.println();
    }
}
class Staff{
    //Association
    Principal p;
    Staff(Principal p){
        this.p=p;
    }
    void Display() throws IOException{
        p.Details();
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter total number of staffs:");
        String quantity = s1.nextLine();
        System.out.println("Total Number of Staff:"+quantity);

    FileWriter f1 = new FileWriter("StaffsRecord.txt");
    f1.write("No of Staff:"+quantity);
    f1.close();
    FileReader f2 = new FileReader("StaffsRecord.txt");
        int data;
        while((data=f2.read())!=-1){
            System.out.print((char)data);
        }
        f2.close();
        System.out.println();
    }
}
class Test {
    public static void main(String[] args) throws IOException{
        
         Principal p = new Principal();
         Staff st = new Staff(p);
         st.Display();
        Student1 s1 = new Student1();
        s1.setName("hassan");
        s1.setRollNo("2010");
        s1.Attendance();
        s1.Exam();
        s1.Study();
        Student2 s2 = new Student2();
        s2.setName("ali");
        s2.setRollNo("2011");
        s2.Attendance();
        s2.Exam();
        s2.Study();
        Student3 s3 = new Student3();
        s3.setName("Bilal");
        s3.setRollNo("2012");
        s3.Attendance();
        s3.Exam();
        s3.Study();
        Student4 s4 = new Student4();
        s4.setName("Ahmed");
        s4.setRollNo("2013");
        s4.Attendance();
        s4.Exam();
        s4.Study();
    }
}