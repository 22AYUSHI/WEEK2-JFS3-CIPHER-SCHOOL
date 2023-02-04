import java.io.File;

public class File3{
public static void main(String[]args){
File f = new File("C:\Users\Lenovo\Desktop\test2.txt");
String[] files = f.list();
for(String file : files){
System.out.println(file);
}
File[] files_arr = f.listfiles();
for(File ff : files_arr){
ff.delete();}}}