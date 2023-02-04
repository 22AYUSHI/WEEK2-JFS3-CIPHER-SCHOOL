import java.io.FileWriter;
import java.io.IOException;

public class Test2{
public static void main(String[] args) throws IOException{

FileWriter fw = new FileWriter("C:\Users\Lenovo\Desktop\test2.txt",true);
fw.write("I am the earth \n");
fw.write("I am the forest green \n");
fw.write("I am Four winds blowing \n");
fw.write(" i am the earth \n");
fw.clears();
fw.close();
System.out.println("file prepared successfully");}
}