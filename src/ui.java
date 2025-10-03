import java.util.Scanner;

public class ui {
    public static void main(String[] args) {
        Scanner day=new Scanner(System.in);
        int num=day.nextInt();
        switch (num){
            case 1 -> System.out.println("Monday");

            case 2 ->System.out.println("Tuesday");

            case 3 ->System.out.println("Wenesday");

            case 4 ->System.out.println("Thusday");

            case 5 -> System.out.println("Friday");

            case 6 ->System.out.println("Saturday");

            case 7 ->System.out.println("Sunday");

        }
    }
}

