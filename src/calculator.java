import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        int result;
        while (true) {

            System.out.print("Enter the \noperation +,-,*,/,% & to Exit 'E' ");
            char op = num.next().charAt(0);
            if(op == '+' || op == '*' || op == '/' || op == '-' || op == '%'){
                System.out.print("Enter the numbers:");
                int a =num.nextInt();
                int b =num.nextInt();

                if(op=='+'){
                    result=a+b;
                    System.out.print("The result is:"+result);
                }
                if(op=='-'){
                    result=a-b;
                    System.out.print("The result is:"+result);
                }
                if(op=='*'){
                    result=a*b;
                    System.out.print("The result is:"+result);
                }
                if(op=='/'){
                    if (b==0){
                        System.out.print("Invalid operator");
                    }else {
                        result = a / b;
                        System.out.print("The result is:"+result);
                    }
                }
                if (op == '%'){
                    result=a%b;
                    System.out.print("The result is:"+result);
                }
            } else if (op=='E') {
                System.out.print("Exiting.....");
                break;
            }else {
                System.out.print("Invalid Operator");
            }
        }

    }
}
