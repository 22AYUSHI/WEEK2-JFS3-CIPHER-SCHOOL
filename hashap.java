import java.util.hashset;
public class Test3 {
public static void main(String[] args){
// HashSet
HashSet myset = new HashSet();
myset.add("green");
myset.add("red");
myset.add("orange");
myset.add("red");
myset.add("orange");

System.out.println(myset);
LinkedHashSet lhs = new LinkedHashSet();
lhs.add("green");
lhs.add("red");
lhs.add("orange");
lhs.add("red");
lhs.add("orange");
System.out.println(lhs);


TreeSet ts = new TreeSet();
// treeset doesnt allows nulls
// trreset sorts the data in ascending order
 ts.add("Cat");
ts.add("Apple");
ts.add("null");
System.out.println(ts);
}
}