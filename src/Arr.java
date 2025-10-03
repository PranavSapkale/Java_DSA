import java.util.Arrays;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        //defined scanner
        Scanner a=new Scanner(System.in);

//        taking length of array
        System.out.println("Enter the length of Arrray");
        int r=a.nextInt();

        //declaring length of array
        int[] array=new int[r];

        //taking inputs
        System.out.println("Enter the Elements");
        for (int k=0;k<r;k++){
             array[k]=a.nextInt();
        }

        //printing elements in the array

            System.out.println( Arrays.toString(array) );

        for (int k:array){
            System.out.print(k+" ");
        }

    }
}
