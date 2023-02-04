public class Test1{

int arg=5;
Test1(){System.out.println("hi!, i am default constructor");

Test1(int arg){
this();
this.arg=arg;}
public static void  main(String[] args){
int arg=10;
Test1 obj = new Test1();
obj.myTest(arg);
System.out.println(arg);}}
