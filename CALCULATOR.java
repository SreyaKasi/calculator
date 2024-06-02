import java.util.Scanner;
public class CALCULATOR {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num1,num2,result=0;
               System.out.println("enter first number: ");
        num1=s.nextInt();
        System.out.println("enter second number: ");
        num2=s.nextInt();
        System.out.println("select Operator(+,-,*,/): ");
        char Operator=s.next().charAt(0);
        
            switch (Operator)
    {
            case'+':
            result=num1+num2;
            break;
            case'-':
            result=num1-num2;
            break;
            case'*':
            result=num1*num2;
            break;
            case'/':
            result=num1/num2;
            break;
            default:
            System.out.println("Invalid operator");
            s.close();
            return;
            
        }        
            System.out.println("RESULT: " + result);
        s.close();

    
                         
    }
}

    


