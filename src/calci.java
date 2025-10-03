import java.util.Scanner;

public class calci {

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        while (true){
            System.out.println("Enter your choice \t\n1]+\t\n2]-\t\n3]*\t\n4]/\t\n5]%");
            int ch = op.nextInt();

            switch (ch) {
                case 1:
                    add();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    module();
                    break;
                default:
                    break;
            }

        }
    }
    static int add(){
        Scanner opt = new Scanner(System.in);
        System.out.println("Enter Num 1");
        int a = opt.nextInt();
        System.out.println("Enter Num 2");
        int b=opt.nextInt();
        int addition=a+b;
        System.out.println("addition:"+addition);
        return 0;
    }
    static int sub(){
        Scanner opt = new Scanner(System.in);
        System.out.println("Enter Num 1");
        int a = opt.nextInt();
        System.out.println("Enter Num 2");
        int b=opt.nextInt();
        int subt=a-b;
        System.out.println("Subtraction:"+subt);
        return 0;
    }
    static int multiply() {
        Scanner opt = new Scanner(System.in);
        System.out.println("Enter Num 1");
        int a = opt.nextInt();
        System.out.println("Enter Num 2");
        int b = opt.nextInt();
        int multiply = a * b;
        System.out.println("Multiplication:" + multiply);
        return 0;
    }
    static int divide() {
        Scanner opt = new Scanner(System.in);
        System.out.println("Enter Num 1");
        int a = opt.nextInt();
        System.out.println("Enter Num 2");
        int b = opt.nextInt();
        if (b == 0) {
            System.out.println("B should not be zero");
        } else {
            int div = a / b;
            System.out.println("Division:" + div);
        }
        return 0;
    }
    static int module() {
        Scanner opt = new Scanner(System.in);
        System.out.println("Enter Num 1");
        int a = opt.nextInt();
        System.out.println("Enter Num 2");
        int b = opt.nextInt();
        int module = a % b;
        System.out.println("Modulus:" + module);
        return 0;
    }
}
