import java.io.BufferedReader;
import java.io.FileReader;
public class Test0{
public static void main(String[] args) throws Exception{
FileReader fr = new FileReader("C:\Users\Lenovo\Desktop\test3.txt");
BufferReader br = new BufferReader(fr);
String line;

ArrayList<String> pokemons = new ArrayList<String>();
br.readLine();
while(line = br.readline()!=null){
System.out.println(line);
pokemons.add(line);}
System.out.println("Total pokemons"+ pokemons.size());

ArrayList<String> pokemonTitles = new ArrayList<String>();
for(String pok : pokemons){
String title = pok.split(",")[0];
pokemonsTitles.add(title);}

System.out.println(pokemonTitles);
br.close();
fr.close();
