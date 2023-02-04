     
    import java.util.Scanner;
    public class Exp {
    
        int n1,n2,result;
        Scanner sc = new Scanner(System.in);
    
        void calculate(){
    
            
    
            System.out.println("Enter first number ");
            n1=sc.nextInt();
    
            System.out.println("Enter Second number ");
            n2=sc.nextInt();
    
            result = n1/n2;
            
            
            
            System.out.println("The Division is "+ result);
    
        }
        public static void main(String[] args) {
            Exp obj = new Exp();
            obj.calculate();
    
        }
    }
    

