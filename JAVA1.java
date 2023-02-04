import java.io.file;
public class Test1{
public static void main(Stirng[] args){
File f= new File("C:\Users\Lenovo\Desktop\test3.txt");
if(f.exists()){
System.out.println("printing file details");
System.out.println("---------------------");
System.out.println("file name"+f.Name());
System.out.println("file size" +f.length());
System.out.println("file path"+f.getAbsolutePATH());
System.out.println("IS FILE READABLE ?"+f.canread());
System.out.println("IS FILE writeABLE ?"+f.canwrite());
System.out.println('----------------------------");
}
File f1 =new File("C:\Users\Lenovo\Desktop\test2.txt");
f1.mkdir();}}
