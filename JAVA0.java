import java.io.File;
public class Test0{
public static void main(String[] args){
File f = new File("C:\Users\Lenovo\Desktop\test3.txt");
try{
f.createNewFile();}
catch(IOException e){
e.printStackTrace();}
System.out.println("FILE CREATED SUCCESSFULLY");}}