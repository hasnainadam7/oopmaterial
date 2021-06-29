import java.io.*;
import java.util.*;
public class Filling {
    public void MethodWrite() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nYou have creating a new file type the name of file \nName :");
        String nameOfFile = sc.nextLine();
        String nameOfFileWithtxt = nameOfFile + ".txt";
        FileWriter files = new FileWriter(nameOfFileWithtxt);
        System.out.print("Type Your File Text : ");
        String txt = sc.nextLine();
        files.write(txt);
        files.close();
    }
    public void methodRead() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("You Have Succesfully Created A file \n for Read This File Type Name Again \nName: ");
        String nameOfFile = sc.nextLine();
        String nameOfFileWithtxt = nameOfFile + ".txt";
        FileReader files = new FileReader(nameOfFileWithtxt);
        Scanner scanner = new Scanner(files);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.print(line);
        }
        files.close();      
    }
    public static void main(String[] args) throws IOException {
        Filling objFile = new Filling();
        objFile.MethodWrite();
        objFile.methodRead();
    }
}