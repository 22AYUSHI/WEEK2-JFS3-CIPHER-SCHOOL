public class exp3 {
    int getNextNo(int n) {
        try{
            
        if (n==5){
            return n+1;
        }   
        }
        finally {
        System.out.println("This is Important CODE");
        }
        return n-1;
    }
    public static void main(String[] args) {
        exp3 obj =new exp3();
        System.out.println(obj.getNextNo(5));  
    }
}
