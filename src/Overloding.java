import java.sql.SQLOutput;
import java.util.Scanner;

public class Overloding {
    public static void main(String[] args) {
       Scanner add=new Scanner(System.in);
       System.out.println("Enter the 2 numbers");
       int c=add.nextInt();
       int d=add.nextInt();
       int e=add(c,d);
       System.out.println("addition is:"+c);


       System.out.println("Enter the 3 numbers");
       int r=add.nextInt();
       int s=add.nextInt();
       int t=add.nextInt();
       int o=add(r,s,t);
       System.out.println("Addition is :"+o);
       System.out.println("Enter the name");
       String h=add.next();
       str(h);
    }
    static int add(int a,int b){
        return a+b;
    }
    static int add(int x,int y,int z){
        return x+y+z;
    }
    static void str(String name){
        System.out.println(name);
    }
}
