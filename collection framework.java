mport java.util.LinkedList;
public class Test0{
public static void main(String[] args){
// LinkedList (Collection Framework)
LinkedList myll = new LinkedList();
myll.add("Ironman");
myll.add("Thor");
myll.add("Hulk");
myll.add("Loki");

//  System.out.println(myll.get(1));
 myll.addLast("Gamora");
myll.addFirst("Antman");
myll.add(2,"Natasha");

iterator it = myll.iterator();

while(it.hasNext()) {
// it.remove();
System.out.println(it.next());
}
System.out.println("-----------");
System.out.println("whos at the top "+myll.peek());
System.out.println("hey first one get out "+myll.poll());

System.out.println("whos their standing at the last ! "+myll.pop());
 it = myll.iterator();

while(it.hasNext()) {
// it.remove();
System.out.println(it.next());

}
}
}